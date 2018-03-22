package com.example.macintosh.tourguideproject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by macintosh on 03/03/2018.
 */
public class LocationTest {

    Location location;

    @Before
    public void setup(){
        location = new Location("Yellow Kafe","12 Pitfield Street","07897845264","Bijou Cafe");
    }

    @Test
    public void test_name(){
        assertEquals("Yellow Kafe",location.getName());
    }

    @Test
    public void test_description(){
        assertEquals("Bijou Cafe",location.getDescription());
    }


}