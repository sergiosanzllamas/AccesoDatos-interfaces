package eventos;

import java.awt.EventQueue;
import java.awt.color.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JList;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class primero {

	private JFrame frmEvento;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JPasswordField hola;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					primero window = new primero();
					window.frmEvento.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public primero() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEvento = new JFrame();
		frmEvento.getContentPane().setBackground(Color.GREEN);

		JList lista = new JList();

		frmEvento.setTitle("evento");
		frmEvento.setBounds(100, 100, 574, 539);
		frmEvento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEvento.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(251, 430, 89, 23);
		frmEvento.getContentPane().add(btnNewButton);

		JButton btnCancelar = new JButton("Cancelar");

		btnCancelar.setBounds(411, 430, 89, 23);
		frmEvento.getContentPane().add(btnCancelar);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(30, 193, 109, 23);
		frmEvento.getContentPane().add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(30, 251, 109, 23);
		frmEvento.getContentPane().add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(30, 325, 109, 23);
		frmEvento.getContentPane().add(rdbtnNewRadioButton_2);

		JList list = new JList();
		list.setBounds(355, 319, 77, -83);
		frmEvento.getContentPane().add(list);

		JList list_1 = new JList();
		list_1.setValueIsAdjusting(true);
		list_1.setBounds(360, 218, 1, 1);
		frmEvento.getContentPane().add(list_1);

		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(55, 112, 46, 14);
		frmEvento.getContentPane().add(lblPassword);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(67, 52, 46, 14);
		frmEvento.getContentPane().add(lblUsuario);

		textField = new JTextField();
		textField.setBounds(154, 52, 86, 20);
		frmEvento.getContentPane().add(textField);
		textField.setColumns(10);

		hola = new JPasswordField();

		hola.setBounds(159, 108, 84, 20);
		frmEvento.getContentPane().add(hola);

		lista.setModel(new AbstractListModel() {
			String[] values = new String[] { "madrid", "barcelona", "toledo ", "aragon" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		lista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		lista.setBounds(355, 145, 60, 99);
		frmEvento.getContentPane().add(lista);

		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(398, 145, 17, 48);
		frmEvento.getContentPane().add(scrollBar);

		JRadioButton rdbtnSi = new JRadioButton("Si");
		buttonGroup.add(rdbtnSi);

		rdbtnSi.setBounds(319, 48, 109, 23);
		frmEvento.getContentPane().add(rdbtnSi);

		JRadioButton rdbtnNo = new JRadioButton("No");
		buttonGroup.add(rdbtnNo);
		rdbtnNo.setBounds(319, 91, 109, 23);
		frmEvento.getContentPane().add(rdbtnNo);

		JTextArea text = new JTextArea();
		text.setBounds(434, 47, 89, 71);
		frmEvento.getContentPane().add(text);

		JCheckBox aceptar = new JCheckBox("acepta TERMINOS");

		aceptar.setBounds(42, 383, 198, 23);
		frmEvento.getContentPane().add(aceptar);

		JComboBox comboBox = new JComboBox();

		comboBox.setModel(new DefaultComboBoxModel(new String[] { "rojo", "azul", "verde", "amarillo" }));
		comboBox.setBounds(204, 266, 143, 20);
		frmEvento.getContentPane().add(comboBox);

		// EVENTOS
		hola.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				textField.setText("hola");

			}
		});

		rdbtnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text.setText("SI");

			}
		});
		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText("No");
			}
		});
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (aceptar.isSelected()) {
					btnNewButton.setEnabled(true);
				} else
					btnNewButton.setEnabled(false);

			}

		});
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				textField.setText(comboBox.getSelectedItem().toString());
				switch (comboBox.getSelectedIndex()) {
				case 0:
					textField.setBackground(new Color(255, 0, 0));
					break;
				case 1:
					textField.setBackground(new Color(0, 0, 255));
					break;
				case 2:
					textField.setBackground(new Color(0, 255, 0));
					break;
				case 3:
					textField.setBackground(new Color(255, 255, 0));
					break;

				}
			}
		});
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frmEvento.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {

			}
		});
	}
}
