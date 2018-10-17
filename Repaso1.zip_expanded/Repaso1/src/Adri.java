import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Adri {

	private JFrame frmLogin;
Sergio hija=new Sergio(this);
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
					Adri window = new Adri();
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
	public Adri() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("LOGIN");
		frmLogin.setBounds(100, 100, 786, 584);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);

		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario");
		lblNombreDeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombreDeUsuario.setBounds(15, 70, 206, 20);
		frmLogin.getContentPane().add(lblNombreDeUsuario);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContrasea.setBounds(15, 137, 206, 20);
		frmLogin.getContentPane().add(lblContrasea);

		textField = new JTextField();
		textField.setBounds(258, 68, 314, 26);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(258, 135, 314, 26);
		frmLogin.getContentPane().add(passwordField);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEdad.setBounds(108, 216, 69, 20);
		frmLogin.getContentPane().add(lblEdad);

		JComboBox comboBox = new JComboBox();

		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Ninguna", "Menos de 17", "Mas de 17" }));
		comboBox.setBounds(258, 214, 121, 26);
		frmLogin.getContentPane().add(comboBox);

		JRadioButton rdbtnSoyUsuarioRegistrado = new JRadioButton("Soy usuario registrado");

		buttonGroup.add(rdbtnSoyUsuarioRegistrado);
		rdbtnSoyUsuarioRegistrado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnSoyUsuarioRegistrado.setBounds(108, 293, 271, 29);
		frmLogin.getContentPane().add(rdbtnSoyUsuarioRegistrado);

		JRadioButton rdbtnSoyUnInvitado = new JRadioButton("Soy un invitado");

		buttonGroup.add(rdbtnSoyUnInvitado);
		rdbtnSoyUnInvitado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnSoyUnInvitado.setBounds(108, 362, 271, 29);
		frmLogin.getContentPane().add(rdbtnSoyUnInvitado);

		JCheckBox chckbxAceptarCondicionesDe = new JCheckBox("Aceptar condiciones de servicio");

		chckbxAceptarCondicionesDe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxAceptarCondicionesDe.setBounds(268, 411, 304, 29);
		frmLogin.getContentPane().add(chckbxAceptarCondicionesDe);

		JButton btnEntrar = new JButton("Entrar");

		btnEntrar.setEnabled(false);
		btnEntrar.setBounds(210, 483, 115, 29);
		frmLogin.getContentPane().add(btnEntrar);

		JButton btnSalir = new JButton("Salir");

		btnSalir.setBounds(482, 483, 115, 29);
		frmLogin.getContentPane().add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int z = JOptionPane.showConfirmDialog(null, "desea salir", "SALIR", JOptionPane.YES_NO_OPTION);
				if (z == 0)
					System.exit(0);
			}
		});
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((comboBox.getSelectedIndex() == 1))
					JOptionPane.showMessageDialog(null, "eres menor de edad", "MENOR", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		rdbtnSoyUsuarioRegistrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnSoyUsuarioRegistrado.isSelected())
					btnEntrar.setEnabled(true);
				else {
					btnEntrar.setEnabled(false);
				}
			}
		});
		rdbtnSoyUnInvitado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnSoyUnInvitado.isSelected())
					JOptionPane.showMessageDialog(null, "DEBES ACEPTAR CONDICIONES", "FALTA CONDICIONES",
							JOptionPane.INFORMATION_MESSAGE);
			}
		});
		chckbxAceptarCondicionesDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxAceptarCondicionesDe.isSelected())
					btnEntrar.setEnabled(true);
				else {
					btnEntrar.setEnabled(false);
				}
			}
		});
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSoyUsuarioRegistrado.isSelected()) {
					if(!textField.getText().equals(passwordField.getText())||textField.getText().equals(""))
						JOptionPane.showMessageDialog(null, "LOGIN INCORRECTO", "LOGIN MAL", JOptionPane.INFORMATION_MESSAGE);
					else {
						hija.getFrmCompra().setVisible(true);
						frmLogin.setVisible(false);
						hija.getTextField().setText(textField.getText());
					}
					
				}
				
				if(rdbtnSoyUnInvitado.isSelected()) {
					if(chckbxAceptarCondicionesDe.isSelected()) {
						hija.getFrmCompra().setVisible(true);
					frmLogin.setVisible(false);
				}else {
						JOptionPane.showMessageDialog(null, "debes aceptar condiciones", "errroe", JOptionPane.ERROR_MESSAGE);
						
					}
				}
			}
		});
	}
}
