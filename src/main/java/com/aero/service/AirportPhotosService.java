package com.aero.service;

import com.aero.dao.AbstractDao;
import com.aero.dao.GooglePhotoDao;
import com.aero.models.AirportParsedEntity;
import com.aero.models.google.details.GoogleDetails;
import com.aero.models.google.details.GoogleDetailsResultPhotos;
import com.aero.models.google.photo.GooglePhoto;
import com.aero.models.google.search.GoogleSearch;
import com.aero.service.google.GoogleDetailsService;
import com.aero.service.google.GooglePhotosService;
import com.aero.service.google.GoogleSearchService;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileOutputStream;
import java.net.URISyntaxException;

@Service("airportPhotosService")
@Transactional
public class AirportPhotosService {

    @Autowired
    GooglePhotosService googlePhotosService;
    @Autowired
    GoogleSearchService googleSearchService;
    @Autowired
    GoogleDetailsService googleDetailsService;

    @Autowired
    AirportsService airportsService;

    @Autowired
    GooglePhotoDao googlePhotoDao;

    public void saveAllPhotos()  {
        airportsService.getAirportParsedList().forEach(airport -> {
            try {
                saveAllPhotosByAerodrome(airport);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private void saveAllPhotosByAerodrome(AirportParsedEntity airport) throws Exception {
        GooglePhoto googlePhoto = findPhotoByAerodrome(airport.getCodeOaci());
        if(null != googlePhoto.getPhoto()) {
            savePhotoByAerodrome(googlePhoto, airport);
        }
    }

    public void savePhotoByAerodrome(GooglePhoto photo, AirportParsedEntity airport) throws Exception {
        photo.setAirportParsedEntity(airport);
        FileOutputStream fos = new FileOutputStream("/home/rafaa/Documents/Projects/workspace/Angular/AerodromesFrance/agulular-app/src/assets/img/aerodrome-pics/" + airport.getCodeOaci() + ".jpeg");
        fos.write(photo.getPhoto());
        fos.close();
        photo.setPath("aerodrome-pics/" + airport.getCodeOaci() + ".jpeg");
        googlePhotoDao.saveOrUpdate(photo);
    }

    public GooglePhoto findPhotoByAerodrome(String oaciCode) throws URISyntaxException, Exception {
        GooglePhoto photo = new GooglePhoto();
        String reference = getGooglePhotoReference(oaciCode);
        if(null != reference && !reference.isEmpty()) {
            photo = googlePhotosService.photoByReference(reference);
        }
        return photo;
    }

    private String getGooglePhotoReference(String oaciCode) throws URISyntaxException, Exception {
        final int width = 350;
        final int height = 260;
        final float ratio = width / height;
        String reference = "";

        // Sequence of Google calls
        GoogleSearch googleSearch = googleSearchService.searchByPlaceName(oaciCode);
        if(null != googleSearch && googleSearch.getCandidates().size() > 0) {

            GoogleDetails googleDetails = googleDetailsService.detailsByPlaceId(googleSearch.getCandidates().get(0).getPlaceId());
            if(null != googleDetails && null != googleDetails.getResult() && null != googleDetails.getResult().getPhotos() && googleDetails.getResult().getPhotos().size() > 0) {
                int i = 0;
                float bestRatio = 0;
                for(GoogleDetailsResultPhotos resultPhoto : googleDetails.getResult().getPhotos()) {
                    float googleRatio = resultPhoto.getWidth().floatValue() / resultPhoto.getHeight().floatValue();
                    if(i == 0) {
                        reference = resultPhoto.getPhotoReference();
                        bestRatio = googleRatio;
                    }
                    if( Math.abs(googleRatio - ratio) < Math.abs(bestRatio - ratio) ) {
                        reference = resultPhoto.getPhotoReference();
                        bestRatio = googleRatio;                    }
                    i++;
                }

            }
        }



        return reference;
    }


}
