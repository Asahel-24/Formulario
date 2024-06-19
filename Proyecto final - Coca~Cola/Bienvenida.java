import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Bienvenida extends JFrame implements ActionListener{
    private JTextField textField1;
    private JLabel label1, label2, label3, label4;
    private JButton boton1;
    
    public Bienvenida(){
        setLayout(null);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        ImageIcon imagen = new ImageIcon("images/logo-coca.png");
        label1 = new JLabel(imagen);
        label1.setBounds(25,15,300,150);
        add(label1);

        label2 = new JLabel("Sistema de Control Vacacional");
        label2.setBounds(35,135,300,30);
        label2.setFont(new Font("Andale Mono", 3, 18));
        label2.setForeground(new Color(255,255,255));
        add(label2);

        label3 = new JLabel("Ingresa tu nombre");
        label3.setBounds(45,212,200,30);
        label3.setFont(new Font("Andale Mono", 1,12));
        label3.setForeground(new Color(255,255,255));
        add(label3);

        label4 = new JLabel("©The Coca-Cola Company 2024");
        label4.setBounds(85,375,300,30);
        label4.setFont(new Font("Andale Mono",1,12));
        label4.setForeground(new Color(255,255,255));
        add(label4);

        textField1 = new JTextField();
        textField1.setBounds(45,240,255,25);
        textField1.setFont(new Font("Andale Mono",1,14));
        textField1.setForeground(new Color(255,0,0));
        add(textField1);

        boton1 = new JButton("Ingresar");
        boton1.setBounds(125,280,100,30);
        boton1.setFont(new Font("Andale Mono", 1, 14));
        boton1.setForeground(new Color(255,0,0));
        boton1.addActionListener(this);
        add(boton1);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == boton1){
            System.out.println("Ingresaste al sistema");
        }
    }

    public static void main(String arg[]){
        Bienvenida ventanaBienvenida = new Bienvenida();
        ventanaBienvenida.setBounds(0,0,350,450);
        ventanaBienvenida.setVisible(true);
        ventanaBienvenida.setResizable(true);
        ventanaBienvenida.setLocationRelativeTo(null);
    }
}