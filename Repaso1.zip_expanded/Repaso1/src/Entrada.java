import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Entrada {

	private JFrame frmPagoRealizadoCon;
public JFrame getFrmPagoRealizadoCon() {
		return frmPagoRealizadoCon;
	}

	public void setFrmPagoRealizadoCon(JFrame frmPagoRealizadoCon) {
		this.frmPagoRealizadoCon = frmPagoRealizadoCon;
	}
	static Rayo p;
static Rayoin principal;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entrada window = new Entrada(principal);
					window.frmPagoRealizadoCon.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static Rayoin getPrincipal() {
		return principal;
	}

	public static void setPrincipal(Rayoin principal) {
		Entrada.principal = principal;
	}

	/**
	 * Create the application.
	 * @param principal 
	 */
	public Entrada(Rayoin principal) {
		initialize();
		this.principal=principal;
	
	}

	public Entrada(Rayo p) {
		initialize();
		this.p=p;
		// TODO Auto-generated constructor stub
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPagoRealizadoCon = new JFrame();
		frmPagoRealizadoCon.getContentPane().setBackground(Color.WHITE);
		frmPagoRealizadoCon.setTitle("Pago realizado con Exito");
		frmPagoRealizadoCon.setBounds(100, 100, 728, 614);
		frmPagoRealizadoCon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPagoRealizadoCon.getContentPane().setLayout(null);
		
		JLabel lblPagoRealizadoCon = new JLabel("Pago Realizado con exito !!\r\n");
		lblPagoRealizadoCon.setForeground(Color.RED);
		lblPagoRealizadoCon.setBackground(Color.RED);
		lblPagoRealizadoCon.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblPagoRealizadoCon.setBounds(29, 51, 662, 173);
		frmPagoRealizadoCon.getContentPane().add(lblPagoRealizadoCon);
		
		JLabel lblDidfruteDelPartido = new JLabel("Didfrute del Partido!!\r\n");
		lblDidfruteDelPartido.setForeground(Color.BLACK);
		lblDidfruteDelPartido.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblDidfruteDelPartido.setBounds(29, 209, 662, 173);
		frmPagoRealizadoCon.getContentPane().add(lblDidfruteDelPartido);
		
		JButton btnInicio = new JButton("Inicio");
		
		btnInicio.setBounds(43, 513, 115, 29);
		frmPagoRealizadoCon.getContentPane().add(btnInicio);
		
		JButton btnAtras = new JButton("Atras");
		
		btnAtras.setBounds(293, 513, 115, 29);
		frmPagoRealizadoCon.getContentPane().add(btnAtras);
		
		JButton btnSalir = new JButton("Salir");
	
		btnSalir.setBounds(556, 513, 115, 29);
		frmPagoRealizadoCon.getContentPane().add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(2);
			}
		});
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmPagoRealizadoCon.dispose();
				principal.getFrmCompraDeEntradas().setVisible(true);
			}
		});
	
	btnInicio.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int re=1;
			if(re==1)
				JOptionPane.showMessageDialog(null, "inicio", "volver inicio",JOptionPane.QUESTION_MESSAGE);
				p.getFrmRayoVallecano().setVisible(true);
				frmPagoRealizadoCon.dispose();
		}
	});
	}
}
