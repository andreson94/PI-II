package Aula03;

import com.sun.management.jmx.Trace;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
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
        JFrame frame = new JFrame();
        Dimension d = new Dimension(400,600);
        frame.setMinimumSize(d);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swing App 02");

        //criando painel(tela sobre tela)
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        
        JRadioButton radio01 = new JRadioButton();
        panel.add(radio01);
        
        JRadioButton radio02 = new JRadioButton();
        panel.add(radio02);
        
        ButtonGroup group = new ButtonGroup();
        group.add(radio01);
        group.add(radio02);
        
        Button button = new Button("Botão");
        panel.add(button);
        
        String[] opcoesCombo = {"Selecione ","opção 01","opção 02","opção 03",
            "opção 04","opção 05"};
        JComboBox comboBox = new JComboBox(opcoesCombo);
        panel.add(comboBox);
        
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"opção 1: "
                        +radio01.isSelected()+"\nopção02: "
                        +radio02.isSelected()+"\nopção Selecionada:"
                        +comboBox.getSelectedItem());
                
            }

        };
        button.addActionListener(listener);

        //calculando uma tela altomaticamente
        frame.pack();
        frame.setVisible(true);
        
    }
}
