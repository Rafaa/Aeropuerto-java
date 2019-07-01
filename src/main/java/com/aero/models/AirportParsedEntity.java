package com.aero.models;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Airport_parsed")
public class AirportParsedEntity implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_airport")
    private Integer airportId;

    @Column(name = "code_oaci")
    private String codeOaci;

    @Column(name = "location")
    private String location;

    @Column(name = "ats")
    private String ats;

    @Column(name = "night_vfr")
    private String nightVfr;

    @Column(name = "ad_operator")
    private String adOperator;

    @Column(name = "caa")
    private String caa;

    @Column(name = "bria")
    private String bria;

    @Column(name = "flight_preparation")
    private String flightPreparation;

    @Column(name = "met")
    private String met;

    @Column(name = "customs_police")
    private String customsPolice;

    @Column(name = "avt")
    private String avt;

    @Column(name = "rffs")
    private String rffs;

    @Column(name = "wildlife")
    private String wildlife;

    @Column(name = "aircraft_hangars")
    private String aircraftHangars;

    @Column(name = "repairs")
    private String repairs;

    @Column(name = "acb")
    private String acb;


    @Column(name = "transports")
    private String transports;

    @Column(name = "hotels_restaurant")
    private String hotelsRestaurant;


    @Column(name = "public_air_traffic")
    private boolean publicAirTraffic;



    @Column(name = "clean_location")
    private String cleanLocation;



    @Column(name = "geo_location")
    private String geoLocation;

    public String getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(String geoLocation) {
        this.geoLocation = geoLocation;
    }


    public Integer getAirportId() {
        return airportId;
    }

    public void setAirportId(Integer airportId) {
        this.airportId = airportId;
    }

    public String getCodeOaci() {
        return codeOaci;
    }

    public void setCodeOaci(String codeOaci) {
        this.codeOaci = codeOaci;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAts() {
        return ats;
    }

    public void setAts(String ats) {
        this.ats = ats;
    }

    public String getNightVfr() {
        return nightVfr;
    }

    public void setNightVfr(String nightVfr) {
        this.nightVfr = nightVfr;
    }

    public String getAdOperator() {
        return adOperator;
    }

    public void setAdOperator(String adOperator) {
        this.adOperator = adOperator;
    }

    public String getCaa() {
        return caa;
    }

    public void setCaa(String caa) {
        this.caa = caa;
    }

    public String getBria() {
        return bria;
    }

    public void setBria(String bria) {
        this.bria = bria;
    }

    public String getFlightPreparation() {
        return flightPreparation;
    }

    public void setFlightPreparation(String flightPreparation) {
        this.flightPreparation = flightPreparation;
    }

    public String getMet() {
        return met;
    }

    public void setMet(String met) {
        this.met = met;
    }

    public String getCustomsPolice() {
        return customsPolice;
    }

    public void setCustomsPolice(String customsPolice) {
        this.customsPolice = customsPolice;
    }

    public String getAvt() {
        return avt;
    }

    public void setAvt(String avt) {
        this.avt = avt;
    }

    public String getRffs() {
        return rffs;
    }

    public void setRffs(String rffs) {
        this.rffs = rffs;
    }

    public String getWildlife() {
        return wildlife;
    }

    public void setWildlife(String wildlife) {
        this.wildlife = wildlife;
    }

    public String getAircraftHangars() {
        return aircraftHangars;
    }

    public void setAircraftHangars(String aircraftHangars) {
        this.aircraftHangars = aircraftHangars;
    }

    public String getRepairs() {
        return repairs;
    }

    public void setRepairs(String repairs) {
        this.repairs = repairs;
    }

    public String getAcb() {
        return acb;
    }

    public void setAcb(String acb) {
        this.acb = acb;
    }

    public String getTransports() {
        return transports;
    }

    public void setTransports(String transports) {
        this.transports = transports;
    }

    public String getHotelsRestaurant() {
        return hotelsRestaurant;
    }

    public void setHotelsRestaurant(String hotelsRestaurant) {
        this.hotelsRestaurant = hotelsRestaurant;
    }

    public boolean isPublicAirTraffic() {
        return publicAirTraffic;
    }

    public void setPublicAirTraffic(boolean publicAirTraffic) {
        this.publicAirTraffic = publicAirTraffic;
    }

    public String getCleanLocation() {
        return cleanLocation;
    }

    public void setCleanLocation(String cleanLocation) {
        this.cleanLocation = cleanLocation;
    }
}
