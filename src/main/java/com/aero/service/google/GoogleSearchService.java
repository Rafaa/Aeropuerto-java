package com.aero.service.google;

import com.aero.configuration.ApplicationProperties;
import com.aero.models.google.search.GoogleSearch;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.net.URISyntaxException;
import java.util.logging.Logger;


@Service("googleSearchService")
@Transactional
public class GoogleSearchService {

    private final static Logger logger = Logger.getLogger("googleSearchService");

    @Autowired
    private ApplicationProperties applicationProperties;

    public GoogleSearch searchByPlaceName(String placeName) throws URISyntaxException {
        GoogleSearch googleSearch;

        // Building the google search request
        URIBuilder url = new URIBuilder("https://maps.googleapis.com/maps/api/place/findplacefromtext/json");
        url.addParameter("input", placeName);
        url.addParameter("inputtype","textquery");
        url.addParameter("fields", "place_id,photos,formatted_address,name,rating,opening_hours,geometry");
        url.addParameter("key", applicationProperties.getGoogleApiKey());

        logger.info(url.toString());

        // Call Google search webservice
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<GoogleSearch> response = restTemplate.exchange(url.toString().replaceAll("%2C", ","), HttpMethod.GET, null, new ParameterizedTypeReference<GoogleSearch>(){});
        googleSearch = response.getBody();

        return googleSearch;
    }
}
