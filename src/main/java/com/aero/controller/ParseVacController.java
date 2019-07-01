package com.aero.controller;

import com.aero.dao.AirportParsedDao;
import com.aero.dao.AirportTMPDao;
import com.aero.models.AirportParsedEntity;
import com.aero.models.AirportTMPEntity;
import com.aero.service.ParseLocationService;
import com.aero.service.ParseVacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParseVacController {

    @Autowired
    private ParseVacService parseVacService;

    @Autowired
    private ParseLocationService parseLocationService;



    @RequestMapping("/parseVac")
    public String index() {
        parseVacService.parseVac();
        return "true";

    }

    @RequestMapping("/parseLocation")
    public String parseLocation() {
        parseLocationService.parseCity();
        return "true";

    }

}
