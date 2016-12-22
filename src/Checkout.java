

public class Checkout {


    private String items;


    public void scan(String items) {

        this.items = items;
    }

    public int total() {
        if ("".equals(items)) {
            return 0;
        }
        int total=0;
        for(int indiceStringa = 0; indiceStringa< items.length(); indiceStringa++){

            total += getPriceForItem(items.charAt(indiceStringa));

        }
        return total;
    }

    private int getPriceForItem(char item) {
        switch (item) {
            case 'A':
                return 50;
            case 'B':
                return 30;
        }
        return 0;
    }
}
