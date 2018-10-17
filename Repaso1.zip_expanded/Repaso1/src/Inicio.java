import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio {

	private JFrame frmInicio;
	Telefono hija=new Telefono(this);
	public JFrame getFrmInicio() {
		return frmInicio;
	}

	public void setFrmInicio(JFrame frmInicio) {
		this.frmInicio = frmInicio;
	}

	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frmInicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInicio = new JFrame();
		frmInicio.setTitle("Inicio");
		frmInicio.setBounds(100, 100, 588, 417);
		frmInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInicio.getContentPane().setLayout(null);

		JLabel lblLoginDelTraductor = new JLabel("Login del Traductor");
		lblLoginDelTraductor.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		lblLoginDelTraductor.setBounds(194, 16, 199, 51);
		frmInicio.getContentPane().add(lblLoginDelTraductor);

		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario");
		lblNombreDeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombreDeUsuario.setBounds(48, 132, 160, 20);
		frmInicio.getContentPane().add(lblNombreDeUsuario);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContrasea.setBounds(48, 203, 160, 20);
		frmInicio.getContentPane().add(lblContrasea);

		textField = new JTextField();
		textField.setBounds(268, 130, 216, 26);
		frmInicio.getContentPane().add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(268, 201, 216, 26);
		frmInicio.getContentPane().add(passwordField);

		JButton btnEntrar = new JButton("Entrar");

		btnEntrar.setBounds(131, 316, 115, 29);
		frmInicio.getContentPane().add(btnEntrar);

		JButton btnSalir = new JButton("Salir");

		btnSalir.setBounds(417, 316, 115, 29);
		frmInicio.getContentPane().add(btnSalir);

		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().equals(passwordField.getText()) ||textField.getText().equals("") )
					JOptionPane.showMessageDialog(null, "Login Incorrecto", "Login mal", JOptionPane.ERROR_MESSAGE);
				
				else
				hija
					frmInicio.setVisible(false);
				
			}
		});
	}
}
