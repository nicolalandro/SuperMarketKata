```java
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
}
```
