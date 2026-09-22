package Lab02;

import java.util.Scanner;

public class DaysOfMonth {
     public static int getMonth(String input){
        String [][] month = {
            {"January", "Jan.", "Jan", "1"},
            {"February", "Feb.", "Feb", "2"},
            {"March", "Mar.", "Mar", "3"},
            {"April", "Apr.", "Apr", "4"},
            {"May", "May.", "May", "5"},
            {"June", "June", "Jun", "6"},
            {"July", "July", "Jul", "7"},
            {"August", "Aug.", "Aug", "8"},
            {"September", "Sept.", "Sep", "9"},
            {"October", "Oct.", "Oct", "10"},
            {"November", "Nov.", "Nov", "11"},
            {"December", "Dec.", "Dec", "12"}
        };
        for (int i=0; i<12; i++){
            for (int j=0; j<4; j++){
                if (month[i][j].equals(input)) return i+1;
            }
        }
        return -1;
    }
    public static int isLeapYear(int input){
        if (input % 4 ==0 ){
            if (input % 100 ==0 && input %4 !=0) return 0;
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month: ");
        String strMonth = input.nextLine();
        while(-1 == getMonth(strMonth)){
            System.out.print("Invalid month! Enter month again: ");
            strMonth = input.nextLine();
        }
        int month = getMonth(strMonth);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        if (month == 2){
            if (isLeapYear(year) == 0){
                System.out.println("The number of days: 29");
            }
            else System.out.print("The number of days: 28");
            System.exit(0);
        }
        int month_31[] = {1,3,5,7,8,10,12};
        for (int i=0; i<7; i++){
            if (month == month_31[i]){
                System.err.println("The number of days: 31");
                System.exit(0);
            }
        }
        int month_30[] = {4,6,9,11};
        for (int i=0; i<4; i++){
            if (month == month_30[i]){
                System.err.println("The number of days: 30");
                System.exit(0);
            }
        }
    }
}
