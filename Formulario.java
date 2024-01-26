import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {

    JButton boton1;
   private  JLabel etiqueta1;
   private JLabel etiqueta2;
    
    public Formulario(){

        setLayout(null);
        boton1 = new JButton("Cerrar");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this);

        /*etiqueta1 = new JLabel("Interfaz Grafica");
        etiqueta1.setBounds(10,20,300,30);
        add(etiqueta1);
        etiqueta2 = new JLabel("Version 1.0");
        etiqueta2.setBounds(10,100,100,30);
        add(etiqueta2);*/
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
