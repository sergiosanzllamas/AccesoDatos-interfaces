package practica1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

public class pra1 {

	private JFrame frmRayoVallecano;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pra1 window = new pra1();
					window.frmRayoVallecano.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pra1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRayoVallecano = new JFrame();
		frmRayoVallecano.getContentPane().setBackground(Color.WHITE);
		frmRayoVallecano.getContentPane().setForeground(Color.WHITE);
		frmRayoVallecano.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
		frmRayoVallecano.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DAM\\Pictures\\190px-EscudoRayo.png"));
		frmRayoVallecano.setTitle("Rayo vallecano");
		frmRayoVallecano.setBounds(100, 100, 678, 936);
		frmRayoVallecano.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRayoVallecano.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Correo");
		lblNewLabel.setBounds(45, 255, 46, 14);
		frmRayoVallecano.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre de Usuario");
		lblNewLabel_1.setBounds(45, 180, 111, 23);
		frmRayoVallecano.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(86, 843, 89, 23);
		frmRayoVallecano.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("Cancelar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(323, 843, 89, 23);
		frmRayoVallecano.getContentPane().add(button);
		
		JButton button_1 = new JButton("Salir");
		button_1.setBounds(540, 843, 89, 23);
		frmRayoVallecano.getContentPane().add(button_1);
		
		JLabel lblRegistroDeUsusario = new JLabel("Registro de Ususario");
		lblRegistroDeUsusario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRegistroDeUsusario.setBounds(203, 23, 186, 44);
		frmRayoVallecano.getContentPane().add(lblRegistroDeUsusario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(45, 320, 88, 14);
		frmRayoVallecano.getContentPane().add(lblContrasea);
		
		textField = new JTextField();
		textField.setBounds(228, 181, 161, 20);
		frmRayoVallecano.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(228, 252, 161, 20);
		frmRayoVallecano.getContentPane().add(textField_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(228, 319, 161, 23);
		frmRayoVallecano.getContentPane().add(passwordField);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(45, 474, 46, 14);
		frmRayoVallecano.getContentPane().add(lblSexo);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(59, 529, 109, 23);
		frmRayoVallecano.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		buttonGroup.add(rdbtnFemenino);
		rdbtnFemenino.setBounds(59, 592, 109, 23);
		frmRayoVallecano.getContentPane().add(rdbtnFemenino);
		
		JRadioButton rdbtnOtros = new JRadioButton("Otros");
		buttonGroup.add(rdbtnOtros);
		rdbtnOtros.setBounds(59, 663, 109, 23);
		frmRayoVallecano.getContentPane().add(rdbtnOtros);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0-12", "12-16", "16-21", "21-99"}));
		comboBox.setBounds(234, 406, 100, 20);
		frmRayoVallecano.getContentPane().add(comboBox);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(45, 409, 46, 14);
		frmRayoVallecano.getContentPane().add(lblEdad);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Aceptar condiciones");
		chckbxNewCheckBox.setBounds(387, 734, 227, 23);
		frmRayoVallecano.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxQuieresRecibirDescuentos = new JCheckBox("Quieres recibir descuentos");
		chckbxQuieresRecibirDescuentos.setBounds(387, 673, 228, 23);
		frmRayoVallecano.getContentPane().add(chckbxQuieresRecibirDescuentos);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\DAM\\Pictures\\190px-EscudoRayo.png"));
		lblNewLabel_2.setBounds(387, 474, 242, 179);
		frmRayoVallecano.getContentPane().add(lblNewLabel_2);
	}
}
