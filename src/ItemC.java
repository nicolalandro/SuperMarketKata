
public class ItemC extends Item{


    public ItemC() {
        super('C');
    }

    @Override
    public int getPrice() {
        return 20*getQuantity();
    }
}
