

public class Checkout {
    private int specialPriceA=0;
    private int specialPriceB=0;

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

    //TODO parlare del refactoring e sul fare degli oggetti prodotto, che implementano la stessa interfaccia o che sono sottoclassi di qualcosa
    private int getPriceForItem(char item) {
        switch (item) {
            case 'A':
                return getPriceA();
            case 'B':
                return getPriceB();
            case 'C':
                return getPriceC();
            case 'D':
                return getPriceD();
        }
        return 0;
    }

    private int getPriceA(){
        specialPriceA++;
        if(specialPriceA!=3) {
            return 50;
        }
        specialPriceA=0;
        return 30;
    }

    private int getPriceB(){
        specialPriceB++;
        if(specialPriceB!=2){
            return 30;
        }
        specialPriceB=0;
        return 15;
    }

    private int getPriceC(){
        return 20;
    }

    private int getPriceD(){
        return 15;
    }
}
