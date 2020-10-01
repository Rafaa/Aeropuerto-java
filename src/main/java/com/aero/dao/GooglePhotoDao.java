package com.aero.dao;


import com.aero.models.google.photo.GooglePhoto;
import org.springframework.stereotype.Repository;

@Repository("googlePhotoDao")
public class GooglePhotoDao extends AbstractDao<Integer, GooglePhoto> {
}
