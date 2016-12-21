

public class Checkout {


    private String item;

    public void scan(String s) {

        item = s;
    }

    public int total() {
        if (item.isEmpty()) {
            return 0;
        }
        return 50;
    }
}
