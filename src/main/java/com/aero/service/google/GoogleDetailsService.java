package com.aero.service.google;


import com.aero.configuration.ApplicationProperties;
import com.aero.models.google.details.GoogleDetails;
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

@Service("googleDetailsService")
@Transactional
public class GoogleDetailsService {
    private final static Logger logger = Logger.getLogger("googleSearchService");

    @Autowired
    private ApplicationProperties applicationProperties;

    public GoogleDetails detailsByPlaceId(String placeId) throws URISyntaxException {
        GoogleDetails googleDetails;

        // Building the google search request
        URIBuilder url = new URIBuilder("https://maps.googleapis.com/maps/api/place/details/json");
        url.addParameter("placeid", placeId);
        url.addParameter("key", applicationProperties.getGoogleApiKey());

        logger.info(url.toString());

        // Call Google search webservice
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<GoogleDetails> response = restTemplate.exchange(url.toString(), HttpMethod.GET, null, new ParameterizedTypeReference<GoogleDetails>(){});
        googleDetails = response.getBody();

        return googleDetails;
    }
}
