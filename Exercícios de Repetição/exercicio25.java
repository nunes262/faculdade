import javax.swing.JOptionPane;

public class exercicio25 {
    public static void main(String[] args) {
        String Stridade = JOptionPane.showInputDialog("Coloque sua idade: ");
        int intidade = Integer.parseInt(Stridade);

        if (intidade >= 18) {
            JOptionPane.showMessageDialog(null, "Maior de idade", "Sua idade", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Menor de idade", "Sua idade", 2);
        }

    }
}