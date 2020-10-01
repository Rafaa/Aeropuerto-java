package com.aero.controller;


import com.aero.service.AirportPhotosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;

@RestController
public class aerodromePhotoController {

    @Autowired
    private AirportPhotosService airportPhotosService;

    @RequestMapping(method = RequestMethod.GET, value = "/saveAerodromePhotos")
    public void savePhotosFromGoogleApi() throws URISyntaxException, Exception {

            airportPhotosService.saveAllPhotos();

    }

    @RequestMapping(method = RequestMethod.GET, value = "/oauthRedirect")
    public void oauthRedirect()
    {

    }




}
