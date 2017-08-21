package br.com.andreson;

import java.awt.Dimension;
import javax.swing.JFrame;
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
        JFrame tela = new JFrame();
        Dimension d = new Dimension(400,600);
        tela.setMinimumSize(d);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setTitle("Swing App 02");
        
        tela.pack();
        tela.setVisible(true);
        
    }
}
