package com.aero.service;

import com.aero.dao.AirportParsedDao;
import com.aero.dao.AirportTMPDao;
import com.aero.models.AirportParsedEntity;
import com.aero.models.AirportTMPEntity;
import com.aero.models.SearchForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service("airportsService")
@Transactional
public class AirportsService {

    @Autowired
    private AirportTMPDao airportTMPDao;

    @Autowired
    private AirportParsedDao airportParsedDao;



    public List<AirportTMPEntity> getAirportTMPList() {

        List<AirportTMPEntity> airportList = airportTMPDao.getAll();
        for (AirportTMPEntity airport: airportList){

            // TODO parse the data in each page
            /*AirportParsedEntity parsedAirport = new AirportParsedEntity();
            parsedAirport.setCodeOaci(airport.getCodeOaci());
            airportParsedDao.saveOrUpdate(parsedAirport);*/


        }


        return airportList;
    }

    public List<AirportParsedEntity> getAirportParsedList() {

        List<AirportParsedEntity> airportList = airportParsedDao.getAll();

        return airportList;
    }

    public List<AirportParsedEntity> searchAirport(SearchForm searchForm) {

        List<AirportParsedEntity> airportList = airportParsedDao.searchAirport(searchForm);

        return airportList;
    }

    public AirportParsedEntity getAirportParsedByOACI(String oaci) {
        return airportParsedDao.getByOACI(oaci);
    }

    public void setLocationAirportParsedByOACI(String oaci, String location) {
        AirportParsedEntity airport = getAirportParsedByOACI( oaci);
        airport.setGeoLocation(location);
        airportParsedDao.saveOrUpdate(airport);

    }
}
