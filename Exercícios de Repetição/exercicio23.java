import javax.swing.JOptionPane;

public class exercicio23 {
    public static void main(String[] args) {
        String[] valoresAceitos = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        String input = (String) JOptionPane.showInputDialog(null, "Fala alguma coisa ai", "Titulo", 2, null,
                valoresAceitos, valoresAceitos[0]);
        System.out.println("valor escolhido: " + input);
    }
}
