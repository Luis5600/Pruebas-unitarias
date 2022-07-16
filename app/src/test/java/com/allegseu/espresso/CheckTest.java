package com.allegseu.espresso;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import junit.framework.TestCase;

import org.junit.Test;

import java.util.Calendar;

public class CheckTest {

    @Test
    public void isEmptyEditText_ReturnsTrue() {


        assertTrue(Check.validateEmpty(""));
    }

    @Test
    public void isEmptyEditText_ReturnsFalse() {


        assertFalse(Check.validateEmpty("dsafas"));
    }

    @Test
    public void isEmailFormatCorrect_ReturnsFalse() {

        assertFalse(Check.validateEmail("alexgmail.com"));
    }

    @Test
    public void isEmailFormatCorrect_ReturnTrue() {

        assertTrue(Check.validateEmail("alex@gmail.com"));
    }

    @Test
    public void isUserinBD_ReturnTrue() {

        assertTrue(Check.validateUser("alex@gmail.com","123456"));
    }

    @Test
    public void isUserinBD_ReturnFalse() {

        assertFalse(Check.validateUser("alexx@gmail.com","123456"));
    }

}