package Visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

public class InicioSesion extends JFrame {

	private JPanel contentPane;
	private JTextField txtContraseña;
	private JTextField txtUsername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion frame = new InicioSesion();
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
	public InicioSesion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(InicioSesion.class.getResource("/Image/homepage_home_house_icon_153873.png")));
		setTitle("Iniciar Sesión");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 10, 463, 362);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(InicioSesion.class.getResource("/Image/avatardefault_92824.png")));
		//lblNewLabel.setIcon(new ImageIcon(InicioSesion.class.getResource("/Image/usuario (2).png")));
		lblNewLabel.setBounds(179, 33, 96, 110);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(188, 221, 116, 19);
		panel.add(lblNewLabel_1);
		
		txtContraseña = new JTextField();
		txtContraseña.setBounds(120, 250, 214, 19);
		panel.add(txtContraseña);
		txtContraseña.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Usuario:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(199, 154, 116, 19);
		panel.add(lblNewLabel_1_1);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(120, 181, 214, 19);
		panel.add(txtUsername);
		
		JButton btnCancelar = new JButton("Cancelar ");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal prin = new Principal();
				prin.setVisible(true);
		        setVisible(false);
			}
		});
		btnCancelar.setForeground(new Color(255, 0, 0));
		btnCancelar.setBounds(231, 305, 116, 21);
		panel.add(btnCancelar);
		
		JButton btnIniciarSesion = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIniciarSesion.setBounds(107, 305, 116, 21);
		panel.add(btnIniciarSesion);
		
        setLocationRelativeTo(null);

	}

}
