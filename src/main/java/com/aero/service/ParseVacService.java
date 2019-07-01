package com.aero.service;

import com.aero.dao.AirportParsedDao;
import com.aero.dao.AirportTMPDao;
import com.aero.models.AirportParsedEntity;
import com.aero.models.AirportTMPEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("parseVacService")
@Transactional
public class ParseVacService {

    @Autowired
    private AirportTMPDao airportTMPDao;

    @Autowired
    private AirportParsedDao airportParsedDao;

    public void parseVac(){
        List<AirportTMPEntity> airportList = airportTMPDao.getAll();

        for (AirportTMPEntity airportTmp: airportList){

            // TODO parse the data in each page
            AirportParsedEntity parsedAirport = new AirportParsedEntity();
            parsedAirport.setCodeOaci(airportTmp.getCodeOaci());

            parsedAirport.setLocation(parseText(1,"1 - Situation / Location :", airportTmp));
            parsedAirport.setAts(parseText(2,"2 - ATS :", airportTmp));
            parsedAirport.setNightVfr(parseText(3,"3 - VFR de nuit / Night VFR :", airportTmp));
            parsedAirport.setAdOperator(parseText(4,"4 - Exploitant d’aérodrome / AD operator :", airportTmp));
            parsedAirport.setCaa(parseText(5,"5 - CAA :", airportTmp));
            parsedAirport.setBria(parseText(6,"6 - BRIA :", airportTmp));
            parsedAirport.setFlightPreparation(parseText(7,"7 - Préparation du vol / Flight preparation :", airportTmp));
            parsedAirport.setMet(parseText(8,"8 - MET :", airportTmp));
            parsedAirport.setCustomsPolice(parseText(9,"9 - Douanes, Police / Customs, Police :", airportTmp));
            parsedAirport.setAvt(parseText(10,"10 - AVT :", airportTmp));
            parsedAirport.setRffs(parseText(11,"11 - RFFS :", airportTmp));
            parsedAirport.setWildlife(parseText(12,"12 - Péril animalier / Wildlife strike hazard :", airportTmp));
            parsedAirport.setAircraftHangars(parseText(13,"13 - Hangars pour aéronefs de passage / Transient aircraft hangars :", airportTmp));
            parsedAirport.setRepairs(parseText(14,"14 - Réparations / Repairs :", airportTmp));
            parsedAirport.setAcb(parseText(15,"15 - ACB :", airportTmp));
            parsedAirport.setTransports(parseText(16,"16 - Transports :", airportTmp));
            parsedAirport.setHotelsRestaurant(parseText(17,"17 - Hotels, restaurants :", airportTmp));
            parsedAirport.setPublicAirTraffic(airportTmp.getAllInformationP1().contains("Ouvert à la CAP"));


            airportParsedDao.saveOrUpdate(parsedAirport);


        }
    }

    private String parseText(int index, String s, AirportTMPEntity airportTmp) {
        index++;

        for(int i=1; i<=11;i++){
            java.lang.reflect.Method method;
            try {
                method = airportTmp.getClass().getMethod("getAllInformationP"+i);
                String text = (String) method.invoke(airportTmp);

                if (text.contains(s)){
                    String textBegin = text.substring(text.indexOf(s));
                    String textOfProperty = textBegin.substring(0,textBegin.indexOf(index+" - ", s.length())-1);
                    return textOfProperty.substring(s.length());
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return null;
    }
}
