
public class ItemD extends Item{

    public ItemD() {
        super('D');
    }

    @Override
    public int getPrice() {
        return 15*getQuantity();
    }

}
