
public class Printer {

    private final Checkout checkout;

    public Printer(Checkout checkout) {
        this.checkout = checkout;
    }

    public String print() {
        return "Il totale è: "+checkout.total();
    }
}
