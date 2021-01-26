package com.example.senproject;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CanteenTest {

    private Canteen c;

    @Test
    public void getName() {
        c = new Canteen("1","HoneyOne@gmail.com","HoneyOne_C1","Canteen@1","0");
        assertThat("HoneyOne_C1",is(c.getName()));
    }

    @Test
    public void getEmail() {
        c = new Canteen("1","HoneyOne@gmail.com","HoneyOne_C1","Canteen@1","0");
        assertThat("HoneyOne@gmail.com",is(c.getEmail()));
    }

    @Test
    public void getPassword() {
        c = new Canteen("1","HoneyOne@gmail.com","HoneyOne_C1","Canteen@1","0");
        assertThat("Canteen@1",is(c.getPassword()));
    }

    @Test
    public void getAvailable() {
        c = new Canteen("1","HoneyOne@gmail.com","HoneyOne_C1","Canteen@1","0");
        assertThat("1",is(c.getAvailable()));
    }

    @Test
    public void getVirtual_Money() {
        c = new Canteen("1","HoneyOne@gmail.com","HoneyOne_C1","Canteen@1","0");
        assertThat("0",is(c.getVirtual_Money()));
    }
}