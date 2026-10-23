package Lab04.AimsProject.src;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered >= MAX_NUMBERS_ORDERED){
            System.out.println("The cart is almost fully");
            return;
        }
        itemsOrdered[qtyOrdered++] = disc;
        System.out.println("The " + disc.getTitle() +" disc has been added ");
        return;
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for (int i=0; i< qtyOrdered; i++){
            if (itemsOrdered[i] == disc){
                for (int j=i; j<qtyOrdered; j++) 
                    itemsOrdered[i] = itemsOrdered[i+1];
                System.out.println("The "+ disc.getTitle() +" disc has been removed");
                itemsOrdered[--qtyOrdered] = null;
                return;
            }
        }
        System.out.println("This disc is not in the disc");
        return;
    }
    public float totalCost(){
        float sum = 0;
        for (int i=0; i<qtyOrdered; i++){
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }
    public void displayOrdered(){
        System.out.println("The list of disc ordered is: ");
        for (int i=0; i<qtyOrdered; i++){
            System.out.println((i+1) + ". " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCost());
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList){
        for (DigitalVideoDisc disc: dvdList) 
            addDigitalVideoDisc(disc);
    }
    // public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
    //     for (int i=0; i<dvdList.length; i++){
    //         if (qtyOrdered >= MAX_NUMBERS_ORDERED - 1){
    //             System.out.println("The cart is almost fully");
    //             return;
    //         }
    //         itemsOrdered[qtyOrdered++] = dvdList[i];
    //         System.out.println("The " + dvdList[i].getTitle() +" disc has been added ");
    //     }  
    // }
    public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2){
        if (qtyOrdered >= MAX_NUMBERS_ORDERED - 1){
            System.out.println("The cart is almost fully");
            return;
        }
        itemsOrdered[qtyOrdered++] = disc1;
        itemsOrdered[qtyOrdered++] = disc2;
        System.out.println("The " + disc1.getTitle() +" disc has been added ");
        System.out.println("The " + disc2.getTitle() +" disc has been added ");
        
    }
}
