
public abstract class Item {
    private int quantity;
    private char name;

    public Item(char name) {
        quantity = 0;
        this.name = name;
    }

    abstract int getPrice();

    void setQuantity(int quantity){
        this.quantity = quantity;
    }

    int getQuantity(){
        return quantity;
    }

    public char getName() {
        return name;
    }
}
