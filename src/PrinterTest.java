import junit.framework.TestCase;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PrinterTest extends TestCase{
    Checkout checkoutMock;
    Printer printer;

    public void setUp() throws Exception {
        super.setUp();
//        checkoutMock = new Checkout();
        checkoutMock = mock(Checkout.class);
        printer = new Printer(checkoutMock);
    }

    public void test_verify_total() throws Exception {
        printer.print();
        verify(checkoutMock).total(); //verifica che il metodo è stato chiamato
    }

    public void test_print_void() throws Exception {
        assertEquals("\nIl totale è: 0", printer.print());
    }

    public void test_print_with_value() throws Exception {
//        checkoutMock.scan("A");
        when(checkoutMock.total()).thenReturn(50);

        String actual = printer.print();

        assertEquals("\nIl totale è: 50", actual);

    }



    public void test_print_with_itemA_assert() throws Exception {
        ArrayList<Item> itemList = new ArrayList();
        itemList.add(new ItemA());
        itemList.get(0).setQuantity(1);

        when(checkoutMock.getItemsList()).thenReturn(itemList);
        when(checkoutMock.total()).thenReturn(50);

        String actual = printer.print();

        assertEquals("A x1 : 50" +
                "\nIl totale è: 50", actual);

    }

    public void test_print_with_itemA_verify_gettItemsList() throws Exception {
        ArrayList<Item> itemList = new ArrayList();
        itemList.add(new ItemA());
        itemList.get(0).setQuantity(1);

        when(checkoutMock.getItemsList()).thenReturn(itemList);
        when(checkoutMock.total()).thenReturn(50);

        String actual = printer.print();

        verify(checkoutMock).getItemsList();
    }


}
