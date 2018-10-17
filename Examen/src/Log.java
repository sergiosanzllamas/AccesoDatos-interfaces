import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Log {

	private JFrame frame;
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	private JTextField textField;
	private JPasswordField passwordField;
Telefono hija=new Telefono(this);
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
		frame.setBounds(100, 100, 502, 362);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNombreDeUsuaario = new JLabel("Nombre de usuario");
		lblNombreDeUsuaario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombreDeUsuaario.setBounds(10, 71, 163, 14);
		frame.getContentPane().add(lblNombreDeUsuaario);
		
		textField = new JTextField();
		textField.setBounds(201, 68, 177, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContrasea.setBounds(10, 151, 163, 14);
		frame.getContentPane().add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(201, 148, 177, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().equals(passwordField.getText()) || textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "login incorrecto", "mal", JOptionPane.ERROR_MESSAGE);
				}
				else {
					hija.getFrmTelefonoJava().setVisible(true);
					frame.setVisible(false);
				}
			}
		});
		btnEntrar.setBounds(201, 289, 89, 23);
		frame.getContentPane().add(btnEntrar);
	}
}
