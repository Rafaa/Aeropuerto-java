package com.aero.ws;


import com.aero.dao.AirportParsedDao;
import com.aero.models.AirportParsedEntity;
import com.aero.models.SearchForm;
import com.aero.service.AirportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class searchService {

    @Autowired
    private AirportsService airportsService;

    @Autowired
    private AirportParsedDao airportParsedDao;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/searchAirports", consumes = {"application/JSON"}, produces = {"application/JSON"})
    public List<AirportParsedEntity> searchAirports(@RequestBody SearchForm searchForm) {

        return airportsService.searchAirport(searchForm);

    }
}
