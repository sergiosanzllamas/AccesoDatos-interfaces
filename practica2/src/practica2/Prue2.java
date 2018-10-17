package practica2;

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
import java.awt.Color;

public class Prue2 {

	private JFrame frmLogin;
	public JFrame getFrmLogin() {
		return frmLogin;
	}

	public void setFrmLogin(JFrame frmLogin) {
		this.frmLogin = frmLogin;
	}

	private JTextField textField;
	private JPasswordField passwordField;
	Inter2 inter = new Inter2(this);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prue2 window = new Prue2();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param inter2 
	 */
	public Prue2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 639, 761);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(52, 121, 71, 14);
		frmLogin.getContentPane().add(lblNewLabel);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContrasea.setBounds(52, 193, 106, 14);
		frmLogin.getContentPane().add(lblContrasea);

		textField = new JTextField();
		textField.setBounds(244, 105, 146, 20);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(244, 193, 146, 20);
		frmLogin.getContentPane().add(passwordField);

		JButton btnNewButton = new JButton("Acceder");
		btnNewButton.setBackground(Color.CYAN);

		btnNewButton.setBounds(244, 647, 89, 23);
		frmLogin.getContentPane().add(btnNewButton);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setBackground(Color.RED);

		btnSalir.setBounds(470, 647, 89, 23);
		frmLogin.getContentPane().add(btnSalir);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!textField.getText().equals(passwordField.getText()))
					JOptionPane.showMessageDialog(frmLogin, "Usuario y contraseña incorrectos", "Login mal",
							JOptionPane.ERROR_MESSAGE);
				else
					// JOptionPane.showMessageDialog(null, "login correcto", "ok",
					// JOptionPane.INFORMATION_MESSAGE);
				
				inter.getFrmHgcr().setVisible(true);
				frmLogin.setVisible(false);

			inter.getTextField().setText(textField.getText());
			}
		});

		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int respuesta = JOptionPane.showConfirmDialog(frmLogin, "¿Desea Salir?", "Confirmar Salida",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (respuesta == 0)

					System.exit(0);
			}
		});

	}
}
