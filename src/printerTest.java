import junit.framework.TestCase;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class printerTest extends TestCase{
    Checkout checkout;
    Printer printer;

    public void setUp() throws Exception {
        super.setUp();
//        checkout = new Checkout();
        checkout = mock(Checkout.class);
        //TODO mock
        printer = new Printer(checkout);
    }

    public void testxxx2() throws Exception {
        printer.print();
        verify(checkout).total(); //verifica che il metodo è stato chiamato
    }

    public void test_print_void() throws Exception {
        assertEquals("Il totale è: 0", printer.print());
    }

    public void test_print_with_value() throws Exception {
//        checkout.scan("A");
        when(checkout.total()).thenReturn(50);

        String actual = printer.print();

        assertEquals("Il totale è: 50", actual);

    }
//
//    public void testxxx() throws Exception {
//        List<Item> itemList = new ArrayList<>();
//        itemList.add(new Item());
//        when(checkout.getItemLists()).thenReturn(itemList);
//
//        String actual = printer.print();
//
//        assertEquals("ItemA 1 \n Il totale è: 50", actual);
//
//
//    }
}
