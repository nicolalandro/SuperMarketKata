
public class ItemA implements Item {

    private int quantity=1;

    @Override
    public int getPrice() {
        int total = 0;
        while (quantity-3>=0){
            quantity = quantity-3;
            total+=130;
        }
        return total+50*quantity;
    }
    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public int getQuantity() {
        return quantity;
    }
}
