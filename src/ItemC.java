
public class ItemC implements Item{

    private int quantity=1;

    @Override
    public int getPrice() {
        return 20*quantity;
    }
    @Override
    public int getQuantity() {
        return quantity;
    }
    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
