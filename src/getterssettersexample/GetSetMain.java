package getterssettersexample;
import javax.swing.JOptionPane;

public class GetSetMain {
    
    public static void main(String[] args) {
        GettersSettersEtc obj = new GettersSettersEtc();
        obj.setNum1(parseAndJPrint());
        obj.setNum2(parseAndJPrint());
        JOptionPane.showMessageDialog(null, "You entered numbers " + obj.getNum1() + " and " + obj.getNum2());
    }

    public static int parseAndJPrint() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a Number"));
    }
}