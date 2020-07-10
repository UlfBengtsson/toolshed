package org.example.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneTest {

    Phone testPhone;

    @Before
    public void setUp() throws Exception {
        testPhone = new Phone();
    }

    @Test
    public void use() {
        //Arrange
        //taken care of by setUp

        //Act
        String result = testPhone.use();

        //Assert
        assertEquals("its silent, no power!", result);
    }

    @Test
    public void isPowerOn() {
        //Arrange
        //taken care of by setUp

        //Act
        testPhone.setPowerOn(true);
        boolean isItTrue = testPhone.isPowerOn();
        String result = testPhone.use();

        //Assert
        assertTrue(isItTrue);
        assertEquals("You hear the dial tone.", result);
    }

    @Test
    public void setPowerOn() {
    }

    @Test
    public void isInUse() {
    }

    @Test
    public void setInUse() {
    }
}