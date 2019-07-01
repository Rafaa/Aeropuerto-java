package com.aero.dao;


import com.aero.models.AirportTMPEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository("airportTMPDao")
public class AirportTMPDao  extends AbstractDao<Integer, AirportTMPEntity>{
}
