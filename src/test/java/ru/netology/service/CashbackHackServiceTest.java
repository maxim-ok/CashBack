package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();


    @Test
    public void shouldRemainZero() {

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }


    @Test
    public void shouldRemain500() {

        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(actual, expected);


    }


    @Test
    public void shouldRemainOne() {

        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(actual, expected);


    }


}