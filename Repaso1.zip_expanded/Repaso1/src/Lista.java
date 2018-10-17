import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lista {
static Log clave;
double pu,pf,tot,mon=0;
	private JFrame frmListaDeCompra;
	public JFrame getFrmListaDeCompra() {
		return frmListaDeCompra;
	}

	public void setFrmListaDeCompra(JFrame frmListaDeCompra) {
		this.frmListaDeCompra = frmListaDeCompra;
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
					Lista window = new Lista(clave);
					window.frmListaDeCompra.setVisible(true);
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
	public Lista(Log clave) {
		initialize();
		this.clave=clave;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListaDeCompra = new JFrame();
		frmListaDeCompra.setTitle("Lista de compra");
		frmListaDeCompra.setBounds(100, 100, 702, 493);
		frmListaDeCompra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmListaDeCompra.getContentPane().setLayout(null);
		
		JLabel lblIndentificadionDeUsuario = new JLabel("Indentificadion de usuario");
		lblIndentificadionDeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIndentificadionDeUsuario.setBounds(31, 45, 243, 20);
		frmListaDeCompra.getContentPane().add(lblIndentificadionDeUsuario);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(248, 43, 146, 26);
		frmListaDeCompra.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total(\u20AC)");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTotal.setBounds(420, 45, 113, 20);
		frmListaDeCompra.getContentPane().add(lblTotal);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(519, 43, 146, 26);
		frmListaDeCompra.getContentPane().add(textField_1);
		
		JLabel lblProducto = new JLabel("Producto");
		lblProducto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProducto.setBounds(15, 134, 128, 20);
		frmListaDeCompra.getContentPane().add(lblProducto);
		
		textField_2 = new JTextField();
		textField_2.setBounds(100, 132, 134, 26);
		frmListaDeCompra.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCantidadprecioPorUnidad = new JLabel("Cantidad/precio por unidad");
		lblCantidadprecioPorUnidad.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCantidadprecioPorUnidad.setBounds(248, 135, 213, 20);
		frmListaDeCompra.getContentPane().add(lblCantidadprecioPorUnidad);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
		comboBox.setBounds(469, 132, 64, 26);
		frmListaDeCompra.getContentPane().add(comboBox);
		
		textField_3 = new JTextField();
		textField_3.setBounds(549, 132, 116, 26);
		frmListaDeCompra.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(15, 239, 380, 136);
		frmListaDeCompra.getContentPane().add(textArea);
		
		JButton btnAaadirProducto = new JButton("Aa\u00F1adir producto");
		
		btnAaadirProducto.setBounds(440, 235, 201, 29);
		frmListaDeCompra.getContentPane().add(btnAaadirProducto);
		
		JButton btnFinalizarCompra = new JButton("Finalizar compra");
		
		btnFinalizarCompra.setBounds(440, 296, 201, 29);
		frmListaDeCompra.getContentPane().add(btnFinalizarCompra);
		
		JButton btnLogout = new JButton("Logout");
		
		btnLogout.setBounds(440, 362, 201, 29);
		frmListaDeCompra.getContentPane().add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r=JOptionPane.showConfirmDialog(null, "deseas desloguearte", "logout",JOptionPane.YES_NO_OPTION);
				if(r==0)
					frmListaDeCompra.dispose();
				clave.getFrmLogin().setVisible(true);
				
			}
		});
		btnAaadirProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pu=Double.parseDouble(comboBox.getSelectedItem().toString());
				pf=Double.parseDouble(textField_3.getText());
				tot=pu*pf;
				textArea.append(textField_2.getText()+"--->"+(tot)+"€"+"\n");
				mon=mon+tot;
				textField_1.setText(String.valueOf(mon));
				textField_2.setText("");
				comboBox.setSelectedItem("1");
				textField_3.setText("");
			}
		});
		btnFinalizarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int q=JOptionPane.showConfirmDialog(null, "su compra es de--->"+(textField_1.getText())+"€", "fin", JOptionPane.INFORMATION_MESSAGE);
				if(q==0)
					System.exit(0);
			}
		});
	}
}
