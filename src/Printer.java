
public class Printer {

    private final Checkout checkout;

    public Printer(Checkout checkout) {
        this.checkout = checkout;
    }

    public String print() {
        StringBuilder stringBuilder = new StringBuilder();

        for(Item item : checkout.getItemsList()){
            stringBuilder.append(item.getName()+" x"+item.getQuantity()+" : "+item.getPrice());
        }

        stringBuilder.append("\nIl totale è: "+checkout.total());
        return stringBuilder.toString();
    }
}
