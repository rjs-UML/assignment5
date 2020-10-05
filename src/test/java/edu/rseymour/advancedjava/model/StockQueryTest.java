package edu.rseymour.advancedjava.model;

import edu.rseymour.advancedjava.model.StockQuery;
import org.junit.Before;
import org.junit.Test;

import javax.validation.constraints.NotNull;
import java.text.ParseException;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for StockQuery Class
 */
public class StockQueryTest {

    String symbol;
    StockQuery stockQuery;
    Calendar from = Calendar.getInstance();
    Calendar until = Calendar.getInstance();;

    @Before
    public void setup() throws ParseException {
        symbol = "APPL";
        stockQuery = new StockQuery(symbol,"2010/11/11","2011/11/22");
        assertEquals("Verify construction", symbol, stockQuery.getSymbol());
    }

    @Test
    public void testBasicConstruction() throws Exception{
        assertEquals("Verify construction", symbol, stockQuery.getSymbol());
    }

    @Test
    public void getSymbolTest() throws Exception {
        assertEquals("Testing getSymbol()", symbol, stockQuery.getSymbol());
    }

//    @Test
//    public void getFromTest() throws ParseException {
//        from.set(11,11, 2011);
//        assertEquals("Testing getFrom()", from, stockQuery.getFrom());
//    }
//
//    @Test
//    public void getUntilTest() throws ParseException {
//        symbol = "APPL";
//        until.set(11,22,2011);
//        stockQuery = new StockQuery(symbol,"2010/11/11","2011/11/22");
//        assertEquals("Testing getFrom()", until, stockQuery.getUntil());
//    }

}
