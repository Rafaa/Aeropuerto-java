package com.aero.controller;


import com.aero.models.Commune;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class aerodromePhotoController {

    @RequestMapping(method = RequestMethod.GET, value = "/saveAerodromePhotos")
    public void savePhotosFromGoogleApi()
    {
        String clientId = "742127308875-dbm3pa5h3n6ltr73momopam9kns64eep.apps.googleusercontent.com";
        String clientSecret = "wuJFzfONmH3u6cAwqChww9km";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Object> response = restTemplate.exchange("https://maps.googleapis.com/maps/api/place/findplacefromtext/json?input=chelles le pin&inputtype=textquery&fields=place_id,photos,formatted_address,name,rating,opening_hours,geometry&key=AIzaSyC9LX3RyTy2ViHnhQudWVMdNYTPpYoXH3Q",
                HttpMethod.GET, null, new ParameterizedTypeReference<Object>(){});
        Object communes = response.getBody();


    }

    @RequestMapping(method = RequestMethod.GET, value = "/oauthRedirect")
    public void oauthRedirect()
    {

    }
}
