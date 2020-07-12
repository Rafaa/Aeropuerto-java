package com.aero.service.google;

import com.aero.models.google.search.GoogleSearch;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;


@Service("googleSearchService")
@Transactional
public class GoogleSearchService {

    private final static Logger logger = Logger.getLogger("googleSearchService");

    public GoogleSearch searchByPlaceName(String placeName) {
        GoogleSearch googleSearch = new GoogleSearch();
        String url = "https://maps.googleapis.com/maps/api/place/findplacefromtext/json?input=LFPH&inputtype=textquery&fields=place_id,photos,formatted_address,name,rating,opening_hours,geometry&key=AIzaSyC9LX3RyTy2ViHnhQudWVMdNYTPpYoXH3Q";

        // Call Google serach webservice
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<GoogleSearch> response = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<GoogleSearch>(){});
        googleSearch = response.getBody();

        logger.info(googleSearch.toString());


        return googleSearch;

    }
}
