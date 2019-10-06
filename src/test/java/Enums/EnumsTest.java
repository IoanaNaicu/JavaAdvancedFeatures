package Enums;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EnumsTest {

    @Test
    public void testEnum() {
        assertEquals(PrinterType.DOT_MATRIX,
                PrinterType.matchPrinterType("Imprimanta matriciala"));
    }

    @Test (expected = PrinterType.UnknownPrinter.class)
    public void testUnknownPrinter(){
        PrinterType.matchPrinterType("Imprimanta xxxxxx");
    }
}
