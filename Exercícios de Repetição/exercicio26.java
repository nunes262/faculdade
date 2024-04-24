import javax.swing.JOptionPane;

public class exercicio26 {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Qual é o seu nome?");
        String animal = JOptionPane.showInputDialog(null, "Qual é o seu animal favorito?");
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos anos você tem?"));
        double weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o seu peso em kg?"));

        int futureAge = age + 10;
        double futureWeight = weight * 2.0;

        String story = "Olá, " + name + "!\n\n" +
                "Imagine um mundo onde os " + animal + "s dominam tudo!\n" +
                "Você, aos " + age + " anos de idade, é considerado um herói na terra dos " + animal + "s.\n" +
                "Em breve, você terá " + futureAge + " anos e seu peso será de " + futureWeight + " kg!\n\n" +
                "A história continua...\n";

        JOptionPane.showMessageDialog(null, story);
    }
}
