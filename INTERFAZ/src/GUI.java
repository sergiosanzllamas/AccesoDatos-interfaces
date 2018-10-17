import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JYearChooser;
import com.toedter.calendar.JMonthChooser;

public class GUI {

	private JFrame frmHola;
	private JPasswordField pwdSergio;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmHola.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHola = new JFrame();
		frmHola.setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		frmHola.setTitle("Hola");
		frmHola.getContentPane().setIgnoreRepaint(true);
		frmHola.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frmHola.getContentPane().setBackground(Color.YELLOW);
		frmHola.getContentPane().setForeground(Color.BLACK);
		frmHola.setBounds(100, 100, 843, 775);
		frmHola.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setToolTipText("dale aceptar");
		btnNewButton.setMnemonic('a');
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(346, 625, 193, 73);
		btnNewButton.setBackground(Color.RED);
		frmHola.getContentPane().add(btnNewButton);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(Color.RED);
		btnCancelar.setBounds(590, 625, 193, 73);
		frmHola.getContentPane().add(btnCancelar);

		pwdSergio = new JPasswordField();
		pwdSergio.setToolTipText("Contrase\u00F1a del registro");
		pwdSergio.setEchoChar('@');
		pwdSergio.setBounds(286, 160, 284, 20);
		frmHola.getContentPane().add(pwdSergio);

		JLabel lblNewLabel = new JLabel("usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(113, 83, 82, 14);
		frmHola.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(286, 80, 284, 20);
		frmHola.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(113, 163, 82, 14);
		frmHola.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Rayo vallecano");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\DAM\\Pictures\\190px-EscudoRayo.png"));
		lblNewLabel_2.setBounds(99, 388, 324, 167);
		frmHola.getContentPane().add(lblNewLabel_2);

		JCheckBox chckbxDale = new JCheckBox("dale");
		chckbxDale.setBounds(304, 255, 97, 23);
		frmHola.getContentPane().add(chckbxDale);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Mujer");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(521, 353, 109, 23);
		frmHola.getContentPane().add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Otro");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(521, 407, 109, 23);
		frmHola.getContentPane().add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Hombre");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setToolTipText("");
		rdbtnNewRadioButton_2.setBounds(521, 290, 109, 23);
		frmHola.getContentPane().add(rdbtnNewRadioButton_2);

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("no");
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(63, 584, 109, 23);
		frmHola.getContentPane().add(rdbtnNewRadioButton_3);

		JRadioButton rdbtnSi = new JRadioButton("si");
		buttonGroup_1.add(rdbtnSi);
		rdbtnSi.setBounds(63, 650, 109, 23);
		frmHola.getContentPane().add(rdbtnSi);

		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setMaximumRowCount(6);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "rojo", "azul", "verde" }));
		comboBox.setSelectedIndex(2);
		comboBox.setBounds(718, 215, 82, 20);
		frmHola.getContentPane().add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(581, 484, 116, 70);
		frmHola.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setRows(2);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(680, 484, 17, 48);
		frmHola.getContentPane().add(scrollBar);
		
		JList list = new JList();
		list.setBounds(465, 544, 1, 1);
		frmHola.getContentPane().add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(73, 290, 122, -57);
		frmHola.getContentPane().add(list_1);
		
		JList list_2 = new JList();
		list_2.setBounds(83, 283, 89, -38);
		frmHola.getContentPane().add(list_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(36, 198, 95, 162);
		frmHola.getContentPane().add(scrollPane_1);
		
		JList list_3 = new JList();
		scrollPane_1.setViewportView(list_3);
		list_3.setModel(new AbstractListModel() {
			String[] values = new String[] {"djhsdj", "sdvksdvmsdl\u00F1v", "sddklsdfsd", "ssss", "sllsd", "fskdflsdmsd", "", "s", "s", "s", "s"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_3.setSelectedIndex(3);
		
		
		
		

	}
}
