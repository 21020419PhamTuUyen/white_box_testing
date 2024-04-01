/*
 * Copyright 2015-2023 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {
	@Test
    public void testIsPrime1() {
        boolean output = Calculator.isPrime(-1);
        assertEquals(false, output);
    }

    @Test
    public void testIsPrime2() {
        boolean output = Calculator.isPrime(2);
        assertEquals(true, output);
    }

    @Test
    public void testIsPrime3() {
        boolean output = Calculator.isPrime(3);
        assertEquals(true, output);
    }

    @Test
    public void testIsPrime4() {
        boolean output = Calculator.isPrime(4);
        assertEquals(false, output);
    }

    @Test
    public void testIsPrime5() {
        boolean output = Calculator.isPrime(5);
        assertEquals(true, output);
    }

    @Test
    public void testIsPrime6() {
        boolean output = Calculator.isPrime(8);
        assertEquals(false, output);
    }
}
