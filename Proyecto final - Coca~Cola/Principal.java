import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Principal extends JFrame implements ActionListener{
    private JMenuBar menuBar;
    private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
    private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
    private JLabel labelLogo, labelBienvenido, labelTitulo, labelNombre, labelPaterno, labelMaterno,
                   labelDepartamento, labelAntiguedad, labelResultado, labelFooter;
    private JTextField txtNombreTrabajador, txtAPaternoTrabajador, txtAMaternoTrabajador;
    @SuppressWarnings("rawtypes")
    private JComboBox cBoxDepartamento, cBoxAntiguedad;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;

    /*Constructor*/
    @SuppressWarnings("unchecked")
    public Principal(){
        setLayout(null);
        setTitle("Pantalla pricipal");  //<<===Cambia el titulo de la interfaz
        getContentPane().setBackground(new Color(255,0,0));  //<---Cambia el color de toda la interfaz
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());  /*<<---Cambia la imagen icon */

        menuBar = new JMenuBar();
        menuBar.setBackground(new Color(255,0,0));
        setJMenuBar(menuBar);
    //Los 3 menus principales >>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(255,0,0));
        menuOpciones.setFont(new Font("Andale Mono", 1, 14));
        menuOpciones.setForeground(new Color(255,255,255));
        menuBar.add(menuOpciones);

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(255,0,0));
        menuCalcular.setFont(new Font("Andale Mono", 1, 14));
        menuCalcular.setForeground(new java.awt.Color(255,255,255));
        menuBar.add(menuCalcular);

        menuAcercaDe = new JMenu("Acerca de");
        menuAcercaDe.setBackground(new Color(255,0,0));
        menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
        menuAcercaDe.setForeground(new Color(255,255,255));
        menuBar.add(menuAcercaDe);
    //*******************SUBMENUS***************************
        menuColorFondo = new JMenu("Color De Fondo");
        menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
        menuColorFondo.setForeground(new Color(255,0,0));
        menuOpciones.add(menuColorFondo);

        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.setFont(new Font("Andale Mono", 1 ,14));
        miCalculo.setForeground(new Color(255,0,0));
        menuCalcular.add(miCalculo);
        miCalculo.addActionListener(this);

        miRojo = new JMenuItem("Rojo");
        miRojo.setFont(new Font("Andale Mono", 1, 14));
        miRojo.setForeground(new Color(255,0,0));
        menuColorFondo.add(miRojo);
        miRojo.addActionListener(this);

        miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font("Andale Mono", 1, 14));
        miNegro.setForeground(new Color(255,0,0));
        menuColorFondo.add(miNegro);
        miNegro.addActionListener(this);

        miMorado = new JMenuItem("Morado");
        miMorado.setFont(new Font("Andale Mono",1, 14));
        miMorado.setForeground(new Color(255,0,0));
        menuColorFondo.add(miMorado);
        miMorado.addActionListener(this);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono", 1 , 14));
        miNuevo.setForeground(new Color(255,0,0));
        menuAcercaDe.add(miNuevo);
        miNuevo.addActionListener(this);

        miElCreador = new JMenuItem("El Creador");
        miElCreador.setFont(new Font("Andale Mono", 1, 14));
        miElCreador.setForeground(new Color(255,0,0));
        menuAcercaDe.add(miElCreador);
        miElCreador.addActionListener(this);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono", 1, 12));
        miSalir.setForeground(new Color(255,0,0));
        menuAcercaDe.add(miSalir);
        miSalir.addActionListener(this);

        ImageIcon imagen = new ImageIcon("images/logo-coca.png");
        labelLogo = new JLabel(imagen);
        labelLogo.setBounds(5,5,250,100);
        add(labelLogo);

        labelBienvenido = new JLabel("Bienvenido");
        labelBienvenido.setBounds(280,30,300,50);
        labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
        labelBienvenido.setForeground(new Color(255,255,255));
        add(labelBienvenido);

        labelTitulo = new JLabel("Datos del Trabajador para el calculo de vacaciones");
        labelTitulo.setBounds(45,140,900,25);
        labelBienvenido.setFont(new Font("Andale Mono", 0, 24));
        labelTitulo.setForeground(new Color(255,255,255));
        add(labelTitulo);
        //*********************************************//
        labelNombre = new JLabel("Nombre completo");
        labelNombre.setBounds(25,188,180,25);
        labelNombre.setFont(new Font("Andale mono", 1, 12));
        labelNombre.setForeground(new Color(255,255,255));
        add(labelNombre);
        
        txtNombreTrabajador = new JTextField();
        txtNombreTrabajador.setBounds(25,213,150,25);
        txtNombreTrabajador.setBackground(new java.awt.Color(224,224,224));  /*<<<<----Para cambiar el color de fondo del textField se utliza la funcion java.awt.Color */
        txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));  /*<<<<----Para cambier el tamaño y el tipo de letra en el TextField se usa el java.awt.Font */
        txtNombreTrabajador.setForeground(new java.awt.Color(255,0,0));  /*<<<<----- Para cambiar el color de letra en un TextField se usa java.awt.Color */
        add(txtNombreTrabajador);

        labelPaterno = new JLabel("Apellido Paterno");
        labelPaterno.setBounds(25,248,180,25);
        labelPaterno.setFont(new Font("Anadale Mono", 1, 12));
        labelPaterno.setForeground(new Color(255,255,255));
        add(labelPaterno);

        txtAPaternoTrabajador = new JTextField();
        txtAPaternoTrabajador.setBounds(25,273,150,25);
        txtAPaternoTrabajador.setBackground(new java.awt.Color(224,224,224));
        txtAPaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtAPaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
        add(txtAPaternoTrabajador);

        labelMaterno = new JLabel("Apelllido Materno");
        labelMaterno.setBounds(25,308,180,25);
        labelMaterno.setFont(new Font("Andale Mono", 1, 12));
        labelMaterno.setForeground(new java.awt.Color(255,255,255));
        add(labelMaterno);

        txtAMaternoTrabajador = new JTextField();
        txtAMaternoTrabajador.setBounds(25,334,150,25);
        txtAMaternoTrabajador.setBackground(new java.awt.Color(224,224,224));
        txtAMaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtAMaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
        add(txtAMaternoTrabajador);

        labelDepartamento = new JLabel("Seleciona el Departamento");
        labelDepartamento.setBounds(220,188,180,25);
        labelDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 12));
        labelDepartamento.setForeground(new Color(255,255,255));
        add(labelDepartamento);

        cBoxDepartamento = new JComboBox<>();
        cBoxDepartamento.setBounds(220,213,222,25);
        cBoxDepartamento.setBackground(new java.awt.Color(224,224,224));
        cBoxDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
        cBoxDepartamento.setForeground(new java.awt.Color(255,0,0));
        add(cBoxDepartamento);
        cBoxDepartamento.addItem("");
        cBoxDepartamento.addItem("Atencion al Cliente");
        cBoxDepartamento.addItem("Departamento de Logistica");
        cBoxDepartamento.addItem("Departamento de Gerencia");

        labelAntiguedad = new JLabel("Selecciona la antiguedad");
        labelAntiguedad.setBounds(220,248,180,25);
        labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
        labelAntiguedad.setForeground(new Color(255,255,255));
        add(labelAntiguedad);

        cBoxAntiguedad = new JComboBox<>();
        cBoxAntiguedad.setBounds(220,273,220,25);
        cBoxAntiguedad.setBackground(new java.awt.Color(224,224,244));
        cBoxAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
        cBoxAntiguedad.setForeground(new Color(255,0,0));
        add(cBoxAntiguedad);
        cBoxAntiguedad.addItem("");
        cBoxAntiguedad.addItem("1 año de servicio");
        cBoxAntiguedad.addItem("2 a 6 años de servicio");
        cBoxAntiguedad.addItem("7 o mas años de servicio");

        labelResultado = new JLabel("Resultado del Calculo");
        labelResultado.setBounds(220,307,180,25);
        labelResultado.setFont(new Font("Andale Mono", 1, 12));
        labelResultado.setForeground(new java.awt.Color(255,255,255));
        add(labelResultado);

        textArea1 = new JTextArea();
        textArea1.setBounds(220,333,385,90);
        textArea1.setEditable(false);/*<<<<-----Con el metodo setEditable se controla si el textArea se edita o no por el usuario */
        textArea1.setBackground(new Color(224,224,224));
        textArea1.setFont(new Font("Andale Mono", 1, 13));
        textArea1.setForeground(new Color(255,0,0));
        textArea1.setText("\n   Aqui aparece el resultado del calculo de las vacaciones");
        scrollPane1 = new JScrollPane(textArea1);
        scrollPane1.setBounds(220,333,385,90);
        add(scrollPane1);

        labelFooter = new JLabel("©2024 The Coca-Cola Company | Todos los derechos reservados");
        labelFooter.setBounds(135,445,500,30);
        labelFooter.setFont(new java.awt.Font("Andale Mono", 1, 12));
        labelFooter.setForeground(new java.awt.Color(255,255,255));
        add(labelFooter);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == miCalculo) {
            System.out.print("Selecionaste Calculo");
        }
        if (e.getSource() == miRojo) {
            System.out.print("Selecionaste Rojo");
        }
        if (e.getSource() == miNegro) {
            System.out.print("Selecionaste Negro");
        }
        if (e.getSource() == miMorado) {
            System.out.print("Selecionaste Morado");
        }
        if (e.getSource() == miNuevo) {
            System.out.print("Selecionaste Nuevo");
        }
        if (e.getSource() == miSalir) {
            System.out.print("Selecionaste Salir");
        }
        if (e.getSource() == miElCreador) {
            System.out.print("Selecionaste Acerca de creador");
        }
    }

    public static void main(String arg[]){
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0,0,640,535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(true);
        ventanaPrincipal.setLocationRelativeTo(null);
    }
}