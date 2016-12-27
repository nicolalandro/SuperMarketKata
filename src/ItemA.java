
public class ItemA extends Item {

    public ItemA() {
        super('A');
    }

    @Override
    public int getPrice() {
        int quantity = getQuantity();
        int total = 0;
        while (quantity-3>=0){
            quantity = quantity - 3;
            total+=130;
        }
        return total+50*quantity;
    }

}
