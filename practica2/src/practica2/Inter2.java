package practica2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inter2 {
	static Prue2 principal;
	private JFrame frmHgcr;




	public JFrame getFrmHgcr() {
		return frmHgcr;
	}

	public void setFrmHgcr(JFrame frmHgcr) {
		this.frmHgcr = frmHgcr;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inter2 window = new Inter2(principal);
					window.frmHgcr.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inter2(Prue2 principal) {
		
		initialize();
		this.principal = principal;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHgcr = new JFrame();
		frmHgcr.setResizable(false);
		frmHgcr.setTitle("HOSPITAL GENERAL DE CIUDAD REAL");
		frmHgcr.setBounds(100, 100, 586, 590);
		frmHgcr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHgcr.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO AL HGCR");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(110, 43, 324, 37);
		frmHgcr.getContentPane().add(lblNewLabel);
		
		JButton btnLogout = new JButton("LOGOUT");
				btnLogout.setBounds(464, 512, 89, 23);
		frmHgcr.getContentPane().add(btnLogout);
		
		JLabel lblUsuarioConectado = new JLabel("USUARIO CONECTADO:");
		lblUsuarioConectado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuarioConectado.setBounds(165, 144, 148, 14);
		frmHgcr.getContentPane().add(lblUsuarioConectado);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(340, 141, 148, 20);
		frmHgcr.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea Salir?", "Confirmar Salida",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (respuesta == 0)

				
				frmHgcr.dispose();
			principal.getFrmLogin().setVisible(true);
			}
		});

	}

}
