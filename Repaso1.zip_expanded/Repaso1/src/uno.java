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

public class uno {

	private JFrame frame;
	dos hola = new dos(this);
	
	private JTextField textField;
	private JPasswordField passwordField;
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					uno window = new uno();
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
	public uno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 597, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(64, 117, 69, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContrasea.setBounds(62, 202, 108, 20);
		frame.getContentPane().add(lblContrasea);
		
		textField = new JTextField();
		textField.setBounds(189, 115, 146, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(189, 200, 146, 26);
		frame.getContentPane().add(passwordField);
		
		JButton btnAcceder = new JButton("Acceder");
		
		btnAcceder.setBounds(219, 324, 137, 29);
		frame.getContentPane().add(btnAcceder);
		
		JButton btnSalir = new JButton("Salir");
		
		btnSalir.setBounds(400, 324, 146, 29);
		frame.getContentPane().add(btnSalir);
		
		JLabel lblRegistro = new JLabel("Registro");
		lblRegistro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		lblRegistro.setBounds(248, 32, 137, 40);
		frame.getContentPane().add(lblRegistro);
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().equals(passwordField.getText()))
					JOptionPane.showMessageDialog(null, "login incorrecto", "login",JOptionPane.ERROR_MESSAGE);
				else { 
					int respuesta=JOptionPane.showConfirmDialog(null, "login correcto", "login", JOptionPane.OK_OPTION);
					if(respuesta==0)
						hola.getFrame().setVisible(true);
					frame.setVisible(false);
					hola.getTextField().setText(textField.getText());
				
				}
			}
		});
	
	}

}
