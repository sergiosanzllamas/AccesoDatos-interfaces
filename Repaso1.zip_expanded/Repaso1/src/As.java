import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JEditorPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class As {

	private JFrame frmLogin;
	Marca hija = new Marca(this);

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
					As window = new As();
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
	public As() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 899, 686);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);

		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario");
		lblNombreDeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombreDeUsuario.setBounds(85, 71, 198, 20);
		frmLogin.getContentPane().add(lblNombreDeUsuario);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContrasea.setBounds(85, 146, 198, 20);
		frmLogin.getContentPane().add(lblContrasea);

		textField = new JTextField();
		textField.setBounds(344, 69, 336, 26);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(344, 144, 336, 26);
		frmLogin.getContentPane().add(passwordField);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEdad.setBounds(85, 236, 69, 20);
		frmLogin.getContentPane().add(lblEdad);

		JComboBox comboBox = new JComboBox();
		

		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(
				new DefaultComboBoxModel(new String[] { "Ninguna", "Menos de 17 a\u00F1os", "Mas de 17 a\u00F1os" }));
		comboBox.setBounds(246, 233, 222, 26);
		frmLogin.getContentPane().add(comboBox);

		JCheckBox chckbxAceptaLassCondiciones = new JCheckBox("Acepta las condiciones de servicio");

		chckbxAceptaLassCondiciones.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxAceptaLassCondiciones.setBounds(181, 416, 354, 29);
		frmLogin.getContentPane().add(chckbxAceptaLassCondiciones);

		JCheckBox chckbxEresMenorDe = new JCheckBox("Eres menor de edad");

		chckbxEresMenorDe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxEresMenorDe.setBounds(181, 480, 354, 29);
		frmLogin.getContentPane().add(chckbxEresMenorDe);

		JButton btnEntrar = new JButton("Entrar");

		btnEntrar.setEnabled(false);
		btnEntrar.setBounds(193, 559, 115, 29);
		frmLogin.getContentPane().add(btnEntrar);

		JButton btnSalir = new JButton("Salir");

		btnSalir.setBounds(538, 560, 115, 29);
		frmLogin.getContentPane().add(btnSalir);

		JRadioButton rdbtnSoyUsuarioRegistrado = new JRadioButton("Soy usuario registrado");

		buttonGroup.add(rdbtnSoyUsuarioRegistrado);
		rdbtnSoyUsuarioRegistrado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnSoyUsuarioRegistrado.setBounds(132, 298, 283, 29);
		frmLogin.getContentPane().add(rdbtnSoyUsuarioRegistrado);

		JRadioButton rdbtnSoyInvitado = new JRadioButton("Soy invitado");

		buttonGroup.add(rdbtnSoyInvitado);
		rdbtnSoyInvitado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnSoyInvitado.setBounds(132, 345, 283, 29);
		frmLogin.getContentPane().add(rdbtnSoyInvitado);
		chckbxAceptaLassCondiciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxAceptaLassCondiciones.isSelected())
					btnEntrar.setEnabled(true);
				else {
					btnEntrar.setEnabled(false);
				}
			}
		});
		chckbxEresMenorDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxEresMenorDe.isSelected())
					JOptionPane.showMessageDialog(null, "eres menor", "menor", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		rdbtnSoyInvitado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnSoyInvitado.isSelected())
					JOptionPane.showMessageDialog(null, "acepta condiciones", "invitado",
							JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = JOptionPane.showConfirmDialog(null, "desa salir", "salir", JOptionPane.YES_NO_OPTION);
				if (a == 0)
					System.exit(0);

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
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnSoyUsuarioRegistrado.isSelected()) {
					if (!textField.getText().equals(passwordField.getText()) || textField.getText().equals("")) {

						JOptionPane.showMessageDialog(null, "ERROR DE LOGIN", "ERROR", JOptionPane.ERROR_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Login correcto", "login ok ",
								JOptionPane.INFORMATION_MESSAGE);
						hija.getFrmCompra().setVisible(true);
						frmLogin.setVisible(false);
						hija.getTextField().setText(textField.getText());
					}
				}
				
				if(rdbtnSoyInvitado.isSelected()) {
					if(chckbxAceptaLassCondiciones.isSelected()) {
						JOptionPane.showMessageDialog(null, "Login correcto", "login ok ",
								JOptionPane.INFORMATION_MESSAGE);
						hija.getFrmCompra().setVisible(true);
						frmLogin.setVisible(false);
						hija.getTextField().setText(textField.getText());
					}else {
						JOptionPane.showMessageDialog(null, "Login incorrecto", "login mal ",
								JOptionPane.ERROR_MESSAGE);
					}
					
				}
			}
		});
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex()==1)
					JOptionPane.showMessageDialog(null, "eres menor,Indica que lo eres para poder continuar", "menor", JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}
}
