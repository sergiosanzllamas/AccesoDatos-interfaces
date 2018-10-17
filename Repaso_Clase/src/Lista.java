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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Lista {
	static Login clave;
	double pf, pu, tot, monedero = 0;

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

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	private JTextField textField_2;

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	private JTextField textField_3;

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

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
	 * 
	 * @param login
	 */
	public Lista(Login clave) {
		initialize();
		this.clave = clave;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListaDeCompra = new JFrame();
		frmListaDeCompra.setTitle("Lista de compra");
		frmListaDeCompra.setBounds(100, 100, 531, 496);
		frmListaDeCompra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmListaDeCompra.getContentPane().setLayout(null);

		JLabel lblIdentificacionDeUsuario = new JLabel("Identificacion de Usuario");
		lblIdentificacionDeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdentificacionDeUsuario.setBounds(21, 85, 185, 14);
		frmListaDeCompra.getContentPane().add(lblIdentificacionDeUsuario);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(235, 84, 149, 20);
		frmListaDeCompra.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblTotalAPagar = new JLabel("Total a pagar(\u20AC)");
		lblTotalAPagar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTotalAPagar.setBounds(282, 130, 116, 19);
		frmListaDeCompra.getContentPane().add(lblTotalAPagar);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(392, 131, 86, 20);
		frmListaDeCompra.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblProducto = new JLabel("Producto");
		lblProducto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProducto.setBounds(21, 193, 86, 14);
		frmListaDeCompra.getContentPane().add(lblProducto);

		textField_2 = new JTextField();
		textField_2.setBounds(91, 192, 116, 20);
		frmListaDeCompra.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel lblCantidadYPreciounidad = new JLabel("Cantidad y precio/unidad");
		lblCantidadYPreciounidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCantidadYPreciounidad.setBounds(217, 195, 152, 14);
		frmListaDeCompra.getContentPane().add(lblCantidadYPreciounidad);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
		comboBox.setBounds(368, 192, 40, 20);
		frmListaDeCompra.getContentPane().add(comboBox);

		textField_3 = new JTextField();
		textField_3.setBounds(419, 192, 59, 20);
		frmListaDeCompra.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);

		textArea.setBounds(21, 278, 262, 104);
		frmListaDeCompra.getContentPane().add(textArea);

		JButton btnNewButton = new JButton("A\u00F1adir producto creado");

		btnNewButton.setBounds(309, 279, 169, 23);
		frmListaDeCompra.getContentPane().add(btnNewButton);

		JButton btnFinalizarCompra = new JButton("Finalizar compra");

		btnFinalizarCompra.setBounds(309, 359, 169, 23);
		frmListaDeCompra.getContentPane().add(btnFinalizarCompra);

		JButton btnLogout = new JButton("LOGOUT");

		btnLogout.setBounds(368, 411, 89, 23);
		frmListaDeCompra.getContentPane().add(btnLogout);
		btnFinalizarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int re = 1;
				if (re == 1)
					JOptionPane.showMessageDialog(null, "su compra es de=" + textField_1.getText() , "compra",
							JOptionPane.INFORMATION_MESSAGE);
				System.exit(1);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pu = Double.parseDouble(comboBox.getSelectedItem().toString());// 2 barras
				pf = Double.parseDouble(textField_3.getText());// 1.5 por barra
				tot = pu * pf;// 3 € las barras
				// textArea.append(textField_2.getText()+
				// "\n"+(pu*pf)+textField_3.getText()+"\n");
				textArea.append(textField_2.getText() + "-->" + (tot) + "€\n");
				monedero = monedero + tot;
				textField_1.setText(String.valueOf(monedero));
				textField_2.setText("");
				comboBox.setSelectedItem("1");
				textField_3.setText("");

			}
		});
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int u = JOptionPane.showConfirmDialog(null, "desea salir", "logout", JOptionPane.YES_NO_OPTION);
				if (u == 0) {
					frmListaDeCompra.dispose();
					clave.getFrmLoginUsuario().setVisible(true);
				}

			}
		});

	}

}
