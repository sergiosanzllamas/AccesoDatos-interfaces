package practica2;

import java.awt.EventQueue;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.net.*;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Fin {
	static Log principal;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnLogout;

	private JFrame frame;
	private JLabel lblNewLabel;

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * Launch the application.
	 */
	

	

	private static String obtenerHTML(URL direccion) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fin window = new Fin(principal);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//"translationText":" ","translationContext"
	/**
	 * Create the application.
	 * 
	 * @param log
	 */
	public Fin(Log principal) {
		initialize();
		this.principal = principal;
	}
	public static String obtenerHTML1(URL direccionWeb) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(direccionWeb.openStream()));
		String inputLine, codigo = "";

		while ((inputLine = in.readLine()) != null)
			codigo += inputLine;

		in.close();

		return codigo;
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 597, 588);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button_1 = new JButton("TRADUCTOR");
	

		textField = new JTextField();
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);

		btnLogout = new JButton("Logout");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Espa\u00F1ol-Ingles", "Ingles-Espa\u00F1ol"}));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DAM\\eclipse-workspace\\practica2\\espac3b1a_uk.jpg"));

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(52)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
					.addComponent(button_1)
					.addGap(96)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnLogout)
							.addGap(88))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(202)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(284, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(38)
					.addComponent(lblNewLabel)
					.addContainerGap(53, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(67)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(92)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(183)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(91)
					.addComponent(lblNewLabel)
					.addGap(929)
					.addComponent(btnLogout)
					.addGap(39))
		);
		frame.getContentPane().setLayout(groupLayout);

		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea Salir?", "Confirmar Salida",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (respuesta == 0  ) 
					frame.dispose();
		
					principal.getFrame().setVisible(true);
					
					
					
				
			}
		});
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//int corte_inicial = tocho.indexOf("tra");
				
				//int corte_fin = tocho.indexOf("");
	
					URL direccion = null;
					try {
						direccion = new URL("http://www.spanishdict.com/traductor/"+textField.getText());
						String pepe = URLReader.obtenerHTML(direccion);
						int corte_inicial = pepe.indexOf("\"translationText\":");
						int corte_fin = pepe.indexOf("\",\"translationContext\"");
						String traducida = pepe.substring(corte_inicial+19, corte_fin);
						textField_1.setText(traducida);
						//System.out.println(pepe);
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				
			}
		});
	}
}
