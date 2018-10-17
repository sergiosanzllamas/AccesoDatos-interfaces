import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sergio {
static Adri clave;
double pu,p,tot,mon=0;
	private JFrame frmCompra;
	public JFrame getFrmCompra() {
		return frmCompra;
	}

	public void setFrmCompra(JFrame frmCompra) {
		this.frmCompra = frmCompra;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sergio window = new Sergio(clave);
					window.frmCompra.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param clave 
	 */
	public Sergio(Adri clave) {
		initialize();
		this.clave=clave;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCompra = new JFrame();
		frmCompra.setTitle("Compra");
		frmCompra.setBounds(100, 100, 806, 630);
		frmCompra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCompra.getContentPane().setLayout(null);
		
		JLabel lblUsuarioConectado = new JLabel("Usuario Conectado");
		lblUsuarioConectado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsuarioConectado.setBounds(38, 89, 167, 20);
		frmCompra.getContentPane().add(lblUsuarioConectado);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(252, 87, 301, 26);
		frmCompra.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total(\u20AC)");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTotal.setBounds(484, 172, 69, 20);
		frmCompra.getContentPane().add(lblTotal);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(573, 170, 132, 26);
		frmCompra.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblProducto = new JLabel("Producto");
		lblProducto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProducto.setBounds(38, 268, 89, 20);
		frmCompra.getContentPane().add(lblProducto);
		
		textField_2 = new JTextField();
		textField_2.setBounds(135, 266, 146, 26);
		frmCompra.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblUnidades = new JLabel("Unidades");
		lblUnidades.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUnidades.setBounds(307, 268, 100, 20);
		frmCompra.getContentPane().add(lblUnidades);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox.setBounds(422, 266, 48, 26);
		frmCompra.getContentPane().add(comboBox);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecio.setBounds(498, 269, 100, 20);
		frmCompra.getContentPane().add(lblPrecio);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(573, 266, 132, 26);
		frmCompra.getContentPane().add(textField_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(38, 376, 381, 122);
		frmCompra.getContentPane().add(textArea);
		
		JButton btnAadirProducto = new JButton("A\u00F1adir Producto");
		
		
		btnAadirProducto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAadirProducto.setBounds(484, 371, 221, 29);
		frmCompra.getContentPane().add(btnAadirProducto);
		
		JButton btnFinalizarCompra = new JButton("Finalizar Compra");
		
		
		btnFinalizarCompra.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnFinalizarCompra.setBounds(484, 416, 221, 29);
		frmCompra.getContentPane().add(btnFinalizarCompra);
		
		JButton btnLogout = new JButton("LOGOUT");
	
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogout.setBounds(484, 469, 221, 29);
		frmCompra.getContentPane().add(btnLogout);
		
		JButton btnSalir = new JButton("Salir");
		
	
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSalir.setBounds(198, 529, 221, 29);
		frmCompra.getContentPane().add(btnSalir);
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x=JOptionPane.showConfirmDialog(null, "desaea salir?", "SALIR", JOptionPane.YES_NO_OPTION);
				if(x==0)
					System.exit(0);
			}
		});
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n=JOptionPane.showConfirmDialog(null, "DESEA DESLOGUERARSE?", "LOGOUT", JOptionPane.YES_NO_OPTION);
				if(n==0)
					frmCompra.dispose();
					clave.getFrmLogin().setVisible(true);
			}
		});
		btnAadirProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		p=Double.parseDouble(textField_3.getText());
		pu=Double.parseDouble(comboBox.getSelectedItem().toString());
		tot=pu*p;
		textArea.append(textField_2.getText()+"->"+(tot)+"€"+"\n");
		mon=mon+tot;
		textField_1.setText(String.valueOf(mon));
		textField_2.setText("");
		comboBox.setSelectedIndex(1);
		textField_3.setText("");
			}
		});
		btnFinalizarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int b=JOptionPane.showConfirmDialog(null,"su compra es->"+(textField_1.getText())+"€" , "FIN", JOptionPane.INFORMATION_MESSAGE);
						
				if(b==0)
				System.exit(0);
			}
		});
	}
}
