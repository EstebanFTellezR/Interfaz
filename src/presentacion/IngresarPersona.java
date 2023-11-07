package presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresarPersona extends JFrame {
    private JPanel pnlPrincipal;
    private JLabel lblCodigo;
    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JLabel lblNombre;
    private JLabel lblApellido;
    private JButton btnGuardar;
    private JLabel lblIdioma;
    private JComboBox cmbIdioma;
    private JCheckBox chbTerminos;
    private JLabel lmlGenero;
    private JRadioButton rbtMasculino;
    private JRadioButton rbtFemenino;

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
                String idioma = cmbIdioma.getSelectedItem().toString();
                String aceptoTerminos = (chbTerminos.isSelected()) ? "Si" : "No";
                String genero = (rbtMasculino.isSelected()) ? "Masculino":
                                (rbtFemenino.isSelected()) ? "Femenino":"";

                String mensaje = "Sus datos son: \n Codigo: "+codigo+
                                                "\n Nombre: "+nombre+
                                                "\n Apellido: "+apellido+
                                                "\n Idioma: "+idioma+
                                                "\n Genero: "+genero+
                                                "\n Aceptó Terminós: "+aceptoTerminos;

                JOptionPane.showMessageDialog(btnGuardar, mensaje);
            }
        });
    }
}
