import java.awt.EventQueue;
import java.net.*;
import java.io.*;
import java.net.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

import Repaso1.URLReader;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.io.*;
public class Final {
static Inicio clave;
	private JFrame frame;
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Final window = new Final(clave);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param inicio 
	 */
	public Final(Inicio clave) {
		initialize();
		this.clave=clave;
	}
	public static String obtenerHTML(URL direccionWeb) throws Exception {

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
		frame.setBounds(100, 100, 602, 432);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTraductor = new JLabel("Traductor");
		lblTraductor.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		lblTraductor.setBounds(241, 36, 133, 28);
		frame.getContentPane().add(lblTraductor);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Espa\u00F1ol-Ingles", "Ingles-Espa\u00F1ol"}));
		comboBox.setBounds(409, 167, 156, 26);
		frame.getContentPane().add(comboBox);
		
		JLabel lblUsuarioConectado = new JLabel("Usuario Conectado");
		lblUsuarioConectado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsuarioConectado.setBounds(40, 117, 175, 20);
		frame.getContentPane().add(lblUsuarioConectado);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(247, 114, 204, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(41, 228, 146, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnTraducir = new JButton("Traducir");
		
		btnTraducir.setBounds(241, 227, 115, 29);
		frame.getContentPane().add(btnTraducir);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(409, 228, 146, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnLogout = new JButton("Logout");
		
		btnLogout.setBounds(72, 331, 115, 29);
		frame.getContentPane().add(btnLogout);
		
		JButton btnSalir = new JButton("Salir");
	
		btnSalir.setBounds(364, 331, 115, 29);
		frame.getContentPane().add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea volver al Inicio?", "volver", JOptionPane.YES_NO_OPTION);
				if(respuesta==0)
					frame.dispose();
				clave.getFrmInicio().setVisible(true);
			}
		});
		btnTraducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				URL direccion = null;
				try {
					direccion = new URL("http://www.spanishdict.com/traductor/"+textField.getText());
					String frase = URLReader.obtenerHTML(direccion);
					int corte_inicial = frase.indexOf("\"translationText\":");
					int corte_fin = frase.indexOf("\",\"translationContext\"");
					String traducida = frase.substring(corte_inicial+19, corte_fin);
					textField_2.setText(traducida);
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
