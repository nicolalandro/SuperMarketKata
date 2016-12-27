
public class ItemB implements Item{

    private int quantity=1;

    @Override
    public int getPrice() {
        int total = 0;
        while (quantity-2>=0){
            quantity = quantity-2;
            total+=45;
        }
        return total+30*quantity;
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
