package edu.rseymour.advancedjava.services;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * JUnit test for <CODE>StockServiceFactory</CODE>
 */
public class StockServiceFactoryTest {

    @Test
    public void testGetInstance() {
        StockService stockService = StockServiceFactory.getInstance();
        assertNotNull(stockService);
    }
}
