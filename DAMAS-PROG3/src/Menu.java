import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnJugar = new JButton("Jugar");
		btnJugar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ventana v =new ventana();
				v.main(null);
			}
		});
		btnJugar.setBounds(173, 112, 89, 23);
		contentPane.add(btnJugar);
		
		JButton btnEstadisticas = new JButton("Estadisticas");
		btnEstadisticas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnEstadisticas.setBounds(173, 146, 89, 23);
		contentPane.add(btnEstadisticas);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
			}
		});
		btnSalir.setBounds(173, 180, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblDamas = new JLabel("DAMAS");
		lblDamas.setBounds(196, 49, 46, 14);
		contentPane.add(lblDamas);
	}
}
