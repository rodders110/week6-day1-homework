import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    Printer printer;

    @Before
    public void Before(){
        printer = new Printer(100);
    }

    @Test
    public void printerHasSheets(){
        assertEquals(100, printer.sheets());
    }

    @Test
    public void printerCanPrint(){
        printer.print(2, 3);
        assertEquals(94, printer.sheets());
    }

    @Test
    public void printerCannotPrint(){
        printer.print(100, 2);
        assertEquals(100, printer.sheets());
    }

    @Test
    public void printerCanRefil(){
        printer.refil(20);
        assertEquals(120, printer.sheets());
    }

    @Test
    public void printerCanLoseToner(){
        printer.print(2, 3);
        assertEquals(1194, printer.getToner());
    }

}
