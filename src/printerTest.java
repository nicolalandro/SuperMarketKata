import junit.framework.TestCase;

import java.util.ArrayList;

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
        printer = new Printer(checkout);
    }

    public void test_verify_to_invoke_total() throws Exception {
        printer.print();
        verify(checkout).total(); //verifica che il metodo è stato chiamato
    }

    public void test_print_void() throws Exception {
        assertEquals("\nIl totale è: 0", printer.print());
    }

    public void test_print_with_value() throws Exception {
//        checkout.scan("A");
        when(checkout.total()).thenReturn(50);

        String actual = printer.print();

        assertEquals("\nIl totale è: 50", actual);

    }



    public void test_print_with_itemA() throws Exception {
        ArrayList<Item> itemList = new ArrayList();
        itemList.add(new ItemA());
        itemList.get(0).setQuantity(1);

        when(checkout.getItemsList()).thenReturn(itemList);
        when(checkout.total()).thenReturn(50);

        String actual = printer.print();

        assertEquals("A x1 : 50" +
                "\nIl totale è: 50", actual);


    }
}
