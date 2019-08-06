package com.aero.controller;

import com.aero.service.CommuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/communes")
@RestController
public class CommuneController {

    @Autowired
    CommuneService communeService;


    @RequestMapping(method = RequestMethod.GET, value = "/saveAll")
    public void saveAll() {
        communeService.saveAll();

    }
}
