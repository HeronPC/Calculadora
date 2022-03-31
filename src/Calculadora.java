import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.BorderFactory.createEmptyBorder;

public class Calculadora extends JFrame {
    int numBotones = 17;
    
    public static void main(String args[]) {
        Calculadora aplicacion = new Calculadora();
    }

    public Calculadora() {
        



        super("Calculadora");
        setLayout(new BorderLayout());
        JPanel Botones = new JPanel(new FlowLayout());
        JButton BC1 = new JButton("Calculadora Básica");
        BC1.setPreferredSize(new Dimension(220, 30));
        JButton BC2 = new JButton("Calculadora Programador");
        BC2.setPreferredSize(new Dimension(220, 30));
        Botones.add(BC1);
        Botones.add(BC2);
        add(Botones);
        setSize(300, 130);
        Botones.setBorder(createEmptyBorder(5, 5, 5, 5));
        setVisible(true);
        ActionListener Actionboton = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (BC1.isSelected()){
                    
                }else if(BC2.isSelected()){

                }
            }
        };
        BC1.addActionListener(Actionboton);
        BC2.addActionListener(Actionboton);
    }
}