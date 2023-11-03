package presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresarPersona extends JFrame {
    private JPanel pnlPrincipal;
    private JLabel lblCodigo;
    private JPasswordField txtCodigo;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JLabel lblNombre;
    private JLabel lblApellido;
    private JButton btnGuardar;
    private JLabel lblIdioma;
    private JTextField txtIdioma;

    public IngresarPersona(){
        this.setVisible(true);
        this.setContentPane(pnlPrincipal);
        this.setTitle("Ventana Ingresar Persona");
        this.setSize(400,300);

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = txtCodigo.getText();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();

                String mensaje = "Sus datos son: \n Codigo: "+codigo+"\n Nombre: "+nombre+"\n Apellido: "+apellido;

                JOptionPane.showMessageDialog(btnGuardar, mensaje);
            }
        });
    }
}
