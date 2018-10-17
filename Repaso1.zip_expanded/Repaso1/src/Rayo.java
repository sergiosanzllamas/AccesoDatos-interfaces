

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Rayo {
Rayoin rayo=new Rayoin(this);
Entrada entro = new Entrada(this);
	private JFrame frmRayoVallecano;
	public JFrame getFrmRayoVallecano() {
		return frmRayoVallecano;
	}

	public void setFrmRayoVallecano(JFrame frmRayoVallecano) {
		this.frmRayoVallecano = frmRayoVallecano;
	}

	private JTextField textField;
	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	private JTextField textField_1;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rayo window = new Rayo();
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
	public Rayo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRayoVallecano = new JFrame();
		frmRayoVallecano.getContentPane().setBackground(Color.WHITE);
		frmRayoVallecano.getContentPane().setForeground(Color.WHITE);
		frmRayoVallecano.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmRayoVallecano.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\sergi\\OneDrive\\2grado\\desarrollo interfaces\\RAYO-VALLECANO-B.jpg"));
		frmRayoVallecano.setTitle("Rayo vallecano");
		frmRayoVallecano.setBounds(100, 100, 915, 936);
		frmRayoVallecano.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRayoVallecano.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Correo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(45, 255, 130, 14);
		frmRayoVallecano.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nombre de Usuario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(45, 180, 186, 23);
		frmRayoVallecano.getContentPane().add(lblNewLabel_1);

		JButton btnNewButton = new JButton("Aceptar");
		
		btnNewButton.setEnabled(false);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));

		btnNewButton.setBounds(86, 843, 111, 23);
		frmRayoVallecano.getContentPane().add(btnNewButton);

		JButton button = new JButton("Cancelar");

		button.setFont(new Font("Tahoma", Font.PLAIN, 18));

		button.setBounds(368, 843, 111, 23);
		frmRayoVallecano.getContentPane().add(button);

		JButton button_1 = new JButton("Salir");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 18));

		button_1.setBounds(647, 843, 122, 23);
		frmRayoVallecano.getContentPane().add(button_1);

		JLabel lblRegistroDeUsusario = new JLabel("Registro de Ususario");
		lblRegistroDeUsusario.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		lblRegistroDeUsusario.setBounds(293, 26, 263, 44);
		frmRayoVallecano.getContentPane().add(lblRegistroDeUsusario);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContrasea.setBounds(45, 320, 111, 14);
		frmRayoVallecano.getContentPane().add(lblContrasea);

		textField = new JTextField();
		textField.setToolTipText("Introduce nombre de usuario\r\n");

		textField.setBounds(303, 181, 161, 20);
		frmRayoVallecano.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setToolTipText("Introduce tu correo");
		textField_1.setColumns(10);
		textField_1.setBounds(303, 252, 161, 20);
		frmRayoVallecano.getContentPane().add(textField_1);

		passwordField = new JPasswordField();
		passwordField.setToolTipText("Introduce la contraseña");
		passwordField.setEchoChar('ϟ');
		passwordField.setBounds(303, 315, 161, 23);
		frmRayoVallecano.getContentPane().add(passwordField);

		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSexo.setBounds(45, 474, 46, 14);
		frmRayoVallecano.getContentPane().add(lblSexo);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");

		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(59, 530, 109, 23);
		frmRayoVallecano.getContentPane().add(rdbtnNewRadioButton);

		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");

		rdbtnFemenino.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonGroup.add(rdbtnFemenino);
		rdbtnFemenino.setBounds(59, 592, 109, 23);
		frmRayoVallecano.getContentPane().add(rdbtnFemenino);

		JRadioButton rdbtnOtros = new JRadioButton("Otros");

		rdbtnOtros.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonGroup.add(rdbtnOtros);
		rdbtnOtros.setBounds(59, 663, 109, 23);
		frmRayoVallecano.getContentPane().add(rdbtnOtros);

		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Indica tu rango de edad");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ninguna", "0-12", "12-16", "16-21", "21-99"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(234, 406, 100, 20);
		frmRayoVallecano.getContentPane().add(comboBox);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEdad.setBounds(45, 409, 46, 14);
		frmRayoVallecano.getContentPane().add(lblEdad);

		JCheckBox condiciones = new JCheckBox("Aceptar condiciones");
		condiciones.setToolTipText("Si aceptas las condiciones");

		condiciones.setFont(new Font("Tahoma", Font.PLAIN, 18));
		condiciones.setBounds(567, 733, 227, 23);
		frmRayoVallecano.getContentPane().add(condiciones);

		JCheckBox chckbxQuieresRecibirDescuentos = new JCheckBox("Quieres recibir descuentos");
		chckbxQuieresRecibirDescuentos.setToolTipText("Indica si quieres recibir descuentos");
		chckbxQuieresRecibirDescuentos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxQuieresRecibirDescuentos.setBounds(567, 650, 239, 23);
		frmRayoVallecano.getContentPane().add(chckbxQuieresRecibirDescuentos);

		JLabel lblSugerencias = new JLabel("Sugerencias");
		lblSugerencias.setToolTipText("Indica alguna sugerencia que tengas");
		lblSugerencias.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSugerencias.setBounds(649, 317, 122, 20);
		frmRayoVallecano.getContentPane().add(lblSugerencias);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(628, 350, 166, 189);
		frmRayoVallecano.getContentPane().add(scrollPane);

		JTextArea sugerencias = new JTextArea();
		sugerencias.setToolTipText("Escribe alguna duda o sugerencia");
		sugerencias.setFont(new Font("Monospaced", Font.PLAIN, 18));
		scrollPane.setViewportView(sugerencias);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\sergi\\OneDrive\\2grado\\desarrollo interfaces\\rayo_vallecano_footballteam_18011.png"));
		lblNewLabel_2.setBounds(601, 26, 263, 253);
		frmRayoVallecano.getContentPane().add(lblNewLabel_2);

		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		condiciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (condiciones.isSelected()) {
					btnNewButton.setEnabled(true);
				} else
					btnNewButton.setEnabled(false);
			}
		});
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton.isSelected())
					sugerencias.setText("Disfruta del Rayo");

			}
		});
		rdbtnFemenino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnFemenino.isSelected())
					sugerencias.setText("Disfruta del Rayo");
			}
		});
		rdbtnOtros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnOtros.isSelected())
					sugerencias.setText("Disfruta del Rayo");
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (button.hasFocus())
					textField.setText("");
			}
		});

		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (button.hasFocus())
					textField_1.setText("");
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (button.hasFocus())
					passwordField.setText("");
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (button.hasFocus())
					buttonGroup.clearSelection();
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (button.hasFocus())
					sugerencias.setText("");
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (button.hasFocus())
					chckbxQuieresRecibirDescuentos.setSelected(false);
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (button.hasFocus())
					condiciones.setSelected(false);
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (button.hasFocus())
					comboBox.setSelectedItem("Ninguna");
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().equals(passwordField.getText()) ||textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "error al entrar","registro incorrecto", JOptionPane.ERROR_MESSAGE);
			}else {
				int respuesta =JOptionPane.showConfirmDialog(null, "quieres entrar", "Entrar", JOptionPane.YES_NO_OPTION);
				if(respuesta==0)
					rayo.getFrmCompraDeEntradas().setVisible(true);
					frmRayoVallecano.setVisible(false);
				rayo.getTextField().setText(textField.getText());
				}
			}
		});
		
	}
}
