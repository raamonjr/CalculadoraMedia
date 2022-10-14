import com.sun.webkit.ContextMenu;

import javax.swing.*;

public class Calculadora {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Este programa irá calcular a Média de 4 valores");

        String nota1 = JOptionPane.showInputDialog("Informe o valor 1 ");
        String nota2 = JOptionPane.showInputDialog("Informe o valor 2 ");
        String nota3 = JOptionPane.showInputDialog("Informe o valor 3 ");
        String nota4 = JOptionPane.showInputDialog("Informe o valor 4 ");

        double dnota1 = Double.parseDouble(nota1);
        double dnota2 = Double.parseDouble(nota2);
        double dnota3 = Double.parseDouble(nota3);
        double dnota4 = Double.parseDouble(nota4);

        double media = (dnota1 + dnota2 + dnota3 + dnota4) / 4;



        JOptionPane.showMessageDialog(null, "A média é: " + media);

    }
}