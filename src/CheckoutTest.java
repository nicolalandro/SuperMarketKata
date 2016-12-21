import junit.framework.TestCase;



public class CheckoutTest extends TestCase {

    public void test_total_0_with_empty_item() throws Exception {
        Checkout checkout = new Checkout();
        checkout.scan("");

        int total = checkout.total();

        assertEquals(0, total);
    }

    public void test_total_50_with_item_A() throws Exception {
        Checkout checkout = new Checkout();
        checkout.scan("A");

        int total = checkout.total();

        assertEquals(50, total);
    }
}
