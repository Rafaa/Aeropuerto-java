package com.aero.models.google.photo;


import com.aero.models.AirportParsedEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Region
 */
@Entity
@Table(name = "googlePhoto")
public class GooglePhoto implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "id_airport")
    private AirportParsedEntity airportParsedEntity;

    @Column(name = "photo")
    private byte[] photo;

    @Column(name = "path")
    private String path;

    public String getPath() {
        return path;
    }

    public GooglePhoto setPath(String path) {
        this.path = path;
        return this;
    }

    public AirportParsedEntity getAirportParsedEntity() {
        return airportParsedEntity;
    }

    public GooglePhoto setAirportParsedEntity(AirportParsedEntity airportParsedEntity) {
        this.airportParsedEntity = airportParsedEntity;
        return this;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public GooglePhoto setPhoto(byte[] photo) {
        this.photo = photo;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public GooglePhoto setId(Integer id) {
        this.id = id;
        return this;
    }
}
