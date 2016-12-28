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
//        CheckoutMock = new Checkout();
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
//        CheckoutMock.scan("A");
        when(checkoutMock.total()).thenReturn(50);

        String actual = printer.print();

        assertEquals("\nIl totale è: 50", actual);

    }


    private void set_checkoutMock_getItemsList_with_one_itemA_and_total_with_50(){
        ArrayList<Item> itemList = new ArrayList();
        ItemA itemA = new ItemA();
        itemA.setQuantity(1);
        itemList.add(itemA);

        when(checkoutMock.getItemsList()).thenReturn(itemList);
        when(checkoutMock.total()).thenReturn(50);
    }

    public void test_printer_prints_right_string_with_item_A() throws Exception {
        set_checkoutMock_getItemsList_with_one_itemA_and_total_with_50();

        String actual = printer.print();

        assertEquals("A x1 : 50" +
                "\nIl totale è: 50", actual);

    }

    public void test_printer_gets_items_from_checkout() throws Exception {
        set_checkoutMock_getItemsList_with_one_itemA_and_total_with_50();

        printer.print();

        verify(checkoutMock).getItemsList();
    }

    public void test_printer_gets_items_from_personalCheckoutMock() throws Exception {
        CheckoutMock checkoutMock = new CheckoutMock();
        printer = new Printer(checkoutMock);

        ArrayList<Item> itemList = new ArrayList();
        ItemA itemA = new ItemA();
        itemA.setQuantity(1);
        itemList.add(itemA);


        checkoutMock.when_getItemsList_ThenReturn(itemList);
        checkoutMock.when_total_ThenReturn(50);

        printer.print();

        checkoutMock.verifyGetItemList();
    }

    public void test_printer_prints_right_string_with_item_A_from_personalCheckoutMock() throws Exception {
        CheckoutMock checkoutMock = new CheckoutMock();
        printer = new Printer(checkoutMock);

        ArrayList<Item> itemList = new ArrayList();
        ItemA itemA = new ItemA();
        itemA.setQuantity(1);
        itemList.add(itemA);


        checkoutMock.when_getItemsList_ThenReturn(itemList);
        checkoutMock.when_total_ThenReturn(50);

        String actual = printer.print();

        assertEquals("A x1 : 50" +
                "\nIl totale è: 50", actual);
    }


}
