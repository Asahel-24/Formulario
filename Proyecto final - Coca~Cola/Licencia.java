import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener {

    private JLabel label1, label2;
    private JCheckBox checkBox1;
    private JButton boton1, boton2;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    //Constructor
    public Licencia(){

        setLayout(null);
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        label1 = new JLabel("Terminos y condiciones");
        label1.setBounds(215,5,200,30);
        label1.setFont(new Font("Andale Mono", 1, 14));
        label1.setBackground(new Color(0,0,0));
        add(label1);

        textArea1 = new JTextArea();
        textArea1.setEditable(false);
        textArea1.setFont(new Font("Andale Mono",1,10));
        textArea1.setText("\n\n          TERMINOS Y CONDICIONES"+
                          "\n\n            A. PROHIBIDA SU VENTA Y DISTRIBUCIÓN SIN AUTORIZACION DEL CREADOR ASAHEL "+
                          "\n            B. PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DEL DISEÑO DE LAS INTERFACES GRAFICAS"+
                          "\n            C. EL CREADOR DE ESTE SOFTWARE ASAHEL NO SE HACE RESPOLSABLE DEL MAL USO DE ESTE SOFTWARE"+
                          "\n\n          LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE"+
                          "\n          (EL AUTOR ASAHEL) NO SE RESPONSABILIZA DEL USO QUE USTED HAGA CON ESTE SOFTWARE Y SUS SERVICIOS"+
                          "\n          PARA ACEPTAR ESTOS TERMINOS HAGA CLICK EN (ACEPTO TERMINOS Y CONTINUAR)"+
                          "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLICK EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE"+
                          "\n\n         www.linkedin.com/in/asahel-garcía-2404s");
        textArea1.setForeground(new Color(255,0,0));
        scrollPane1 = new JScrollPane(textArea1);
        scrollPane1.setBounds(10,40,610,200);
        add(scrollPane1);

        checkBox1 = new JCheckBox("Acepto terminos");
        checkBox1.setBounds(10,250,300,30);
        checkBox1.addChangeListener(this);
        add(checkBox1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10,290,100,30);
        boton1.setEnabled(false);
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("No acepto");
        boton2.setBounds(120,290,100,30);
        boton2.setEnabled(true);
        boton2.addActionListener(this);
        add(boton2);

        ImageIcon imagen = new ImageIcon("images/coca-cola.png");
        label2 = new JLabel(imagen);
        label2.setBounds(315,135,300,300);
        add(label2);
    }

    public void stateChanged(ChangeEvent e){

    }

    public void actionPerformed(ActionEvent e){

    }

    public static void main(String[] args) {
        Licencia licencia = new Licencia();
        licencia.setBounds(0,0,650,360);
        licencia.setResizable(false);
        licencia.setLocationRelativeTo(null);
        licencia.setVisible(true);
    }

}