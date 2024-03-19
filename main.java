import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        litros pes1 = new litros();
        pes1.nome = JOptionPane.showInputDialog("Insira o seu nome: ");
        pes1.idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));
        pes1.kg = Float.parseFloat(JOptionPane.showInputDialog("Insira o seu peso: "));

        pes1.status();
        pes1.calcularLitros();
    }
}
