import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hijaa {

	private JFrame frmHija;
	static Papa hey;

	private JTextField textField;
	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public static Papa getHey() {
		return hey;
	}

	public static void setHey(Papa hey) {
		Hijaa.hey = hey;
	}


	public JFrame getFrmHija() {
		return frmHija;
	}

	public void setFrmHija(JFrame frmHija) {
		this.frmHija = frmHija;
	}

	






	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hijaa window = new Hijaa(hey);
					window.frmHija.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param hey2 
	 * @param clave 
	 * @param a2 
	 */
	public Hijaa(Papa hey ) {
		initialize();
	this.hey=hey;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHija = new JFrame();
		frmHija.setTitle("Hija");
		frmHija.setBounds(100, 100, 645, 465);
		frmHija.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHija.getContentPane().setLayout(null);
		
		JButton btnVolverAPadre = new JButton("Volver a Padre");
		
		btnVolverAPadre.setBounds(163, 350, 157, 29);
		frmHija.getContentPane().add(btnVolverAPadre);
		
		JButton btnSalir = new JButton("Salir");
		
		btnSalir.setBounds(441, 350, 148, 29);
		frmHija.getContentPane().add(btnSalir);
		
		JLabel lblConectado = new JLabel("Conectado:");
		lblConectado.setBounds(28, 45, 109, 20);
		frmHija.getContentPane().add(lblConectado);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(198, 42, 289, 26);
		frmHija.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		btnVolverAPadre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int respuesta = JOptionPane.showConfirmDialog(null, "qui padre", "salir", JOptionPane.YES_NO_OPTION);
		
	if(respuesta==0)
		
	hey.getFrmPadre().setVisible(true);
	frmHija.dispose();
			}
		});
	}

}
