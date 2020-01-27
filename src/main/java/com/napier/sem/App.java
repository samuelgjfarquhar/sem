package com.napier.sem;

import org.junit.Test;

import static org.junit.Assert.fail;

public class App
{
    public static void main(String[] args)
    {
        System.out.println("Group 17 Project");
    }

}

public class HelloWorldTest {

    @Test
    public void testNothing() {
    }

    @Test
    public void testWillAlwaysFail() {
        fail("An error message");
    }

}