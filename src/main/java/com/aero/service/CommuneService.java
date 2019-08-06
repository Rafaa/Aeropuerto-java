package com.aero.service;


import com.aero.dao.CommuneDao;
import com.aero.dao.DepartementDao;
import com.aero.dao.RegionDao;
import com.aero.models.Commune;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service("communeService")
@Transactional
public class CommuneService {

    @Autowired
    CommuneDao communeDao;

    @Autowired
    DepartementDao departementDao;

    @Autowired
    RegionDao regionDao;


    public void saveAll() {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Commune>> response = restTemplate.exchange("https://geo.api.gouv.fr/communes?fields=nom,code,codesPostaux,codeDepartement,departement,codeRegion,region,population&format=json", HttpMethod.GET, null, new ParameterizedTypeReference<List<Commune>>(){});
        List<Commune> communes = response.getBody();
        for (Commune commune : communes) {
/*            regionDao.saveOrUpdate(commune.getRegion());
            departementDao.saveOrUpdate(commune.getDepartement());*/
            communeDao.saveOrUpdate(commune);
        }


    }
}
