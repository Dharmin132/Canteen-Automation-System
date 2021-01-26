package com.example.senproject;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class UserTest {

    private User user_obj;
    @Test
    public void getName() {
        user_obj = new User("Adit Mehta","7698459935","0");
        assertThat("Adit Mehta",is(user_obj.getName()));

    }

    @Test
    public void getContact() {
        user_obj = new User("Adit Mehta","7698459935","0");
        assertThat("7698459935",is(user_obj.getContact()));
    }

    @Test
    public void getVirtual_Money() {
        user_obj = new User("Adit Mehta","7698459935","0");
        assertThat("0",is(user_obj.getVirtual_Money()));
    }
}