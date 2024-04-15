import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class Formulario extends JFrame implements ActionListener, ChangeListener{
    private JLabel labael1;
    private JCheckBox check1;
    private JButton boton1;

    public Formulario(){
        setLayout(null);
        labael1 = new JLabel("Aceptar terminos y condiciones");
        labael1.setBounds(10,10,400,30);
        add(labael1);

        check1 = new JCheckBox("Acepto");
        check1.setBounds(10,50,100,30);
        check1.addChangeListener(this);
        add(check1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10,100,100,30);
        boton1.setBackground(new Color(255, 0, 23));
        add(boton1);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
    }
//Para el chekBox
    public void stateChanged(ChangeEvent e){
        if (check1.isSelected() == true){
            boton1.setBackground(new Color(12, 211, 22));
            boton1.setEnabled(true);
        } else {
            boton1.setBackground(new Color(255, 0, 23));
            boton1.setEnabled(false);
        }
    }
//Para el boton aceptar
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == boton1){
            System.exit(0);
        }
    }

    public static void main(String args[]){
        Formulario formulario = new Formulario();
        formulario.setBounds(0,0,350,200);
        formulario.setResizable(false);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
    }

}