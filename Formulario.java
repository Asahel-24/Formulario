import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
    private JMenuBar menuBar;
    private JMenu menu1,menu2,menu3;
    private JMenuItem menuItem1,menuItem2,menuItem3,menuItem4;

    public Formulario(){
        setLayout(null);
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        menu1 = new JMenu("Opciones");
        menuBar.add(menu1);

        menu2 = new JMenu("Tamaño de Ventana");
        menu1.add(menu2);

        menu3 = new JMenu("Color de Fondo");
        menu1.add(menu3);

        //Tamaño de ventana
        menuItem1 = new JMenuItem("300 x 200");
        menu2.add(menuItem1);
        menuItem1.addActionListener(this);

        menuItem2 = new JMenuItem("600 x 480");
        menu2.add(menuItem2);
        menuItem2.addActionListener(this);

        //Color de fondo
        menuItem3 = new JMenuItem("Rojo");
        menu3.add(menuItem3);
        menuItem3.addActionListener(this);

        menuItem4 = new JMenuItem("Verde");
        menu3.add(menuItem4);
        menuItem4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == menuItem1){
            setSize(300,200);
        }

        if(e.getSource() == menuItem2){
            setSize(600,480);
        }

        if(e.getSource() == menuItem3){
            getContentPane().setBackground(new Color(255,0,0));
        }
        if (e.getSource() == menuItem4){
            getContentPane().setBackground(new Color(0,255,0));
        }
    }

    public static void main(String args[]){
        Formulario formulario = new Formulario();
        formulario.setBounds(0,0,300,200);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
    }

}