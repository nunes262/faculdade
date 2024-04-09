import javax.swing.JOptionPane;

public class exercicio21 {
    public static void main(String[] args) {
        String inpuString = JOptionPane.showInputDialog("DIgite um número: ");
        int inputInt = Integer.parseInt(inpuString);
        inputInt++;
        System.out.println(inputInt);
    }
}
