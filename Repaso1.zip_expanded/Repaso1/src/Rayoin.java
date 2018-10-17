import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

public class Rayoin {
static Rayo clave;
double ent,monedero=0,tot,pre,zo;

Entrada entrada = new Entrada(this);
	private JFrame frmCompraDeEntradas;
	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JFrame getFrmCompraDeEntradas() {
		return frmCompraDeEntradas;
	}

	public void setFrmCompraDeEntradas(JFrame frmCompraDeEntradas) {
		this.frmCompraDeEntradas = frmCompraDeEntradas;
	}

	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
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
					Rayoin window = new Rayoin(clave);
					window.frmCompraDeEntradas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param rayo 
	 */
	public Rayoin(Rayo clave) {
		initialize();
		this.clave=clave;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCompraDeEntradas = new JFrame();
		frmCompraDeEntradas.setTitle("Compra de Entradas");
		frmCompraDeEntradas.setBounds(100, 100, 726, 719);
		frmCompraDeEntradas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCompraDeEntradas.getContentPane().setLayout(null);
		
		JLabel lblCompraDeEntradas = new JLabel("Compra de Entradas");
		lblCompraDeEntradas.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblCompraDeEntradas.setBounds(235, 34, 242, 41);
		frmCompraDeEntradas.getContentPane().add(lblCompraDeEntradas);
		
		JLabel lblUsuarioConectado = new JLabel("Usuario Conectado");
		lblUsuarioConectado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsuarioConectado.setBounds(55, 166, 162, 20);
		frmCompraDeEntradas.getContentPane().add(lblUsuarioConectado);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(323, 163, 224, 26);
		frmCompraDeEntradas.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSeleccioneLocalidad = new JLabel("Seleccione Localidad");
		lblSeleccioneLocalidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSeleccioneLocalidad.setBounds(55, 250, 185, 20);
		frmCompraDeEntradas.getContentPane().add(lblSeleccioneLocalidad);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Lateral Baja");
		
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton.setBounds(85, 309, 155, 29);
		frmCompraDeEntradas.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnTribunaAlta = new JRadioButton("Tribuna Alta");
		buttonGroup.add(rdbtnTribunaAlta);
		rdbtnTribunaAlta.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnTribunaAlta.setBounds(85, 374, 155, 29);
		frmCompraDeEntradas.getContentPane().add(rdbtnTribunaAlta);
		
		JRadioButton rdbtnFondo = new JRadioButton("Fondo");
		buttonGroup.add(rdbtnFondo);
		rdbtnFondo.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnFondo.setBounds(85, 430, 155, 29);
		frmCompraDeEntradas.getContentPane().add(rdbtnFondo);
		
		JRadioButton rdbtnPalco = new JRadioButton("Palco");
		buttonGroup.add(rdbtnPalco);
		rdbtnPalco.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnPalco.setBounds(85, 480, 155, 29);
		frmCompraDeEntradas.getContentPane().add(rdbtnPalco);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ninguna", "1", "2", "3", "4"}));
		comboBox.setBounds(478, 329, 146, 26);
		frmCompraDeEntradas.getContentPane().add(comboBox);
		
		JLabel lblNentradas = new JLabel("N\u00BAEntradas");
		lblNentradas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNentradas.setBounds(361, 331, 162, 20);
		frmCompraDeEntradas.getContentPane().add(lblNentradas);
		
		JLabel label = new JLabel("30\u20AC");
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(277, 313, 69, 20);
		frmCompraDeEntradas.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("25\u20AC");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(277, 378, 69, 20);
		frmCompraDeEntradas.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("20\u20AC");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_2.setBounds(277, 434, 69, 20);
		frmCompraDeEntradas.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("50\u20AC");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_3.setBounds(277, 484, 69, 20);
		frmCompraDeEntradas.getContentPane().add(label_3);
		
		JButton btnNewButton = new JButton("Continuar");
		
		
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(102, 602, 115, 29);
		frmCompraDeEntradas.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Logout");
		
		btnNewButton_1.setBounds(322, 602, 115, 29);
		frmCompraDeEntradas.getContentPane().add(btnNewButton_1);
		
		JButton btnSalir = new JButton("Salir");
		
		btnSalir.setBounds(519, 602, 115, 29);
		frmCompraDeEntradas.getContentPane().add(btnSalir);
		
		JLabel lblZona = new JLabel("zona");
		lblZona.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblZona.setBounds(361, 291, 69, 20);
		frmCompraDeEntradas.getContentPane().add(lblZona);
		
		textField_1 = new JTextField();
		textField_1.setBounds(478, 289, 146, 26);
		frmCompraDeEntradas.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(478, 431, 146, 26);
		frmCompraDeEntradas.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTotal.setBounds(361, 433, 69, 20);
		frmCompraDeEntradas.getContentPane().add(lblTotal);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(387, 484, 265, 81);
		frmCompraDeEntradas.getContentPane().add(textArea);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecio.setBounds(361, 377, 162, 20);
		frmCompraDeEntradas.getContentPane().add(lblPrecio);
		
		textField_3 = new JTextField();
		textField_3.setBounds(478, 375, 146, 26);
		frmCompraDeEntradas.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnAadirEntrada = new JButton("A\u00F1adir Entrada");
	
		btnAadirEntrada.setBounds(25, 534, 155, 29);
		frmCompraDeEntradas.getContentPane().add(btnAadirEntrada);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(191, 536, 155, 29);
		frmCompraDeEntradas.getContentPane().add(btnFinalizar);
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					btnNewButton.setEnabled(true);
				}else {
					btnNewButton.setEnabled(false);
				}
					
			}
		});
		rdbtnTribunaAlta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnTribunaAlta.isSelected()) {
					btnNewButton.setEnabled(true);
				}else {
					btnNewButton.setEnabled(false);
				}
					
			}
		});
		rdbtnFondo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnFondo.isSelected()) {
					btnNewButton.setEnabled(true);
				}else {
					btnNewButton.setEnabled(false);
				}
					
			}
		});	
		rdbtnPalco.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnPalco.isSelected()) {
					btnNewButton.setEnabled(true);
				}else {
					btnNewButton.setEnabled(false);
				}
					
			}
		});	
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				entrada.getFrmPagoRealizadoCon().setVisible(true);
				frmCompraDeEntradas.setVisible(false);
				
				
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int re=1;
			if(re==1)
				JOptionPane.showMessageDialog(null, "logout?", "logout",JOptionPane.QUESTION_MESSAGE);
				clave.getFrmRayoVallecano().setVisible(true);
				frmCompraDeEntradas.dispose();
			}
		});
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(2);
			}
		});
		btnAadirEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pre=Double.parseDouble(textField_3.getText());
			
				ent=Double.parseDouble(comboBox.getSelectedItem().toString());
				tot=ent*pre;
		textArea.append(textField_1.getText());
				monedero=monedero+tot;
				
				//textField_2.setText(String.valueOf(monedero));
			}
		});
	}
}
