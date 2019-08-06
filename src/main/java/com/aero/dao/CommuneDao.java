package com.aero.dao;

import com.aero.models.AirportParsedEntity;
import com.aero.models.Commune;
import com.aero.models.SearchForm;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("communeDao")
public class CommuneDao extends AbstractDao<Integer, Commune>{


    public List<Commune> searchCommune(String searchCommune, String searchCommuneSpaces) {
        Criteria criteria = createEntityCriteria();

        Criterion str1 = Restrictions.ilike("nom", searchCommune, MatchMode.ANYWHERE);
        Criterion str2 = Restrictions.ilike("nom", searchCommuneSpaces, MatchMode.ANYWHERE);

        criteria.add(Restrictions.or(str1,str2));

        List<Commune> communes = (List<Commune>) criteria.list();


        return communes;
    }
}
