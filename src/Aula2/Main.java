package Aula2;

import com.sun.management.jmx.Trace;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
        
        //criando um checkbox
        JCheckBox checkbox01 = new JCheckBox("item 01");
        panel.add(checkbox01);
        
        ItemListener itemlistener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()== ItemEvent.SELECTED);
                System.out.println("Selecionado");
            }
        };
        checkbox01.addItemListener(itemlistener);
        
        JCheckBox checkbox02 = new JCheckBox("item 02");
        panel.add(checkbox02);
        
        JButton button1 = new JButton("botão 01");
        panel.add(button1);
        button1.addActionListener (new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(tela,"item 01" + checkbox01.isSelected()+"\nitem 01"
                    +checkbox02.isSelected());
            }

 });
        
        
        //criando uma saida de "dados" (texto...)
        JLabel label = new JLabel("Nome"); 
        panel.add(label);
        
        //criando uma entrada de dados (texto...)
        final JTextField field = new JTextField(10);
        panel.add(field);
        
        //criando botões
        JButton button = new JButton("Clique Aqui");
        panel.add(button);
        
        //configurando o listener no botão
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(tela,field.getText()); 
            }
        });
        
        
        //calculando uma tela altomaticamente
        tela.pack();
        tela.setVisible(true);
        
    }
}
