package com.example.helloworld.suite2;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class class1 {
    @Test
    public void test1() {
        assertTrue(2 % 2 == 0);
    }

    @Test
    public void test2() {
        assertTrue(2 % 2 == 0);
    }
}
