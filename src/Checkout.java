import java.util.ArrayList;

public class Checkout {
    private ArrayList<Item> itemsList;


    public Checkout() {
        itemsList = new ArrayList() ;
        itemsList.add(new ItemA());
        itemsList.add(new ItemB());
        itemsList.add(new ItemC());
        itemsList.add(new ItemD());
        for(Item item : itemsList){
            item.setQuantity(0);
        }
    }

    public void scan(String items) {
        for(int indiceStringa = 0; indiceStringa< items.length(); indiceStringa++){
            for(Item item : itemsList){
                if(item.getName() == items.charAt(indiceStringa) ){
                    item.setQuantity(item.getQuantity()+1);
                }
            }

        }
    }

    public int total() {
        int total=0;

        for(Item item : itemsList){
            total += item.getPrice();
        }

        return total;
    }

    public ArrayList<Item> getItemsList(){
        ArrayList<Item> items = new ArrayList();
        for(Item item : itemsList){
            if(item.getQuantity()!=0){
                items.add(item);
            }
        }
        return items;
    }

}
