import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Boli2 {
	static Boli1 clave;
	private JFrame frmDirecccionestel;

	public JFrame getFrmDirecccionestel() {
		return frmDirecccionestel;
	}

	public void setFrmDirecccionestel(JFrame frmDirecccionestel) {
		this.frmDirecccionestel = frmDirecccionestel;
	}

	private JTextField textField;

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Boli2 window = new Boli2(clave);
					window.frmDirecccionestel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @param clave
	 */
	public Boli2(Boli1 clave) {
		initialize();
		this.clave = clave;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDirecccionestel = new JFrame();
		frmDirecccionestel.setTitle("Direccciones/Tel");
		frmDirecccionestel.setBounds(100, 100, 686, 465);
		frmDirecccionestel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDirecccionestel.getContentPane().setLayout(null);

		JLabel lblDireccionestel = new JLabel("Direcciones/Tel");
		lblDireccionestel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblDireccionestel.setBounds(195, 38, 196, 20);
		frmDirecccionestel.getContentPane().add(lblDireccionestel);

		JLabel lblUsuarioConectado = new JLabel("Usuario Conectado");
		lblUsuarioConectado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsuarioConectado.setBounds(36, 96, 161, 20);
		frmDirecccionestel.getContentPane().add(lblUsuarioConectado);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(245, 94, 228, 26);
		frmDirecccionestel.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDireccion.setBounds(36, 157, 161, 20);
		frmDirecccionestel.getContentPane().add(lblDireccion);

		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCiudad.setBounds(36, 209, 161, 20);
		frmDirecccionestel.getContentPane().add(lblCiudad);

		JLabel lblPais = new JLabel("Pais");
		lblPais.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPais.setBounds(36, 262, 161, 20);
		frmDirecccionestel.getContentPane().add(lblPais);

		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTelefono.setBounds(36, 310, 161, 20);
		frmDirecccionestel.getContentPane().add(lblTelefono);

		JButton btnGuardar = new JButton("Guardar");

		btnGuardar.setEnabled(false);
		btnGuardar.setBounds(64, 364, 115, 29);
		frmDirecccionestel.getContentPane().add(btnGuardar);

		JButton btnLogout = new JButton("Logout");

		btnLogout.setBounds(298, 364, 115, 29);
		frmDirecccionestel.getContentPane().add(btnLogout);

		JButton btnSalir = new JButton("Salir");

		btnSalir.setBounds(508, 364, 115, 29);
		frmDirecccionestel.getContentPane().add(btnSalir);

		textField_1 = new JTextField();

		textField_1.setBounds(245, 155, 228, 26);
		frmDirecccionestel.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(245, 207, 228, 26);
		frmDirecccionestel.getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(245, 260, 228, 26);
		frmDirecccionestel.getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(245, 308, 228, 26);
		frmDirecccionestel.getContentPane().add(textField_4);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int y = JOptionPane.showConfirmDialog(null, "¿Desea salir?", "SALIR", JOptionPane.YES_NO_OPTION);
				if (y == 0)
					System.exit(0);
			}
		});
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int m = JOptionPane.showConfirmDialog(null, "¿Desea desloguearse?", "LOGOUT",
						JOptionPane.YES_NO_OPTION);
				if (m == 0)
					frmDirecccionestel.dispose();
				clave.getFrmLogin().setVisible(true);
			}
		});
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (!(textField_1.getText() == ""))
					btnGuardar.setEnabled(true);

			}
		});
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (!(textField_1.getText() == ""))
					btnGuardar.setEnabled(true);

			}
		});
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (!(textField_1.getText() == ""))
					btnGuardar.setEnabled(true);

			}
		});
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (!(textField_1.getText() == ""))
					btnGuardar.setEnabled(true);

			}
		});
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField_1.getText() == "") {
					JOptionPane.showMessageDialog(null, "ERROR HAY BLANCOS", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					int u = JOptionPane.showConfirmDialog(null, "desea guardar", "GUARDAR", JOptionPane.YES_NO_OPTION);
					if (u == 0)
						System.exit(0);
				}
				if (textField_2.getText() == "") {
					JOptionPane.showMessageDialog(null, "ERROR HAY BLANCOS", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					int u = JOptionPane.showConfirmDialog(null, "desea guardar", "GUARDAR", JOptionPane.YES_NO_OPTION);
					if (u == 0)
						System.exit(0);
				}
				if (textField_3.getText() == "") {
					JOptionPane.showMessageDialog(null, "ERROR HAY BLANCOS", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					int u = JOptionPane.showConfirmDialog(null, "desea guardar", "GUARDAR", JOptionPane.YES_NO_OPTION);
					if (u == 0)
						System.exit(0);
				}
				if (textField_4.getText() == "") {
					JOptionPane.showMessageDialog(null, "ERROR HAY BLANCOS", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					int u = JOptionPane.showConfirmDialog(null, "desea guardar", "GUARDAR", JOptionPane.YES_NO_OPTION);
					if (u == 0)
						System.exit(0);
				}
			}

		});

	}

}
