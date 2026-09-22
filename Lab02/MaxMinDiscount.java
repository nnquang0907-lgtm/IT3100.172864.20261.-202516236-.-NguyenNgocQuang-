package Lab02;

public class MaxMinDiscount {
    public static void main(String[] args) {
      String title[] = {"Lion King", "Star Wars", "Aladin", "Frozen","Coco"};
      double cost[] = {19.95,19,20,21,21.95};
      int minIdx = 0, maxIdx = 0;
      double sum = 0;
      for (int i=0; i<cost.length; i++){
        if(cost[i] > cost[maxIdx]) maxIdx = i;
        if (cost[i] < cost[minIdx]) minIdx = i;
        if (cost[i] > 20) sum  += cost[i] * 0.9;
        else sum += cost[i];
      }
      System.out.println("Max: " + title[maxIdx] + " - " + cost[maxIdx]);
      System.out.println("Min: " + title[minIdx] + " - " + cost[minIdx]);
      System.out.println("Total after discount: " + sum);
    } 

}
