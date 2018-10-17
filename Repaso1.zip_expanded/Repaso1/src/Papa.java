import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Papa {

	private JFrame frmPadre;

	private JTextField textField;
	private JPasswordField passwordField;
    Hijaa hija = new Hijaa(this);
	public JFrame getFrmPadre() {
		return frmPadre;
	}

	public void setFrmPadre(JFrame frmPadre) {
		this.frmPadre = frmPadre;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Papa window = new Papa();
					window.frmPadre.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Papa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPadre = new JFrame();
		frmPadre.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmPadre.setResizable(false);
		frmPadre.setTitle("Padre");
		frmPadre.setBounds(100, 100, 711, 564);
		frmPadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPadre.getContentPane().setLayout(null);
		
		JLabel lblInicioDeSesion = new JLabel("Inicio de Sesion");
		lblInicioDeSesion.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		lblInicioDeSesion.setBounds(265, 53, 169, 20);
		frmPadre.getContentPane().add(lblInicioDeSesion);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(94, 158, 69, 20);
		frmPadre.getContentPane().add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContrasea.setBounds(94, 272, 104, 20);
		frmPadre.getContentPane().add(lblContrasea);
		
		textField = new JTextField();
		textField.setBounds(261, 155, 235, 26);
		frmPadre.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(265, 269, 231, 26);
		frmPadre.getContentPane().add(passwordField);
		
		JButton btnSalir = new JButton("Salir");
		
		btnSalir.setBounds(547, 451, 115, 29);
		frmPadre.getContentPane().add(btnSalir);
		
		JButton btnAcceder = new JButton("Acceder");
		
		btnAcceder.setBounds(242, 451, 115, 29);
		frmPadre.getContentPane().add(btnAcceder);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().equals(passwordField.getText())) {
				JOptionPane.showMessageDialog(null, "login incorrecto", "mal inicio de sesion", JOptionPane.ERROR_MESSAGE);
			}else {
				int respuesta = JOptionPane.showConfirmDialog(frmPadre, "quiere entrar en la cuenta", "Inicio de sesion", JOptionPane.INFORMATION_MESSAGE,JOptionPane.QUESTION_MESSAGE);
				if(respuesta==0)
					hija.getFrmHija().setVisible(true);
					frmPadre.setVisible(false);
				
					hija.getTextField().setText(textField.getText());}
			}
		});
	}
}
