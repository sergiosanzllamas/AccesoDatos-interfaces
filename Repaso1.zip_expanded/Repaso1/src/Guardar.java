import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Guardar {
static Logi cuatro;
	private JFrame frame;
public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

static Tradu tu;
private JTextField textField;
public JTextField getTextField_2() {
	return textField_2;
}

public void setTextField_2(JTextField textField_2) {
	this.textField_2 = textField_2;
}

public JTextField getTextField_1() {
	return textField_1;
}

public void setTextField_1(JTextField textField_1) {
	this.textField_1 = textField_1;
}

public JTextField getTextField() {
	return textField;
}

public void setTextField(JTextField textField) {
	this.textField = textField;
}

private JTextField textField_1;
private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guardar window = new Guardar(tu);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param tu 
	 */


	
	public Guardar(Tradu tu) {
		// TODO Auto-generated constructor stub
		initialize();
		this.tu=tu;
	
	}



	public Guardar(Logi cuatro) {
		initialize();
		this.cuatro=cuatro;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 585, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAtras = new JButton("ATRAS");
		
		btnAtras.setBounds(50, 322, 115, 29);
		frame.getContentPane().add(btnAtras);
		
		JButton btnPrimera = new JButton("Aceptar");
		
		btnPrimera.setBounds(243, 322, 115, 29);
		frame.getContentPane().add(btnPrimera);
		
		JButton btnSalir = new JButton("SALIR");
		
		btnSalir.setBounds(433, 322, 115, 29);
		frame.getContentPane().add(btnSalir);
		
		JLabel lblDatosGuardados = new JLabel("Datos Guardados");
		lblDatosGuardados.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblDatosGuardados.setBounds(173, 31, 220, 29);
		frame.getContentPane().add(lblDatosGuardados);
		
		JLabel label = new JLabel("Direccion");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(54, 112, 98, 20);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(247, 110, 175, 26);
		frame.getContentPane().add(textField);
		
		JLabel label_1 = new JLabel("Ciudad");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(50, 173, 69, 20);
		frame.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(247, 171, 175, 26);
		frame.getContentPane().add(textField_1);
		
		JLabel label_2 = new JLabel("Pais");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_2.setBounds(50, 227, 69, 20);
		frame.getContentPane().add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(247, 225, 175, 26);
		frame.getContentPane().add(textField_2);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(2);
			}
		});
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int s=JOptionPane.showConfirmDialog(null, "desea ir atras", "atras", JOptionPane.YES_NO_OPTION);
				if(s==0)
					frame.dispose();
				tu.getFrmDirecciones().setVisible(true);
			}
		});
		btnPrimera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r=JOptionPane.showConfirmDialog(null, "desea ir atras", "atras", JOptionPane.YES_NO_OPTION);
				if(r==1)
					frame.dispose();
				cuatro.getFrmLogin().setVisible(true);
			}
		});
		
	}

}
