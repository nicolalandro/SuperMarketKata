
import junit.framework.TestCase;

public class ItemCTest extends TestCase{
    ItemC itemC;

    public void setUp() throws Exception {
        super.setUp();
        itemC = new ItemC();
    }

    public void test_getPrice_expected_20() throws Exception {
        itemC.setQuantity(1);
        assertEquals(20,itemC.getPrice());

    }
}
