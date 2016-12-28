import java.util.ArrayList;

import static junit.framework.Assert.assertTrue;

public class CheckoutMock extends Checkout{
    public void scan(String items){
        scanIsUsed = true;
    }

    public int total(){
        totalIsUsed = true;
        return totalReturn;
    }

    public ArrayList<Item> getItemsList(){
        getItemListIsUsed = true;
        return getItemListReturn;
    }


    private boolean scanIsUsed = false;

    private boolean totalIsUsed = false;
    private int totalReturn = 0;

    private boolean getItemListIsUsed = false;
    private ArrayList<Item> getItemListReturn = null;


    public void verifyScan() {
        assertTrue(scanIsUsed);
    }

    public void verifyTotal() {
        assertTrue(totalIsUsed);
    }

    public void verifyGetItemList() {
        assertTrue(getItemListIsUsed);
    }

    public void when_total_ThenReturn(int totalReturn) {
        this.totalReturn = totalReturn;
    }

    public void when_getItemsList_ThenReturn(ArrayList<Item> getItemListReturn) {
        this.getItemListReturn = getItemListReturn;
    }
}
