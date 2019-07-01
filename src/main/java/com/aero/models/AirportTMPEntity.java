package com.aero.models;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Airports_tmp")
public class AirportTMPEntity implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_airport")
    private Integer airportId;

    @Column(name = "code_oaci")
    private String codeOaci;

    @Column(name = "all_information_p1")
    private String allInformationP1;

    @Column(name = "all_information_p2")
    private String allInformationP2;

    @Column(name = "all_information_p3")
    private String allInformationP3;

    @Column(name = "all_information_p4")
    private String allInformationP4;

    @Column(name = "all_information_p5")
    private String allInformationP5;

    @Column(name = "all_information_p6")
    private String allInformationP6;

    @Column(name = "all_information_p7")
    private String allInformationP7;

    @Column(name = "all_information_p8")
    private String allInformationP8;

    @Column(name = "all_information_p9")
    private String allInformationP9;

    @Column(name = "all_information_p10")
    private String allInformationP10;

    @Column(name = "all_information_p11")
    private String allInformationP11;




    public String getCodeOaci() {
        return codeOaci;
    }

    public void setCodeOaci(String codeOaci) {
        this.codeOaci = codeOaci;
    }

    public String getAllInformationP1() {
        return allInformationP1;
    }

    public void setAllInformationP1(String allInformationP1) {
        this.allInformationP1 = allInformationP1;
    }

    public String getAllInformationP2() {
        return allInformationP2;
    }

    public void setAllInformationP2(String allInformationP2) {
        this.allInformationP2 = allInformationP2;
    }

    public String getAllInformationP3() {
        return allInformationP3;
    }

    public void setAllInformationP3(String allInformationP3) {
        this.allInformationP3 = allInformationP3;
    }

    public String getAllInformationP4() {
        return allInformationP4;
    }

    public void setAllInformationP4(String allInformationP4) {
        this.allInformationP4 = allInformationP4;
    }

    public String getAllInformationP5() {
        return allInformationP5;
    }

    public void setAllInformationP5(String allInformationP5) {
        this.allInformationP5 = allInformationP5;
    }

    public String getAllInformationP6() {
        return allInformationP6;
    }

    public void setAllInformationP6(String allInformationP6) {
        this.allInformationP6 = allInformationP6;
    }

    public String getAllInformationP7() {
        return allInformationP7;
    }

    public void setAllInformationP7(String allInformationP7) {
        this.allInformationP7 = allInformationP7;
    }

    public String getAllInformationP8() {
        return allInformationP8;
    }

    public void setAllInformationP8(String allInformationP8) {
        this.allInformationP8 = allInformationP8;
    }

    public String getAllInformationP9() {
        return allInformationP9;
    }

    public void setAllInformationP9(String allInformationP9) {
        this.allInformationP9 = allInformationP9;
    }

    public String getAllInformationP10() {
        return allInformationP10;
    }

    public void setAllInformationP10(String allInformationP10) {
        this.allInformationP10 = allInformationP10;
    }

    public String getAllInformationP11() {
        return allInformationP11;
    }

    public void setAllInformationP11(String allInformationP11) {
        this.allInformationP11 = allInformationP11;
    }

    public Integer getAirportId() {
        return airportId;
    }

    public void setAirportId(Integer airportId) {
        this.airportId = airportId;
    }
}
