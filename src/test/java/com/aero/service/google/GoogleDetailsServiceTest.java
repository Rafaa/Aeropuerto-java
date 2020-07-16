package com.aero.service.google;


import com.aero.models.google.details.GoogleDetails;
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
public class GoogleDetailsServiceTest {
    @Autowired
    private GoogleDetailsService googleDetailsService;

    @Before
    public void setUp()  {
    }

    @After
    public void tearDown()  {
    }

    @Test
    public void googleDetailsCallTest() {
        GoogleDetails gd = null;
        try {
            gd = googleDetailsService.detailsByPlaceId("LFPH");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        assertNotNull(gd);
    }
}
