import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;

public class Telefono {
	static Log clave;
	private JFrame frmTelefonoJava;

	public JFrame getFrmTelefonoJava() {
		return frmTelefonoJava;
	}

	public void setFrmTelefonoJava(JFrame frmTelefonoJava) {
		this.frmTelefonoJava = frmTelefonoJava;
	}

	private JTextField textField;

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telefono window = new Telefono(clave);
					window.frmTelefonoJava.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @param clave
	 */
	public Telefono(Log clave) {
		initialize();
		this.clave = clave;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelefonoJava = new JFrame();
		frmTelefonoJava.setResizable(false);
		frmTelefonoJava.setTitle("TELEFONO JAVA");
		frmTelefonoJava.setBounds(100, 100, 509, 252);
		frmTelefonoJava.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelefonoJava.getContentPane().setLayout(null);

		JRadioButton rdbtnLlamada = new JRadioButton("Llamada");

		buttonGroup.add(rdbtnLlamada);
		rdbtnLlamada.setBounds(34, 5, 69, 23);
		rdbtnLlamada.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmTelefonoJava.getContentPane().add(rdbtnLlamada);

		JRadioButton rdbtnEnviarSms = new JRadioButton("Enviar SMS");

		buttonGroup.add(rdbtnEnviarSms);
		rdbtnEnviarSms.setBounds(118, 5, 85, 23);
		rdbtnEnviarSms.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmTelefonoJava.getContentPane().add(rdbtnEnviarSms);

		JLabel lblMarcacion = new JLabel("Marcacion:");
		lblMarcacion.setBounds(221, 10, 64, 14);
		frmTelefonoJava.getContentPane().add(lblMarcacion);

		textField = new JTextField();

		textField.setEditable(false);
		textField.setBounds(295, 7, 86, 20);
		frmTelefonoJava.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Borrar");
		btnNewButton.setBounds(391, 6, 92, 23);

		frmTelefonoJava.getContentPane().add(btnNewButton);

		JCheckBox chckbxAadirPrefijo = new JCheckBox("A\u00F1adir Prefijo");

		chckbxAadirPrefijo.setBounds(6, 186, 108, 23);
		frmTelefonoJava.getContentPane().add(chckbxAadirPrefijo);

		JComboBox comboBox = new JComboBox();

		comboBox.setModel(new DefaultComboBoxModel(new String[] { "ESPA\u00D1A", "FRANCIA", "ALEMANIA" }));
		comboBox.setEnabled(false);
		comboBox.setBounds(113, 187, 77, 20);
		frmTelefonoJava.getContentPane().add(comboBox);

		JButton btnLlamar = new JButton("LLAMAR");

		btnLlamar.setBounds(200, 186, 85, 23);
		frmTelefonoJava.getContentPane().add(btnLlamar);

		JButton btnEnviarSms = new JButton("ENVIAR SMS");
		btnEnviarSms.setEnabled(false);

		btnEnviarSms.setBounds(287, 186, 105, 23);
		frmTelefonoJava.getContentPane().add(btnEnviarSms);

		JButton btnNewButton_1 = new JButton("SALIR");

		btnNewButton_1.setBounds(402, 186, 81, 23);
		frmTelefonoJava.getContentPane().add(btnNewButton_1);

		JButton button = new JButton("1");

		button.setBounds(6, 35, 44, 38);
		frmTelefonoJava.getContentPane().add(button);

		JButton button_1 = new JButton("2");

		button_1.setBounds(48, 35, 41, 38);
		frmTelefonoJava.getContentPane().add(button_1);

		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(87, 35, 44, 38);
		frmTelefonoJava.getContentPane().add(button_2);

		JButton button_3 = new JButton("4");

		button_3.setBounds(6, 73, 44, 30);
		frmTelefonoJava.getContentPane().add(button_3);

		JButton button_4 = new JButton("5");
		button_4.setBounds(45, 73, 44, 30);
		frmTelefonoJava.getContentPane().add(button_4);

		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_5.setBounds(87, 73, 44, 30);
		frmTelefonoJava.getContentPane().add(button_5);

		JButton button_6 = new JButton("7");
		button_6.setBounds(6, 99, 44, 38);
		frmTelefonoJava.getContentPane().add(button_6);

		JButton button_7 = new JButton("8");
		button_7.setBounds(48, 99, 41, 38);
		frmTelefonoJava.getContentPane().add(button_7);

		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_8.setBounds(87, 99, 44, 38);
		frmTelefonoJava.getContentPane().add(button_8);

		JButton button_9 = new JButton("*");
		button_9.setBounds(6, 137, 44, 38);
		frmTelefonoJava.getContentPane().add(button_9);

		JButton button_10 = new JButton("0");
		button_10.setBounds(49, 137, 41, 38);
		frmTelefonoJava.getContentPane().add(button_10);

		JButton button_11 = new JButton("#");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_11.setBounds(87, 137, 44, 39);
		frmTelefonoJava.getContentPane().add(button_11);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(131, 35, 352, 141);
		frmTelefonoJava.getContentPane().add(scrollPane);

		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		textPane.setEditable(false);
		rdbtnEnviarSms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnEnviarSms.isSelected())
					textPane.setEditable(true);
				btnEnviarSms.setEnabled(true);
				btnLlamar.setEnabled(false);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("1");
			}
		});
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");

			}
		});
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "*");
			}
		});
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "#");
			}
		});
		chckbxAadirPrefijo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxAadirPrefijo.isSelected())
					comboBox.setEnabled(true);
				else {
					comboBox.setEnabled(false);
				}
			}
		});
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedIndex() == 0)
					textField.setText("+34");
				else if (comboBox.getSelectedIndex() == 1)
					textField.setText("+33");

				else

					textField.setText("+49");

			}
		});
		btnLlamar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals(""))
					JOptionPane.showMessageDialog(null, "debe proporcinar un numero de telefono", "Error",
							JOptionPane.ERROR_MESSAGE);
				else {
					JOptionPane.showMessageDialog(null, "Llamando a:" + (textField.getText()), "Llamando",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnEnviarSms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("")) {

					JOptionPane.showMessageDialog(null, "debe proporcinar un telefono", "Error",
							JOptionPane.ERROR_MESSAGE);

				} else {
					if (textPane.getText().equals("")) {

						JOptionPane.showMessageDialog(null, "debe proporcinar un mensaje", "Error",
								JOptionPane.ERROR_MESSAGE);
					}

					else {
						if (textField.getText().equals("") || textPane.getText().equals("")) {
							JOptionPane.showMessageDialog(null,
									"debe proporcinar un numero de telefono y mensaje de texto", "Error",
									JOptionPane.ERROR_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null, "enviando mensaje a:" + (textField.getText()),
									"Llamando", JOptionPane.INFORMATION_MESSAGE);
						}
					}

				}

			}

		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = JOptionPane.showConfirmDialog(null, "¿Realmente desea salir?", "Confirmar salida",
						JOptionPane.YES_NO_OPTION);
				if (x == 0)
					frmTelefonoJava.dispose();
				clave.getFrame().setVisible(true);
			}
		});
	}

}