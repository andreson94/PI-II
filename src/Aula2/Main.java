package Aula2;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        Runnable t = new Runnable() {
            public void run() {
                criarGUI();
            }
        };
        SwingUtilities.invokeLater(t);
        
    }
    public static void criarGUI(){
        /*criando uma tela e dimencionando-a e adicionando opção de saida
        @JFrame
        @MinimumSize
        @setDefaultCloseOperation
        */
        JFrame tela = new JFrame();
        Dimension d = new Dimension(400,600);
        tela.setMinimumSize(d);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setTitle("Swing App 02");

        //criando painel(tela sobre tela)
        JPanel panel = new JPanel();
        tela.getContentPane().add(panel);

        //criando uma saida de "dados" (texto...)
        JLabel label = new JLabel("Nome"); 
        panel.add(label);
        
        //criando uma entrada de dados (texto...)
        JTextField field = new JTextField(10);
        panel.add(field);
        
        //criando botões
        JButton button = new JButton("Clique Aqui");
        panel.add(button);

        //calculando uma tela altomaticamente
        tela.pack();
        tela.setVisible(true);
        
    }
}
