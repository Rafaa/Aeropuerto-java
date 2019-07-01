package com.aero.models;

public class SearchForm {

    private String oaciCode;
    private boolean hangar;
    private boolean ats;
    private String fuel;
    private boolean customs;
    private boolean nightFlight;
    private boolean repair;
    private boolean hotelRestaurant;
    private boolean transport;
    private String region;
    private String city;


    public String getOaciCode() {
        return oaciCode;
    }

    public void setOaciCode(String oaciCode) {
        this.oaciCode = oaciCode;
    }

    public boolean isHangar() {
        return hangar;
    }

    public void setHangar(boolean hangar) {
        this.hangar = hangar;
    }

    public boolean isAts() {
        return ats;
    }

    public void setAts(boolean ats) {
        this.ats = ats;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public boolean isCustoms() {
        return customs;
    }

    public void setCustoms(boolean customs) {
        this.customs = customs;
    }

    public boolean isNightFlight() {
        return nightFlight;
    }

    public void setNightFlight(boolean nightFlight) {
        this.nightFlight = nightFlight;
    }

    public boolean isRepair() {
        return repair;
    }

    public void setRepair(boolean repair) {
        this.repair = repair;
    }

    public boolean isHotelRestaurant() {
        return hotelRestaurant;
    }

    public void setHotelRestaurant(boolean hotelRestaurant) {
        this.hotelRestaurant = hotelRestaurant;
    }

    public boolean isTransport() {
        return transport;
    }

    public void setTransport(boolean transport) {
        this.transport = transport;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
