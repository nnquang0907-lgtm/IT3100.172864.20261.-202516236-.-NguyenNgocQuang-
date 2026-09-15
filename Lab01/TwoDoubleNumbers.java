package Lab01;
import javax.swing.JOptionPane;
public class TwoDoubleNumbers {
    public static void main(String[] args){
        String strNum1,strNum2;
        strNum1 = JOptionPane.showInputDialog("First number: ");
        double num1 = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog("Second number: ");
        double num2 = Double.parseDouble(strNum2);
        System.out.println("Sum = " + (num1 + num2));
        System.out.println("Difference = " + (num1 - num2));
        System.out.println("Product = " + (num1 * num2));
        if (num2 == 0){
            System.out.println("Undefined quotient");
        }
        else {
            System.out.println("Quotient = " + (num1 / num2));
        }
    }
}
