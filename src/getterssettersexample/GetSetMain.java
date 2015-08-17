package getterssettersexample;
import javax.swing.JOptionPane;

public class GetSetMain {
    static GettersSettersEtc obj = new GettersSettersEtc();

    public static void main(String[] args) {
        obj.setNum1(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number 1")));
        obj.setNum2(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number 2")));
        JOptionPane.showMessageDialog(null, "You entered numbers " + obj.getNum1() + " and " + obj.getNum2());
    }
}