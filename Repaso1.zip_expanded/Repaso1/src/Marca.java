import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Marca {
static As clave;
double pu,pf,tot,mon=0;
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
					Marca window = new Marca(clave);
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
	public Marca(As clave) {
		initialize();
		this.clave=clave;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCompra = new JFrame();
		frmCompra.setTitle("Compra");
		frmCompra.setBounds(100, 100, 964, 695);
		frmCompra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCompra.getContentPane().setLayout(null);
		
		JLabel lblUsuarioConectado = new JLabel("Usuario Conectado");
		lblUsuarioConectado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsuarioConectado.setBounds(43, 81, 180, 20);
		frmCompra.getContentPane().add(lblUsuarioConectado);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(309, 78, 344, 26);
		frmCompra.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPrecioPorLocalidad = new JLabel("Precio por localidad\r\n");
		lblPrecioPorLocalidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecioPorLocalidad.setBounds(45, 169, 180, 20);
		frmCompra.getContentPane().add(lblPrecioPorLocalidad);
		
		JTextArea txtrGGGg = new JTextArea();
		txtrGGGg.setEditable(false);
		txtrGGGg.setText("Lateral Baja           30\u20AC\r\n\r\nFondo                  20\u20AC\r\n\r\nTribuna                40\u20AC\r\n\r\nPalco                  60\u20AC");
		txtrGGGg.setBounds(84, 208, 357, 143);
		frmCompra.getContentPane().add(txtrGGGg);
		
		JLabel lblZona = new JLabel("Zona");
		lblZona.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblZona.setBounds(24, 405, 69, 20);
		frmCompra.getContentPane().add(lblZona);
		
		textField_1 = new JTextField();
		textField_1.setBounds(119, 404, 146, 26);
		frmCompra.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNentradas = new JLabel("N\u00BAEntradas");
		lblNentradas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNentradas.setBounds(294, 406, 111, 20);
		frmCompra.getContentPane().add(lblNentradas);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBox.setBounds(437, 403, 63, 26);
		frmCompra.getContentPane().add(comboBox);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecio.setBounds(549, 405, 69, 20);
		frmCompra.getContentPane().add(lblPrecio);
		
		textField_2 = new JTextField();
		textField_2.setBounds(660, 403, 146, 26);
		frmCompra.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total(\u20AC)");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTotal.setBounds(549, 281, 69, 20);
		frmCompra.getContentPane().add(lblTotal);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(660, 279, 146, 26);
		frmCompra.getContentPane().add(textField_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(34, 456, 376, 143);
		frmCompra.getContentPane().add(textArea);
		
		JButton btnAadirEntrada = new JButton("A\u00F1adir entrada");
		
		btnAadirEntrada.setBounds(549, 478, 257, 29);
		frmCompra.getContentPane().add(btnAadirEntrada);
		
		JButton btnFinzalizarCompra = new JButton("Finzalizar Compra");
	
		btnFinzalizarCompra.setBounds(549, 529, 257, 29);
		frmCompra.getContentPane().add(btnFinzalizarCompra);
		
		JButton btnLogout = new JButton("Logout");
		
		btnLogout.setBounds(549, 581, 257, 29);
		frmCompra.getContentPane().add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int t=JOptionPane.showConfirmDialog(null, "desea desloguearse", "logout", JOptionPane.YES_NO_OPTION);
				if(t==0)
					frmCompra.dispose();
				clave.getFrmLogin().setVisible(true);
			}
		});
		btnAadirEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pu=Double.parseDouble(comboBox.getSelectedItem().toString());
				pf=Double.parseDouble(textField_2.getText());
				tot=pu*pf;
				textArea.append(textField_1.getText()+"--->"+(tot)+"€"+"\n");
				mon=mon+tot;
				textField_3.setText(String.valueOf(mon));
				comboBox.setSelectedItem("1");
				textField_1.setText("");
				textField_2.setText("");
				
			}
		});
		btnFinzalizarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "su compra es de " +(textField_3.getText()), "finalizar compra", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		});
			
	
	}
}
