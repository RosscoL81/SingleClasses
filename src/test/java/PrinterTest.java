import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(10);
    }

    @Test
    public void print(){
        assertEquals(8, printer.print(4,2));
    }

    @Test
    public void canPrint(){
        printer.print(4,2)
        assertEquals(2, printer.canPrint(4,2));
    }

    @Test
    public void cannotPrint(){
        assertEquals(2, printer.canPrint(4,4));
    }
}
