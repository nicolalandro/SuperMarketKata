import junit.framework.TestCase;

public class ItemATest extends TestCase {
    private ItemA itemA;

    public void setUp() throws Exception {
        super.setUp();
        itemA = new ItemA();
    }

    public void test_getPrice_expected_50() throws Exception {
        itemA.setQuantity(1);
         assertEquals(50,itemA.getPrice());
    }

    public void test_getPricea_with_3_elements_expected_130() throws Exception {
        itemA.setQuantity(3);

        assertEquals(130,itemA.getPrice());
    }

    public void testgetPricea_with_5_elements_expected_230()throws Exception{
        itemA.setQuantity(5);

        assertEquals(230,itemA.getPrice());
    }

    public void test_getPricea_with_6_elements_expected_260() throws Exception {
        itemA.setQuantity(6);

        assertEquals(260,itemA.getPrice());

    }
}
