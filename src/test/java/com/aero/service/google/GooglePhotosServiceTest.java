package com.aero.service.google;

import com.aero.models.google.photo.GooglePhoto;
import hello.Application;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URISyntaxException;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class GooglePhotosServiceTest {

    @Autowired
    private GooglePhotosService googlePhotosService;

    @Before
    public void setUp()  {
    }

    @After
    public void tearDown()  {
    }

    @Test
    public void googleDetailsCallTest() {
        GooglePhoto photo = null;
        try {
            photo = googlePhotosService.photoByReference("reference");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        assertNotNull(photo);
    }
}
