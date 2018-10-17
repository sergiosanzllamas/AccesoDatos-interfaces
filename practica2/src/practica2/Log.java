package practica2;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Log {

	private JFrame frame;

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	Fin fin = new Fin(this);
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Log window = new Log();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Log() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 581, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario");
		lblNombreDeUsuario.setBounds(40, 157, 152, 22);
		lblNombreDeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));

		textField = new JTextField();
		textField.setBounds(254, 161, 126, 20);
		textField.setColumns(10);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(232, 34, 56, 22);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(40, 246, 109, 22);
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 18));

		passwordField = new JPasswordField();
		passwordField.setBounds(254, 250, 126, 20);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(372, 443, 82, 23);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblContrasea);
		frame.getContentPane().add(lblNombreDeUsuario);
		frame.getContentPane().add(lblLogin);
		frame.getContentPane().add(passwordField);
		frame.getContentPane().add(textField);
		frame.getContentPane().add(btnEntrar);

		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!textField.getText().equals(passwordField.getText()) || textField.getText().equals("")) {

					JOptionPane.showMessageDialog(null, "Usuario y contraseña incorrectos", "Login mal",
							JOptionPane.ERROR_MESSAGE);
				} else {

					fin.getFrame().setVisible(true);
					frame.setVisible(false);

				}
			}
		});
	}
}
