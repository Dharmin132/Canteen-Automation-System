package com.example.senproject;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ItemTest {

    private Item item_obj;
    @Test
    public void getName() {
        item_obj = new Item("Bhel","30","1");
        assertThat("Bhel",is(item_obj.getName()));
    }

    @Test
    public void getPrice() {
        item_obj = new Item("Bhel","30","1");
        assertThat("30",is(item_obj.getPrice()));
    }

    @Test
    public void getAcailability() {
        item_obj = new Item("Bhel","30","1");
        assertThat("1",is(item_obj.getAcailability()));
    }
}