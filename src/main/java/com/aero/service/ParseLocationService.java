package com.aero.service;

import com.aero.dao.AirportParsedDao;
import com.aero.dao.CommuneDao;
import com.aero.models.AirportParsedEntity;
import com.aero.models.Commune;
import net.ricecode.similarity.JaroWinklerStrategy;
import net.ricecode.similarity.SimilarityStrategy;
import net.ricecode.similarity.StringSimilarityService;
import net.ricecode.similarity.StringSimilarityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("parseLocationService")
@Transactional
public class ParseLocationService {

    @Autowired
    private AirportParsedDao airportParsedDao;

    @Autowired
    private CommuneDao communeDao;


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

    public void addCommune() {
        List<AirportParsedEntity> airportList = airportParsedDao.getAll();

        for (AirportParsedEntity airportTmp: airportList){
            airportTmp.setCommune(returnCommune(airportTmp.getCleanLocation()));

            airportParsedDao.saveOrUpdate(airportTmp);
        }
    }

    private Commune returnCommune(String cleanLocation) {



        Commune bestCommune = null;
        double bestScore = 0;

        if(cleanLocation != null) {

            String cleanLocationSpaces = cleanLocation;
            cleanLocationSpaces = cleanLocationSpaces.replaceAll("-", " ");
            cleanLocationSpaces = cleanLocationSpaces.trim();
            cleanLocationSpaces = cleanLocationSpaces.replaceAll("’", "'");

            cleanLocation = cleanLocation.replaceAll("-", " ");
            cleanLocation = cleanLocation.trim();
            cleanLocation = cleanLocation.replaceAll(" ", "-");
            cleanLocation = cleanLocation.replaceAll("’", "'");
            List<Commune> communes = communeDao.searchCommune(cleanLocation, cleanLocationSpaces);
            for (Commune commune : communes) {
                double score = getSimilarityScore(cleanLocation, commune);

                if (score >= bestScore) {
                    bestCommune = commune;
                }
            }
        }

        return bestCommune;

    }

    private double getSimilarityScore(String cleanLocation, Commune commune) {
        SimilarityStrategy strategy = new JaroWinklerStrategy();
        String target = commune.getNom();
        String source = cleanLocation;
        StringSimilarityService service = new StringSimilarityServiceImpl(strategy);
        return service.score(source, target);
    }
}
