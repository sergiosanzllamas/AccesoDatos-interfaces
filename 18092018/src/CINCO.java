import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CINCO {

	private JFrame frmCinco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CINCO window = new CINCO();
					window.frmCinco.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CINCO() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCinco = new JFrame();
		frmCinco.setTitle("cinco");
		frmCinco.setBounds(100, 100, 655, 516);
		frmCinco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCinco.getContentPane().setLayout(new GridLayout(1, 3, 0, 0));
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(Color.RED);
		
		frmCinco.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("New button");
		frmCinco.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("New button");
		frmCinco.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setForeground(Color.RED);
		frmCinco.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("New button");
		frmCinco.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		frmCinco.getContentPane().add(btnNewButton_5);
	}

}
