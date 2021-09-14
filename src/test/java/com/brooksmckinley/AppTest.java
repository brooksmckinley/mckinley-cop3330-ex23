/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAffirmativeInterpretation() {
        Assertions.assertTrue(App.isAffirmative("y"));
        Assertions.assertTrue(App.isAffirmative("yes"));
        Assertions.assertTrue(App.isAffirmative("YeS"));
        Assertions.assertFalse(App.isAffirmative("no"));
        Assertions.assertFalse(App.isAffirmative("n"));
    }
}