import junit.framework.TestCase;


public class CheckoutTest extends TestCase {


    private Checkout checkout;

    public void setUp() throws Exception {
        super.setUp();
        checkout = new Checkout();
    }


    public void test_total_0_with_empty_item() throws Exception {
        checkout.scan("");

        int total = checkout.total();

        assertEquals(0, total);
    }

    public void test_total_50_with_item_A() throws Exception {
        checkout.scan("A");

        int total = checkout.total();

        assertEquals(50, total);
    }
}
