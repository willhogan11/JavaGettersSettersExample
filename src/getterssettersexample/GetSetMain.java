package getterssettersexample;
import javax.swing.JOptionPane;

public class GetSetMain {
    
    public static void main(String[] args) {
        GettersSettersEtc obj = new GettersSettersEtc();
        obj.setName(JOptionPane.showInputDialog(null, "Enter your Name"));
        obj.setNum1(parseAndJPrint());
        obj.setNum2(parseAndJPrint());
        JOptionPane.showMessageDialog(null, obj);
    } // End main

    public static int parseAndJPrint() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a Number"));
    } // End parseAndJPrint() method
    
} // End class