import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Log {
	Lista hija = new Lista(this);
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
					Log window = new Log();
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
	public Log() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 577, 499);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);

		JLabel lblNombreUsuario = new JLabel("Nombre Usuario");
		lblNombreUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombreUsuario.setBounds(25, 78, 169, 20);
		frmLogin.getContentPane().add(lblNombreUsuario);

		textField = new JTextField();
		textField.setBounds(231, 76, 199, 26);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContrasea.setBounds(25, 140, 169, 20);
		frmLogin.getContentPane().add(lblContrasea);

		passwordField = new JPasswordField();
		passwordField.setBounds(231, 138, 199, 26);
		frmLogin.getContentPane().add(passwordField);

		JRadioButton rdbtnEstoyRegistrado = new JRadioButton("Estoy registrado");

		buttonGroup.add(rdbtnEstoyRegistrado);
		rdbtnEstoyRegistrado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnEstoyRegistrado.setBounds(146, 210, 261, 29);
		frmLogin.getContentPane().add(rdbtnEstoyRegistrado);

		JRadioButton rdbtnEntrarComoInvitado = new JRadioButton("Entrar como Invitado");

		buttonGroup.add(rdbtnEntrarComoInvitado);
		rdbtnEntrarComoInvitado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnEntrarComoInvitado.setBounds(146, 265, 261, 29);
		frmLogin.getContentPane().add(rdbtnEntrarComoInvitado);

		JCheckBox chckbxAceptaLasCondicones = new JCheckBox("Acepta las condicones de servicio");

		chckbxAceptaLasCondicones.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxAceptaLasCondicones.setBounds(25, 314, 348, 29);
		frmLogin.getContentPane().add(chckbxAceptaLasCondicones);

		JButton btnEntrar = new JButton("Entrar");

		btnEntrar.setEnabled(false);
		btnEntrar.setBounds(104, 398, 115, 29);
		frmLogin.getContentPane().add(btnEntrar);

		JButton btnSalir = new JButton("Salir");

		btnSalir.setBounds(351, 398, 115, 29);
		frmLogin.getContentPane().add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = JOptionPane.showConfirmDialog(null, "realmente desea salir", "salir",
						JOptionPane.YES_NO_OPTION);
				if (a == 0)
					System.exit(1);
			}
		});
		rdbtnEstoyRegistrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnEstoyRegistrado.isSelected())
					btnEntrar.setEnabled(true);
			}
		});
		rdbtnEntrarComoInvitado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnEntrarComoInvitado.isSelected())
					JOptionPane.showMessageDialog(null, "debe aceptar condiciones", "invitado",
							JOptionPane.INFORMATION_MESSAGE);
			}
		});
		chckbxAceptaLasCondicones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxAceptaLasCondicones.isSelected())
					btnEntrar.setEnabled(true);
				else {
					btnEntrar.setEnabled(false);
				}
			}
		});
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnEstoyRegistrado.isSelected()) {
					if (!textField.getText().equals(passwordField.getText()) || textField.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "login incorrecto", "mal", JOptionPane.ERROR_MESSAGE);
					} else {
						hija.getFrmListaDeCompra().setVisible(true);
						frmLogin.setVisible(false);
						hija.getTextField().setText(textField.getText());
					}
				}
				if (rdbtnEntrarComoInvitado.isSelected()) {
				if(chckbxAceptaLasCondicones.isSelected()) {
						JOptionPane.showMessageDialog(null, "todo ok", "ok", JOptionPane.INFORMATION_MESSAGE);
						hija.getFrmListaDeCompra().setVisible(true);
						frmLogin.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null, "debes aceptar condiciones", "mal", JOptionPane.ERROR_MESSAGE);
					}
				}
			}

		});

	}
}
