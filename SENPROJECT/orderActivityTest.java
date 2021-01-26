package com.example.senproject;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class OrderTest {
    private Order order_obj;
    @Test
    public void getPaymetMethod() {
        order_obj = new Order( "15","201701153","1","HoneyOne_C1","Bhel,22,1","12/06/2020,23:13:12","Make Food Hot","Cash");
        assertThat("Cash",is(order_obj.getPaymetMethod()));
    }

    @Test
    public void getCookingInstruction() {
        order_obj = new Order("15","201701153","1","HoneyOne_C1","Bhel,22,1","12/06/2020,23:13:12","Make Food Hot","Cash");
        assertThat("Make Food Hot",is(order_obj.getCookingInstruction()));
    }

    @Test
    public void getOrderNo() {
        order_obj = new Order("15","201701153","1","HoneyOne_C1","Bhel,22,1","12/06/2020,23:13:12","Make Food Hot","Cash");
        assertThat("15",is(order_obj.getOrderNo()));
    }

    @Test
    public void getCustomerId() {
        order_obj = new Order("15","201701153","1","HoneyOne_C1","Bhel,22,1","12/06/2020,23:13:12","Make Food Hot","Cash");
        assertThat("201701153",is(order_obj.getCustomerId()));
    }

    @Test
    public void getCanteenId() {
        order_obj = new Order("15","201701153","1","HoneyOne_C1","Bhel,22,1","12/06/2020,23:13:12","Make Food Hot","Cash");
        assertThat("1",is(order_obj.getCanteenId()));
    }

    @Test
    public void getCanteenName() {
        order_obj = new Order("15","201701153","1","HoneyOne_C1","Bhel,22,1","12/06/2020,23:13:12","Make Food Hot","Cash");
        assertThat("HoneyOne_C1",is(order_obj.getCanteenName()));
    }

    @Test
    public void getOrderDetails() {
        order_obj = new Order("15","201701153","1","HoneyOne_C1","Bhel,22,1","12/06/2020,23:13:12","Make Food Hot","Cash");
        assertThat("Bhel,22,1",is(order_obj.getOrderDetails()));
    }

    @Test
    public void getOrderDateTime() {
        order_obj = new Order("15","201701153","1","HoneyOne_C1","Bhel,22,1","12/06/2020,23:13:12","Make Food Hot","Cash");
        assertThat("12/06/2020,23:13:12",is(order_obj.getOrderDateTime()));
    }
}