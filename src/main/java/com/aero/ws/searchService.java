package com.aero.ws;


import com.aero.dao.AirportParsedDao;
import com.aero.models.AirportParsedEntity;
import com.aero.models.SearchForm;
import com.aero.models.google.photo.GooglePhoto;
import com.aero.service.AirportPhotosService;
import com.aero.service.AirportsService;
import com.aero.service.google.GooglePhotosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@RestController
public class searchService {

    @Autowired
    private AirportsService airportsService;

    @Autowired
    private AirportParsedDao airportParsedDao;

    @Autowired
    private AirportPhotosService airportPhotosService;

    @PostMapping(value = "/searchAirports", consumes = {"application/JSON"}, produces = {"application/JSON"})
    public List<AirportParsedEntity> searchAirports(@RequestBody SearchForm searchForm) {

        return airportsService.searchAirport(searchForm);

    }

    @PostMapping(value = "/photo", consumes = {"application/JSON"}, produces = {"application/JSON"})
    public GooglePhoto photoByReference(@RequestBody SearchForm searchForm) throws URISyntaxException, Exception {

        return airportPhotosService.findPhotoByAerodrome(searchForm.getOaciCode());
    }
}
