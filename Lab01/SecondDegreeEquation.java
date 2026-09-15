package Lab01;
import javax.swing.JOptionPane;
public class SecondDegreeEquation {
    public static void main(String[] args) {
        String strA,strB,strC;
        strA = JOptionPane.showInputDialog("a = ");
        strB = JOptionPane.showInputDialog("b = ");
        strC = JOptionPane.showInputDialog("c = ");
        double a,b,c;
        a = Double.parseDouble(strA);
        b = Double.parseDouble(strB);
        c = Double.parseDouble(strC);
        double delta = b*b - 4*c*a;
        if (delta<0) System.out.println("The equation has no root!");
        else if(delta == 0){
            System.out.println("The equation has a double root at x = " + (-b/(2*a)));
        }
        else{
            double can = Math.sqrt(delta);
            System.out.println("The equation has 2 roots at x1 = " + (-b+can)/(2*a) + 
                                " and x2 = " + (-b-can)/(2*a));
        }
    }
}
