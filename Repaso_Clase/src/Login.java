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

public class Login {
	Telefono tel = new Telefono(this);
	private JFrame frmLoginUsuario;

	public JFrame getFrmLoginUsuario() {
		return frmLoginUsuario;
	}

	public void setFrmLoginUsuario(JFrame frmLoginUsuario) {
		this.frmLoginUsuario = frmLoginUsuario;
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
					Login window = new Login();
					window.frmLoginUsuario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginUsuario = new JFrame();
		frmLoginUsuario.setTitle("Login Usuario");
		frmLoginUsuario.setBounds(100, 100, 542, 528);
		frmLoginUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoginUsuario.getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsuario.setBounds(58, 78, 84, 22);
		frmLoginUsuario.getContentPane().add(lblUsuario);
		
		textField = new JTextField();
		textField.setBounds(189, 82, 164, 20);
		frmLoginUsuario.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContrasea.setBounds(58, 158, 111, 22);
		frmLoginUsuario.getContentPane().add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(189, 162, 164, 20);
		frmLoginUsuario.getContentPane().add(passwordField);
		
		JRadioButton rdbtnSoyClienteRegistrado = new JRadioButton("Soy cliente registrado");
		
		
		buttonGroup.add(rdbtnSoyClienteRegistrado);
		rdbtnSoyClienteRegistrado.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnSoyClienteRegistrado.setBounds(105, 235, 195, 23);
		frmLoginUsuario.getContentPane().add(rdbtnSoyClienteRegistrado);
		
		JRadioButton rdbtnEntrarComoInvitado = new JRadioButton("Entrar como invitado");
	
		buttonGroup.add(rdbtnEntrarComoInvitado);
		rdbtnEntrarComoInvitado.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnEntrarComoInvitado.setBounds(105, 285, 195, 23);
		frmLoginUsuario.getContentPane().add(rdbtnEntrarComoInvitado);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto las condiciones de servicio");
		
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		chckbxNewCheckBox.setBounds(69, 356, 284, 23);
		frmLoginUsuario.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnAceptar = new JButton("Aceptar");
		
		btnAceptar.setEnabled(false);
		btnAceptar.setBounds(90, 442, 89, 23);
		frmLoginUsuario.getContentPane().add(btnAceptar);
		
		JButton btnSalir = new JButton("Salir");
	
		btnSalir.setBounds(320, 442, 89, 23);
		rdbtnEntrarComoInvitado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnEntrarComoInvitado.isSelected())
					JOptionPane.showMessageDialog(null, "debe aceptar condiciones", "acepta", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		frmLoginUsuario.getContentPane().add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int r=1;
				if(r==1)
					
				JOptionPane.showMessageDialog(null, "desea salir", "salir", JOptionPane.INFORMATION_MESSAGE);
				System.exit(1);
				
			}
		});
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					btnAceptar.setEnabled(true);	
				}else {
					btnAceptar.setEnabled(false);
					
				}
			}
		});
		
		//evento boton aceptar
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//si soy registrado
				if (rdbtnSoyClienteRegistrado.isSelected()) {
					if(!textField.getText().equals(passwordField.getText()) ||textField.getText().equals("")) 
						JOptionPane.showMessageDialog(null, "error login incorrecto", "login mal",JOptionPane.ERROR_MESSAGE);
					else {
						JOptionPane.showMessageDialog(null, "login correcto", "ok", JOptionPane.INFORMATION_MESSAGE);
						nueva.getFrmListaDeCompra().setVisible(true);
						frmLoginUsuario.setVisible(false);
						nueva.getTextField().setText(textField.getText());
					}
				}
				
				//si soy invitado
				if (rdbtnEntrarComoInvitado.isSelected()) {
					if (chckbxNewCheckBox.isSelected()) {
						JOptionPane.showMessageDialog(null, "entra como invitado", "ok", JOptionPane.INFORMATION_MESSAGE);
						nueva.getFrmListaDeCompra().setVisible(true);
						frmLoginUsuario.setVisible(false);
					}
					else {
						JOptionPane.showMessageDialog(null, "invitado, debe aceptar los terminos", "aceptar terminos",JOptionPane.ERROR_MESSAGE);
					}
				}
				
				
				
			}
		});
		rdbtnSoyClienteRegistrado.addActionListener(new ActionListener() {

	public void actionPerformed(ActionEvent e) {
		if (rdbtnSoyClienteRegistrado.isSelected())
			btnAceptar.setEnabled(true);

	}
});

}}
