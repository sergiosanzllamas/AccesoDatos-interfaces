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

public class Logi {
Telefono tel=new Telefono(this;)
	private JFrame frmLogin;
	public JFrame getFrmLogin() {
		return frmLogin;
	}

	public void setFrmLogin(JFrame frmLogin) {
		this.frmLogin = frmLogin;
	}

	private JTextField textField;
	private JPasswordField passwordField;
	Tradu hey = new Tradu(this);
    Guardar teo=new Guardar(this);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logi window = new Logi();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Logi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 653, 490);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblLoginDeUsuario = new JLabel("Login de Usuario");
		lblLoginDeUsuario.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblLoginDeUsuario.setBounds(225, 52, 201, 34);
		frmLogin.getContentPane().add(lblLoginDeUsuario);
		
		JLabel lblNewLabel = new JLabel("Nombre de Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(38, 180, 166, 20);
		frmLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContrasea.setBounds(38, 263, 166, 20);
		frmLogin.getContentPane().add(lblContrasea);
		
		textField = new JTextField();
		textField.setBounds(275, 178, 201, 26);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(275, 261, 201, 26);
		frmLogin.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Acceder");
		
		btnNewButton.setBounds(157, 375, 115, 29);
		frmLogin.getContentPane().add(btnNewButton);
		
		JButton btnSair = new JButton("Salir");
		
		btnSair.setBounds(431, 375, 115, 29);
		frmLogin.getContentPane().add(btnSair);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().equals(passwordField.getText()) || textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Error Login Incorrecto", "login mal", JOptionPane.ERROR_MESSAGE);					
				}
				else {
					tel.getFrmDirecciones().setVisible(true);
					frmLogin.setVisible(false);
					hey.getTextField().setText(textField.getText());
				}
			}
		});
		
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
	}
}
