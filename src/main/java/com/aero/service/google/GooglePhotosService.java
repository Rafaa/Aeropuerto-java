package com.aero.service.google;

import com.aero.configuration.ApplicationProperties;
import com.aero.models.google.photo.GooglePhoto;
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


@Transactional
@Service("googlePhotosService")
public class GooglePhotosService {

    private final static Logger logger = Logger.getLogger("googlePhotosService");

    @Autowired
    private ApplicationProperties applicationProperties;

    public GooglePhoto photoByReference(String reference) throws URISyntaxException {
        GooglePhoto googlePhoto = new GooglePhoto();

        // Building the google search request
        URIBuilder url = new URIBuilder("https://maps.googleapis.com/maps/api/place/photo");
        url.addParameter("maxwidth","800");
        url.addParameter("photoreference", reference);
        url.addParameter("key", applicationProperties.getGoogleApiKey());

        logger.info(url.toString());

        // Call Google search webservice
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<byte[]> response = restTemplate.exchange(url.toString(), HttpMethod.GET, null, new ParameterizedTypeReference<byte[]>() {
        });
        googlePhoto.setPhoto(response.getBody());

        return googlePhoto;
    }
}
