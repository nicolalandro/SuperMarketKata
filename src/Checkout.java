

public class Checkout {


    private String item;

    public void scan(String s) {

        item = s;
    }

    public int total() {
        if ("".equals(item)) {
            return 0;
        }
        int total=0;
        for(int indiceStringa=0; indiceStringa<item.length();indiceStringa++){
            if(item.charAt(indiceStringa)=='A'){
                total+=50;
            }
            else if(item.charAt(indiceStringa)=='B'){
                total+=30;
            }
        }
        return total;
    }
}
