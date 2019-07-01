package com.aero.service;

import com.aero.dao.AirportParsedDao;
import com.aero.models.AirportParsedEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("parseLocationService")
@Transactional
public class ParseLocationService {

    @Autowired
    private AirportParsedDao airportParsedDao;


    public String returnCity(String dirtyLocation) {
        if(dirtyLocation==null) {
            return null;
        }
        StringBuffer cleanCity = new StringBuffer();
        String[] spliitedLocation = dirtyLocation.split(" ");
        for (int i=0; i<spliitedLocation.length; i++) {
            if(spliitedLocation[i].equals("km") || "Km".equals(spliitedLocation[i]) || "NM".equals(spliitedLocation[i])) {
                for(int j=i+2; j < spliitedLocation.length && spliitedLocation[j].indexOf("(")!=0; j++) {
                    cleanCity.append(spliitedLocation[j]);
                    cleanCity.append(" ");
                }
                return cleanCity.toString().trim();
            }
        }
        return null;
    }

    public void parseCity() {
        List<AirportParsedEntity> airportList = airportParsedDao.getAll();

        for (AirportParsedEntity airportTmp: airportList){
            airportTmp.setCleanLocation(returnCity(airportTmp.getLocation()));
            airportParsedDao.saveOrUpdate(airportTmp);
        }

    }
}
