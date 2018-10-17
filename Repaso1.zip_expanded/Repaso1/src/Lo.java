import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Lo {
	Compra producto = new Compra(this);
	private JFrame frmLogin;
	public JFrame getFrmLogin() {
		return frmLogin;
	}

	public void setFrmLogin(JFrame frmLogin) {
		this.frmLogin = frmLogin;
	}

	private JTextField textField;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lo window = new Lo();
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
	public Lo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 727, 493);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);

		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario");
		lblNombreDeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombreDeUsuario.setBounds(26, 52, 160, 20);
		frmLogin.getContentPane().add(lblNombreDeUsuario);

		textField = new JTextField();
		textField.setBounds(246, 50, 255, 26);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContrasea.setBounds(26, 115, 160, 20);
		frmLogin.getContentPane().add(lblContrasea);

		passwordField = new JPasswordField();
		passwordField.setBounds(246, 113, 255, 26);
		frmLogin.getContentPane().add(passwordField);

		JRadioButton rdbtnEntrarComoRegistrado = new JRadioButton("Entrar como registrado");
		buttonGroup.add(rdbtnEntrarComoRegistrado);

		rdbtnEntrarComoRegistrado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnEntrarComoRegistrado.setBounds(100, 187, 255, 29);
		frmLogin.getContentPane().add(rdbtnEntrarComoRegistrado);

		JRadioButton rdbtnEntrarComoInvitado = new JRadioButton("Entrar como invitado");
		buttonGroup.add(rdbtnEntrarComoInvitado);

		rdbtnEntrarComoInvitado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnEntrarComoInvitado.setBounds(100, 253, 255, 29);
		frmLogin.getContentPane().add(rdbtnEntrarComoInvitado);

		JCheckBox chckbxAceptaCondicionesPara = new JCheckBox("Acepta condiciones para entrar");

		chckbxAceptaCondicionesPara.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxAceptaCondicionesPara.setBounds(26, 311, 448, 29);
		frmLogin.getContentPane().add(chckbxAceptaCondicionesPara);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setEnabled(false);
		btnEntrar.setBounds(209, 392, 115, 29);
		frmLogin.getContentPane().add(btnEntrar);

		JButton btnSalir = new JButton("Salir");

		btnSalir.setBounds(497, 392, 115, 29);
		frmLogin.getContentPane().add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r = JOptionPane.showConfirmDialog(null, "desea salir", "salir", JOptionPane.YES_NO_OPTION);
				if (r == 0)
					System.exit(0);

			}
		});
		rdbtnEntrarComoRegistrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnEntrarComoRegistrado.isSelected())
					btnEntrar.setEnabled(true);
				else {
					btnEntrar.setEnabled(false);
				}
			}
		});
		rdbtnEntrarComoInvitado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnEntrarComoInvitado.isSelected())
					JOptionPane.showMessageDialog(null, "acepta las condiciones", "acepta",
							JOptionPane.INFORMATION_MESSAGE);
			}
		});
		chckbxAceptaCondicionesPara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxAceptaCondicionesPara.isSelected())
					btnEntrar.setEnabled(true);
				else {
					btnEntrar.setEnabled(false);

				}
			}
		});
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnEntrarComoRegistrado.isSelected()) {
					if (!textField.getText().equals(passwordField.getText()) || textField.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Login incorrecto", "login mal ",
								JOptionPane.ERROR_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Login correcto", "login ok ",
								JOptionPane.INFORMATION_MESSAGE);
						producto.getFrmCompra().setVisible(true);
						frmLogin.setVisible(false);
						producto.getTextField().setText(textField.getText());
					}

				}
				
				if(rdbtnEntrarComoInvitado.isSelected()) {
					if(chckbxAceptaCondicionesPara.isSelected()) {
						JOptionPane.showMessageDialog(null, "todo ok", "ok",
								JOptionPane.INFORMATION_MESSAGE);	
						producto.getFrmCompra().setVisible(true);
						frmLogin.setVisible(false);
					}else {
						JOptionPane.showMessageDialog(null, "acepta condicones", "mal ",
								JOptionPane.ERROR_MESSAGE);

						
					}
					
				}
			}
		});

	}

}
