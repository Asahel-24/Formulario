package formulario;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {

    private JTextField textField1;
    private JButton boton1;
    private  JLabel etiqueta1;
    
    public Formulario(){

        setLayout(null);
        etiqueta1 = new JLabel("Usuario");
        etiqueta1.setBounds(10,10, 100,30);
        add(etiqueta1);

        textField1  = new JTextField();
        textField1.setBounds(120,17,150,20);
        add(textField1);

        setLayout(null);
        boton1 = new JButton("Aceptar");
        boton1.setBounds(10,80,100,30);
        add(boton1);
        boton1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == boton1){
            System.exit(0);
        }
    }

    public static void main(String args []){
        Formulario formulario = new Formulario();
        formulario.setBounds(0,0,450,350);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
        formulario.setResizable(false);
    }
}
