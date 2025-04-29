package Practica_9;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Teatro extends JFrame implements ActionListener {
	private JRadioButton rbPalco, rbPlatea, rbGaleria;
    private JTextField txtNumero, txtDias;
    private JButton btnComprar, btnSalir;
    private ButtonGroup grupoBoletos;

    public Teatro() {
        super("Sistema de Venta de Boletos - Teatro Municipal");
        setLayout(new GridLayout(7, 2, 5, 5));
        // Componentes
        add(new JLabel("Nro. Boleto:"));
        txtNumero = new JTextField();
        add(txtNumero);
        add(new JLabel("Dias de anticipacion (Platea/Galeria):"));
        txtDias = new JTextField();
        add(txtDias);
        add(new JLabel("Tipo de Boleto:"));
        JPanel panelTipo = new JPanel(new FlowLayout());
        rbPalco = new JRadioButton("Palco");
        rbPlatea = new JRadioButton("Platea");
        rbGaleria = new JRadioButton("Galeria");
        grupoBoletos = new ButtonGroup();
        grupoBoletos.add(rbPalco);
        grupoBoletos.add(rbPlatea);
        grupoBoletos.add(rbGaleria);
        panelTipo.add(rbPalco);
        panelTipo.add(rbPlatea);
        panelTipo.add(rbGaleria);
        add(panelTipo);
        btnComprar = new JButton("Comprar Boleto");
        btnSalir = new JButton("Salir");
        add(btnComprar);
        add(btnSalir);
        btnComprar.addActionListener(this);
        btnSalir.addActionListener(this);
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //Cerrar ventana
        setLocationRelativeTo(null); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnComprar) {
            try {
                int numero = Integer.parseInt(txtNumero.getText());
                int dias = 0;
                if (!txtDias.getText().isEmpty()) {
                    dias = Integer.parseInt(txtDias.getText());
                }
                Boleto boleto = null;
                if (rbPalco.isSelected()) {
                    boleto = new Palco(numero);
                } else if (rbPlatea.isSelected()) {
                    boleto = new Platea(numero, dias);
                } else if (rbGaleria.isSelected()) {
                    boleto = new Galeria(numero, dias);
                } else {
                    JOptionPane.showMessageDialog(this, "Tipo de boleto", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                JOptionPane.showMessageDialog(this, "¡Compra Exitosa!\n" + boleto.toString(), "Boleto", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Intro. datos validos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnSalir) {
            dispose();
        }
    }

    public static void main(String[] args) {
        new Teatro();
    }
}