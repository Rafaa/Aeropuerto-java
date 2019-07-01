package com.aero.dao;

import com.aero.models.AirportParsedEntity;
import com.aero.models.SearchForm;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository("airportParsedDao")
public class AirportParsedDao extends AbstractDao<Integer, AirportParsedEntity> {

    public AirportParsedEntity getByOACI(String oaci) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("codeOaci", oaci));
        AirportParsedEntity airport = (AirportParsedEntity) criteria.uniqueResult();


        return airport;
    }

    public List<AirportParsedEntity> searchAirport(SearchForm searchForm) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.ilike("codeOaci", searchForm.getOaciCode(), MatchMode.ANYWHERE));
        if(searchForm.isHangar()) {
            criteria.add(Restrictions.not(Restrictions.ilike("aircraftHangars", "NIL", MatchMode.ANYWHERE)));
        }
        if(searchForm.isCustoms()) {
            criteria.add(Restrictions.not(Restrictions.ilike("customsPolice", "NIL", MatchMode.ANYWHERE)));
        }
        if(searchForm.isRepair()) {
            criteria.add(Restrictions.not(Restrictions.ilike("repairs", "NIL", MatchMode.ANYWHERE)));
        }
        if(searchForm.isHotelRestaurant()) {
            criteria.add(Restrictions.not(Restrictions.ilike("hotelsRestaurant", "NIL", MatchMode.ANYWHERE)));
        }
        if(searchForm.isTransport()) {
            criteria.add(Restrictions.not(Restrictions.ilike("transports", "NIL", MatchMode.ANYWHERE)));
        }
        if(searchForm.isNightFlight()) {
            criteria.add(Restrictions.not(Restrictions.ilike("nightVfr", "NIL", MatchMode.ANYWHERE)));
        }
        List<AirportParsedEntity> airports = (List<AirportParsedEntity>) criteria.list();


        return airports;

    }
}
