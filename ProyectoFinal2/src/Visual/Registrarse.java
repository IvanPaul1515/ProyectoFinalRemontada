package Visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registrarse extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomb1;
	private JTextField txtApe1;
	private JTextField txtNomb2;
	private JTextField txtApe2;
	private JLabel lblCorreoElectronico;
	private JTextField txtCorreo;
	private JLabel lblTelfono;
	private JTextField txtTelefono;
	private JLabel lblCdula;
	private JTextField txtCedula;
	private JLabel lblUsuario;
	private JTextField txtUsername;
	private JLabel lblContrasea;
	private JTextField txtContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrarse frame = new Registrarse();
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
	public Registrarse() {
		setTitle("Registrarse");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 626, 280);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos Personales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPNombre = new JLabel("Primer Nombre:");
		lblPNombre.setBounds(10, 36, 123, 13);
		panel.add(lblPNombre);
		
		JLabel lblSegundoNombre = new JLabel("Segundo Nombre:");
		lblSegundoNombre.setBounds(325, 36, 123, 13);
		panel.add(lblSegundoNombre);
		
		JLabel lblPrimerApellido = new JLabel("Primer Apellido:");
		lblPrimerApellido.setBounds(10, 92, 123, 13);
		panel.add(lblPrimerApellido);
		
		JLabel lblSegundoApellido = new JLabel("Segundo Apellido:");
		lblSegundoApellido.setBounds(325, 92, 123, 13);
		panel.add(lblSegundoApellido);
		
		txtNomb1 = new JTextField();
		txtNomb1.setBounds(136, 33, 165, 19);
		panel.add(txtNomb1);
		txtNomb1.setColumns(10);
		
		txtApe1 = new JTextField();
		txtApe1.setColumns(10);
		txtApe1.setBounds(136, 89, 165, 19);
		panel.add(txtApe1);
		
		txtNomb2 = new JTextField();
		txtNomb2.setColumns(10);
		txtNomb2.setBounds(439, 33, 165, 19);
		panel.add(txtNomb2);
		
		txtApe2 = new JTextField();
		txtApe2.setColumns(10);
		txtApe2.setBounds(439, 89, 165, 19);
		panel.add(txtApe2);
		
		lblCorreoElectronico = new JLabel("Correo ElectrÃ³nico:");
		lblCorreoElectronico.setBounds(10, 143, 123, 13);
		panel.add(lblCorreoElectronico);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(136, 140, 468, 19);
		panel.add(txtCorreo);
		
		lblTelfono = new JLabel("TelÃ©fono:");
		lblTelfono.setBounds(50, 190, 123, 13);
		panel.add(lblTelfono);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(136, 187, 165, 19);
		panel.add(txtTelefono);
		
		lblCdula = new JLabel("CÃ©dula:");
		lblCdula.setBounds(366, 190, 123, 13);
		panel.add(lblCdula);
		
		txtCedula = new JTextField();
		txtCedula.setColumns(10);
		txtCedula.setBounds(439, 187, 165, 19);
		panel.add(txtCedula);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(50, 238, 123, 13);
		panel.add(lblUsuario);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(136, 235, 165, 19);
		panel.add(txtUsername);
		
		lblContrasea = new JLabel("ContraseÃ±a:");
		lblContrasea.setBounds(346, 238, 123, 13);
		panel.add(lblContrasea);
		
		txtContraseña = new JTextField();
		txtContraseña.setColumns(10);
		txtContraseña.setBounds(439, 235, 165, 19);
		panel.add(txtContraseña);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Tipo de usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 300, 626, 76);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnCliente = new JRadioButton("Cliente");
		
		JRadioButton rdbtnPropietario = new JRadioButton("Propietario ");
		rdbtnPropietario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnCliente.setSelected(false);
				rdbtnPropietario.setSelected(true);
			}
		});
		rdbtnPropietario.setBounds(306, 29, 103, 21);
		panel_1.add(rdbtnPropietario);
		
		rdbtnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnCliente.setSelected(true);
				rdbtnPropietario.setSelected(false);
			}
		});
		rdbtnCliente.setBounds(181, 29, 103, 21);
		panel_1.add(rdbtnCliente);
		
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(441, 412, 97, 21);
		contentPane.add(btnRegistrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal prin = new Principal();
				/*reg.setModal(true);*/
				prin.setVisible(true);
		        setVisible(false);
			}
		});
		btnCancelar.setForeground(new Color(255, 0, 0));
		btnCancelar.setBounds(548, 412, 85, 21);
		contentPane.add(btnCancelar);
		
        setLocationRelativeTo(null);

	}

}
