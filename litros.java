import javax.swing.JOptionPane;

public class litros {
    int idade;
    String nome;
    float resultadoLitros;
    float kg;
    float ml = 35f;

    void status(){
        JOptionPane.showMessageDialog(null, "NOME: " + this.nome + 
                                        "\nIDADE: " + this.idade + 
                                            "\nKG(QUILOGRAMAS): " + this.kg + "kg" );
    }

    void calcularLitros(){
        resultadoLitros = (kg * ml)/1000;
        JOptionPane.showMessageDialog(null, "LITROS DE ÁGUA POR DIA: " + this.resultadoLitros + " Litros" );
    }
}
