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

public class Compra {
static Lo clave;
double pu,pf,tot,mon=0;
	private JFrame frmCompra;
	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}
	public JFrame getFrmCompra() {
		return frmCompra;
	}

	public void setFrmCompra(JFrame frmCompra) {
		this.frmCompra = frmCompra;
	}

	private JTextField textField;
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
					Compra window = new Compra(clave);
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
	public Compra(Lo clave) {
		initialize();
		this.clave=clave;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCompra = new JFrame();
		frmCompra.setTitle("Compra");
		frmCompra.setBounds(100, 100, 682, 500);
		frmCompra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCompra.getContentPane().setLayout(null);
		
		JLabel lblUsuarioConectado = new JLabel("Usuario conectado");
		lblUsuarioConectado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsuarioConectado.setBounds(15, 55, 172, 20);
		frmCompra.getContentPane().add(lblUsuarioConectado);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(251, 53, 210, 26);
		frmCompra.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblProducto = new JLabel("Producto");
		lblProducto.setBounds(15, 154, 69, 20);
		frmCompra.getContentPane().add(lblProducto);
		
		textField_1 = new JTextField();
		textField_1.setBounds(99, 151, 120, 26);
		frmCompra.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNunidades = new JLabel("N\u00BAUnidades");
		lblNunidades.setBounds(234, 154, 97, 20);
		frmCompra.getContentPane().add(lblNunidades);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBox.setBounds(327, 148, 69, 26);
		frmCompra.getContentPane().add(comboBox);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(423, 154, 69, 20);
		frmCompra.getContentPane().add(lblPrecio);
		
		textField_2 = new JTextField();
		textField_2.setBounds(499, 151, 104, 26);
		frmCompra.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(28, 220, 354, 142);
		frmCompra.getContentPane().add(textArea);
		
		JButton btnAadirProducto = new JButton("A\u00F1adir Producto");
		
		btnAadirProducto.setBounds(423, 230, 180, 29);
		frmCompra.getContentPane().add(btnAadirProducto);
		
		JButton btnFinalizarCompra = new JButton("Finalizar Compra");
		
		btnFinalizarCompra.setBounds(423, 286, 180, 29);
		frmCompra.getContentPane().add(btnFinalizarCompra);
		
		JButton btnLogout = new JButton("Logout");
		
		btnLogout.setBounds(423, 353, 180, 29);
		frmCompra.getContentPane().add(btnLogout);
		
		JLabel lblTotal = new JLabel("Total(\u20AC)");
		lblTotal.setBounds(423, 103, 69, 20);
		frmCompra.getContentPane().add(lblTotal);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(499, 100, 104, 26);
		frmCompra.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int te=JOptionPane.showConfirmDialog(null, "desea desloguearse", "logout", JOptionPane.YES_NO_OPTION);
				if(te==0)
					frmCompra.dispose();
					clave.getFrmLogin().setVisible(true);
			}
		});
		btnAadirProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pu=Double.parseDouble(comboBox.getSelectedItem().toString());
				pf=Double.parseDouble(textField_2.getText());
				tot=pu*pf;
				textArea.append(textField_1.getText()+(tot)+"€"+"\n");
				mon=mon+tot;
				textField_3.setText(String.valueOf(mon));
				textField_1.setText("");
				comboBox.setSelectedItem("1");
				textField_2.setText("");
				
			}
		});
		btnFinalizarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int q=JOptionPane.showConfirmDialog(null, "su compra es de--->"+(textField_3.getText())+"€", "fin", JOptionPane.INFORMATION_MESSAGE);
				if(q==0)
					System.exit(0);
			}
		});
	}

	

}
