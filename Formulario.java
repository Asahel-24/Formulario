package formulario;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {

    private JButton boton1, boton2, boton3;

    private  JLabel etiqueta1;
    
    public Formulario(){

        setLayout(null);
        boton1 = new JButton("1");
        boton1.setBounds(10,100,90,30);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("2");
        boton2.setBounds(110,100,90,30);
        add(boton2);
        boton2.addActionListener(this);

        boton3 =new JButton("3");
        boton3.setBounds(210, 100, 90, 30);
        add(boton3);
        boton3.addActionListener(this);



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
