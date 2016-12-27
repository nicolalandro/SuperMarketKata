import junit.framework.TestCase;

public class ItemDTest extends TestCase{
    ItemD itemD;

    public void setUp() throws Exception {
        super.setUp();

        itemD= new ItemD();
    }

    public void test_getPrice_expected_15() throws Exception {
        itemD.setQuantity(1);
        assertEquals(15,itemD.getPrice());

    }
}
