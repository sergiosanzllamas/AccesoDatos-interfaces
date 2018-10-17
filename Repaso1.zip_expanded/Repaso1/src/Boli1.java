import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Boli1 {
Boli2 boli=new Boli2(this);
	private JFrame frmLogin;
	public JFrame getFrmLogin() {
		return frmLogin;
	}

	public void setFrmLogin(JFrame frmLogin) {
		this.frmLogin = frmLogin;
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
					Boli1 window = new Boli1();
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
	public Boli1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 782, 505);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);

		JLabel lblLoginDeUsuario = new JLabel("Login de Usuario");
		lblLoginDeUsuario.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblLoginDeUsuario.setBounds(270, 40, 229, 35);
		frmLogin.getContentPane().add(lblLoginDeUsuario);

		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario");
		lblNombreDeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombreDeUsuario.setBounds(43, 151, 173, 20);
		frmLogin.getContentPane().add(lblNombreDeUsuario);

		textField = new JTextField();
		textField.setBounds(292, 149, 253, 26);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblContrasela = new JLabel("Contrase\u00F1a");
		lblContrasela.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContrasela.setBounds(43, 219, 173, 20);
		frmLogin.getContentPane().add(lblContrasela);

		passwordField = new JPasswordField();
		passwordField.setBounds(292, 217, 253, 26);
		frmLogin.getContentPane().add(passwordField);

		JCheckBox chckbxAceptaLasCondiciones = new JCheckBox("Acepta las condiciones para entrar.");

		chckbxAceptaLasCondiciones.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxAceptaLasCondiciones.setBounds(121, 287, 424, 29);
		frmLogin.getContentPane().add(chckbxAceptaLasCondiciones);

		JButton btnEntrar = new JButton("Entrar");
		
		btnEntrar.setEnabled(false);
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEntrar.setBounds(127, 404, 115, 29);
		frmLogin.getContentPane().add(btnEntrar);

		JButton btnSalir = new JButton("Salir");

		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSalir.setBounds(466, 404, 115, 29);
		frmLogin.getContentPane().add(btnSalir);

		chckbxAceptaLasCondiciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxAceptaLasCondiciones.isSelected())
					btnEntrar.setEnabled(true);
				else {
					btnEntrar.setEnabled(false);
				}
			}
		});
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int w=JOptionPane.showConfirmDialog(null, "¿Desea salir?", "Salir de logueo", JOptionPane.YES_NO_OPTION);
				if(w==0)
					System.exit(0);
			}
		});
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().equals(passwordField.getText())||textField.getText().equals(""))
					JOptionPane.showMessageDialog(null, "LOGIN INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
				else {
					boli.getFrmDirecccionestel().setVisible(true);
					frmLogin.setVisible(false);
					boli.getTextField().setText(textField.getText());
				}
			}
		});
	}
}
