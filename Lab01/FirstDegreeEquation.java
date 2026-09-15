package Lab01;
import javax.swing.JOptionPane;
public class FirstDegreeEquation {
    public static void main(String[] args) {
        String strA, strB;
        strA = JOptionPane.showInputDialog("a = ");
        strB = JOptionPane.showInputDialog("b = ");
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        if (a == 0){
            if (b == 0) System.out.println("The equation has infinitely many solutions");
            else System.out.println("The equation has no solution");
        }
        else System.out.println("The equation has a unique solution of " + (b/a));
    }
}
