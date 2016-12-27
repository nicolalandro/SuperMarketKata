import junit.framework.TestCase;

public class ItemBTest extends TestCase{

    ItemB itemB;

    public void setUp() throws Exception {
        super.setUp();
        itemB = new ItemB();
    }

    public void test_getPrice_Expected_30() throws Exception {
        assertEquals(30, itemB.getPrice());
    }

    public void test_getPrice_with_quantity_2_expected_45() throws Exception {
        itemB.setQuantity(2);
        assertEquals(45, itemB.getPrice());

    }
}
