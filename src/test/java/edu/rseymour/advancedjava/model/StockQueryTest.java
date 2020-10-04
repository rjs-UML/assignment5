package edu.rseymour.advancedjava.model;

import edu.rseymour.advancedjava.model.StockQuery;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for StockQuery Class
 */
public class StockQueryTest {

    @Test
    public void testBasicConstruction() throws Exception{
        StockSymbol symbol = StockSymbol.APPL;
        StockQuery stockQuery = new StockQuery(symbol,"2010/11/11","2011/11/11");
        assertEquals("Verify construction", symbol, stockQuery.getSymbol());
    }

}
