package com.aero.service.google;

import hello.Application;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class GoogleSearchServiceTest {

    @Autowired
    private GoogleSearchService googleSearchService;

    @Before
    public void setUp()  {
    }

    @After
    public void tearDown()  {
    }

    @Test
    public void googleSerchCallTest() {
        assertNotNull(googleSearchService.searchByPlaceName("LFPH"));
    }
}