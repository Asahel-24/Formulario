import javax.swing.*;
import javax.swing.text.TextAction;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame {

    private JTextField textField1;
    private JScrollPane scrollPane1;
    private JTextArea textArea;
    /*private JButton boton1;
    private  JLabel etiqueta1;*/
    
    public Formulario(){

        setTitle("Formulario");

        setLayout(null);
        textField1 = new JTextField();
        textField1.setBounds(10,10, 200,30);
        add(textField1);

        textArea = new JTextArea();
        scrollPane1 =new JScrollPane(textArea);
        scrollPane1.setBounds(10,50,400,300);
        add(scrollPane1);

        /*setLayout(null);
        boton1 = new JButton("Aceptar");
        boton1.setBounds(10,80,100,30);
        add(boton1);
        boton1.addActionListener(this);*/

    }

    /*public void actionPerformed(ActionEvent e){
        if (e.getSource() == boton1){
            String texto = textField1.getText();
            setTitle(texto);
        }
    }*/

    public static void main(String args []){
        Formulario formulario = new Formulario();
        formulario.setBounds(0,0,540,400);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
        formulario.setResizable(false);
    }
}
