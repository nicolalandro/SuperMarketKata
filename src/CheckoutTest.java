import junit.framework.TestCase;

import java.util.ArrayList;


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

    public void test_total_80_with_AB() throws Exception {
        checkout.scan("AB");

        int total = checkout.total();

        assertEquals(80, total);

    }


    //TODO da solo

    public void test_total_115_with_CDBA() throws Exception {
        checkout.scan("CDBA");

        int total = checkout.total();

        assertEquals(115, total);

    }

    public void test_total_100_with_AA() throws Exception {
        checkout.scan("AA");

        int total = checkout.total();

        assertEquals(100, total);
    }

    public void test_total_100_with_Ax3() throws Exception {
        checkout.scan("AAA");

        int total = checkout.total();

        assertEquals(130, total);
    }

    public void test_total_180_with_Ax4() throws Exception {
        checkout.scan("AAAA");

        int total = checkout.total();

        assertEquals(180, total);
    }

    public void test_total_230_with_Ax5() throws Exception {
        checkout.scan("AAAAA");

        int total = checkout.total();

        assertEquals(230, total);
    }

    public void test_total_260_with_Ax6() throws Exception {
        checkout.scan("AAAAAA");

        int total = checkout.total();

        assertEquals(260, total);
    }

    public void test_total_160_with_Ax3_B() throws Exception {
        checkout.scan("AAAB");

        int total = checkout.total();

        assertEquals(160, total);
    }

    public void test_total_175_with_Ax3_Bx2() throws Exception {
        checkout.scan("AAABB");

        int total = checkout.total();

        assertEquals(175, total);
    }

    public void test_total_190_with_Ax3_Bx2_D() throws Exception {
        checkout.scan("AAABBD");

        int total = checkout.total();

        assertEquals(190, total);
    }

    //TODO 2 assert??
    public void test_getItemsList() throws Exception {
        checkout.scan("A");

        ArrayList<Item> list = checkout.getItemsList();
        int actualQuantity = list.get(0).getQuantity();
        char actualItem = list.get(0).getName();

        assertEquals(1, actualQuantity);
        assertEquals('A', actualItem);
    }

}
