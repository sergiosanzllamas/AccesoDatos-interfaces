import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;

public class dos {
static uno rayo;
tres y = new tres(this);
public static uno getRayo() {
	return rayo;
}

public static void setRayo(uno rayo) {
	dos.rayo = rayo;
}


	private JFrame frame;
	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dos window = new dos(rayo);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param uno 
	 */
	public dos(uno rayo) {
		initialize();
		this.rayo=rayo;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 556, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInicio = new JLabel("Inicio");
		lblInicio.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblInicio.setBounds(230, 39, 69, 20);
		frame.getContentPane().add(lblInicio);
		
		JLabel lblConevtado = new JLabel("Conectado");
		lblConevtado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblConevtado.setBounds(55, 108, 108, 20);
		frame.getContentPane().add(lblConevtado);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(243, 106, 146, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Registro");
		
		btnNewButton.setBounds(216, 330, 115, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSalir = new JButton("Salir");
		
		btnSalir.setBounds(373, 330, 115, 29);
		frame.getContentPane().add(btnSalir);
		
		JLabel lblCambiarNombre = new JLabel("Cambiar Nombre");
		lblCambiarNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCambiarNombre.setBounds(55, 174, 174, 20);
		frame.getContentPane().add(lblCambiarNombre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(243, 171, 146, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Espa\u00F1ol", "Ingles", "Aleman"}));
		comboBox.setBounds(412, 207, 94, 26);
		frame.getContentPane().add(comboBox);
		
		JLabel lblCambiarContrasea = new JLabel("Cambiar Contrase\u00F1a");
		lblCambiarContrasea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCambiarContrasea.setBounds(55, 232, 174, 20);
		frame.getContentPane().add(lblCambiarContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(243, 230, 146, 26);
		frame.getContentPane().add(passwordField);
		
		JButton button = new JButton("Guardar y salir");
		
		button.setBounds(17, 330, 137, 29);
		frame.getContentPane().add(button);
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(2);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int respuesta=JOptionPane.showConfirmDialog(null, "desea volver", "pagina", JOptionPane.YES_NO_OPTION);
				if(respuesta==1)
					frame.dispose();
				rayo.getFrame().setVisible(true);
				
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField_1.getText().equals(passwordField.getText()))
					JOptionPane.showMessageDialog(null, "login incorrecto", "login",JOptionPane.ERROR_MESSAGE);
				else {
					int t=JOptionPane.showConfirmDialog(null, "desea volver", "volver", JOptionPane.YES_NO_OPTION);
					if(t==0)
						frame.dispose();
					rayo.getFrame().setVisible(true);
					
					
					
				}
			}
		});
	}

}
