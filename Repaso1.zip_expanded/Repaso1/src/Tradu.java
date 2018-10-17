import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tradu {
static Logi principal;
Guardar tres =new Guardar(this);
	private JFrame frmDirecciones;
	private JTextField usuario;
	private JTextField textField;
	private JTextField textField_1;
	public JTextField getTextField_2() {
		return textField_1;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_1 = textField_2;
	}

	public JTextField textField_2;



	public JTextField getTextField() {
		return usuario;
	}

	public void setTextField(JTextField textField) {
		this.usuario = textField;
	}



	public JFrame getFrmDirecciones() {
		return frmDirecciones;
	}

	public void setFrmDirecciones(JFrame frmDirecciones) {
		this.frmDirecciones = frmDirecciones;
	}
	public JTextField getTextField_1() {
		return textField;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField = textField_1;
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tradu window = new Tradu(principal);
					window.frmDirecciones.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param logi 
	 */
	public Tradu(Logi principal) {
		initialize();
		this.principal=principal;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDirecciones = new JFrame();
		frmDirecciones.setTitle("Direcciones");
		frmDirecciones.setBounds(100, 100, 638, 495);
		frmDirecciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDirecciones.getContentPane().setLayout(null);
		
		JLabel lblUsuarioCnectado = new JLabel("Usuario Conectado");
		lblUsuarioCnectado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsuarioCnectado.setBounds(45, 122, 143, 20);
		frmDirecciones.getContentPane().add(lblUsuarioCnectado);
		
		JLabel lblDirecciones = new JLabel("Direcciones");
		lblDirecciones.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		lblDirecciones.setBounds(218, 30, 154, 35);
		frmDirecciones.getContentPane().add(lblDirecciones);
		
		usuario = new JTextField();
		usuario.setEditable(false);
		usuario.setBounds(259, 120, 175, 26);
		frmDirecciones.getContentPane().add(usuario);
		usuario.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Direccion");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(45, 191, 98, 20);
		frmDirecciones.getContentPane().add(lblNewLabel);
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCiudad.setBounds(51, 250, 69, 20);
		frmDirecciones.getContentPane().add(lblCiudad);
		
		JLabel lblPais = new JLabel("Pais");
		lblPais.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPais.setBounds(51, 306, 69, 20);
		frmDirecciones.getContentPane().add(lblPais);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(259, 189, 175, 26);
		frmDirecciones.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(259, 248, 175, 26);
		frmDirecciones.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(259, 304, 175, 26);
		frmDirecciones.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Logout");
		
		btnNewButton.setBounds(77, 394, 115, 29);
		frmDirecciones.getContentPane().add(btnNewButton);
		
		JButton btnSalir = new JButton("Salir");
	
		btnSalir.setBounds(444, 394, 115, 29);
		frmDirecciones.getContentPane().add(btnSalir);
		
		JButton btnSigiente = new JButton("sigiente");
		
		btnSigiente.setBounds(272, 394, 115, 29);
		frmDirecciones.getContentPane().add(btnSigiente);
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(2);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int respuesta=JOptionPane.showConfirmDialog(null, "desea deslogearse", "logout", JOptionPane.YES_NO_OPTION);
				if(respuesta==0)
					frmDirecciones.dispose();
				principal.getFrmLogin().setVisible(true);
				
			}
		});
		btnSigiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "desea guardar y seguir", "siguiente", JOptionPane.YES_NO_OPTION);
				if(a==1)
					frmDirecciones.dispose();
			tres.getFrame().setVisible(true);
				frmDirecciones.setVisible(false);
			
				tres.getTextField().setText(textField.getText());
				tres.getTextField_1().setText(textField_1.getText());
				tres.getTextField_2().setText(textField_2.getText());
			}
		});
	}

	

}
