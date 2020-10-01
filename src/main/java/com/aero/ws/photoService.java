package com.aero.ws;

import com.aero.models.google.photo.GooglePhoto;
import com.aero.service.AirportPhotosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;

@RestController
public class photoService {

    @Autowired
    AirportPhotosService airportPhotosService;

    @PostMapping(value = "/googlePhoto", consumes = MediaType.APPLICATION_JSON_VALUE, produces = {"application/JSON"})
    public GooglePhoto getPhotosFromGoogleApi(@RequestBody String oaci) throws URISyntaxException, Exception {
        return airportPhotosService.findPhotoByAerodrome(oaci);



    }
}
