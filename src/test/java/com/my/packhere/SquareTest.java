package com.my.packhere;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

public class SquareTest {

public static void main(String[] args) {}


    @Rule
    public TestRule timeout = new Timeout(1000);

    @Test
    public void testGetPerimetr() {

        assertThat(new Square().getPerimetr(), not(0.0));

    }

    @Test
    public void testGetArea() {

        assertThat( new Square().getArea(), not(0.0));
    }

    @Test
    public void testGetName() {
        assertThat(new Square().getName(), instanceOf(String.class));
    }
}