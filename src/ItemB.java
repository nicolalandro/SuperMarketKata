
public class ItemB extends Item{


    public ItemB() {
        super('B');
    }

    @Override
    public int getPrice() {
        int quantity = getQuantity();
        int total = 0;
        while (quantity-2>=0){
            quantity = quantity-2;
            total+=45;
        }
        return total+30*quantity;
    }

}
