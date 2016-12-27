import junit.framework.TestCase;

public class printerTest extends TestCase{
    Printer printer;

    public void setUp() throws Exception {
        super.setUp();
        printer = new Printer();
    }

    public void test_Printer_void() throws Exception {
        assertEquals("", printer.print());
    }

    public void test_Printer_with_ceckout() throws Exception {
        Checkout checkout = new Checkout();
        //TODO mock

    }
}
