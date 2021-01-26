package com.example.senproject;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FeedbackTest {

    private Feedback feedback_obj;
    @Test
    public void getCanteenId() {
        feedback_obj = new Feedback("1","Great Canteen");
        assertThat("1",is(feedback_obj.getCanteenId()));
    }

    @Test
    public void getMessage() {
        feedback_obj = new Feedback("1","Great Canteen");
        assertThat("Great Canteen",is(feedback_obj.getMessage()));
    }
}