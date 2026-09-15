package Lab01;

import javax.swing.JOptionPane;
public class LinearSystem {
    public static void main(String[] args) {
        String strA11,strA12, strB1, strA21,strA22, strB2;
        strA11 = JOptionPane.showInputDialog("a11 = ");
        strA12 = JOptionPane.showInputDialog("a12 = ");
        strB1 = JOptionPane.showInputDialog("b1 = ");
        strA21 = JOptionPane.showInputDialog("a21 = ");
        strA22 = JOptionPane.showInputDialog("a22 = ");
        strB2 = JOptionPane.showInputDialog("b2 = ");
        double a11,a12,a21,a22,b1,b2;
        a11 = Double.parseDouble(strA11);
        a12 = Double.parseDouble(strA12);
        a21 = Double.parseDouble(strA21);
        a22 = Double.parseDouble(strA22);
        b1 = Double.parseDouble(strB1);
        b2 = Double.parseDouble(strB2);
        double d = a11 * a22 - a12 * a21;
        double d1 = b1 * a22 - b2 * a12;
        double d2 = a11 * b2 - b1 * a21;
        if (d == 0){
            if (d1 == 0 && d2 ==0) System.out.println("The linear system has infinite solution!");
            else System.out.println("The linear system has no solution!");
        }
        else System.out.println("The linear system has a unique solution: x = " + (d1/d) +", y = " + (d2/d));
    }
}
