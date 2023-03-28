package Visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;

public class AñadirPropiedad extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdPropiedad;
	private JTextField txtIdPropietario;
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JTextField txtCalle;
	private JTextField txtCasa;
	private JTextField txtCuidad;
	private JLabel lblFacilidades;
	private JButton btnSeleccionarFa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AñadirPropiedad frame = new AñadirPropiedad();
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
	public AñadirPropiedad() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AñadirPropiedad.class.getResource("/Image/homepage_home_house_icon_153873.png")));
		setTitle("A\u00F1adir Propiedad:");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 534, 135);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Informaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPNombre = new JLabel("Id Propiedad:");
		lblPNombre.setBounds(10, 36, 76, 13);
		panel.add(lblPNombre);
		
		JLabel lblVendedor = new JLabel("Propietario:");
		lblVendedor.setBounds(270, 36, 66, 13);
		panel.add(lblVendedor);
		
		JLabel lblTipo = new JLabel("Tipo:\r\n");
		lblTipo.setBounds(11, 88, 76, 13);
		panel.add(lblTipo);
		
		txtIdPropiedad = new JTextField();
		txtIdPropiedad.setEditable(false);
		txtIdPropiedad.setBounds(96, 33, 158, 19);
		panel.add(txtIdPropiedad);
		txtIdPropiedad.setColumns(10);
		
		txtIdPropietario = new JTextField();
		txtIdPropietario.setEditable(false);
		txtIdPropietario.setColumns(10);
		txtIdPropietario.setBounds(350, 32, 158, 19);
		panel.add(txtIdPropietario);
	
		lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(167, 88, 76, 13);
		panel.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(212, 85, 105, 19);
		panel.add(txtPrecio);
		
		JComboBox cmbTipo = new JComboBox();
		cmbTipo.setModel(new DefaultComboBoxModel(new String[] {"Selecionar"}));
		cmbTipo.setBounds(46, 83, 105, 22);
		panel.add(cmbTipo);
		
		lblFacilidades = new JLabel("Facilidades:");
		lblFacilidades.setBounds(327, 88, 76, 13);
		panel.add(lblFacilidades);
		
		btnSeleccionarFa = new JButton("Seleccionar");
		btnSeleccionarFa.setBounds(403, 83, 105, 23);
		panel.add(btnSeleccionarFa);
		btnSeleccionarFa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		JButton btnAgregar = new JButton("Registrar");
		btnAgregar.setBounds(345, 286, 97, 21);
		contentPane.add(btnAgregar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MisPropiedades MisPropie = new MisPropiedades();
				MisPropie.setVisible(true);
		        setVisible(false);
			}
		});
		btnCancelar.setForeground(new Color(255, 0, 0));
		btnCancelar.setBounds(452, 286, 85, 21);
		contentPane.add(btnCancelar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dirreci\u00F3n:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 157, 534, 129);
		contentPane.add(panel_1);
		
		JLabel lblPCalle = new JLabel("Calle:");
		lblPCalle.setBounds(10, 36, 50, 13);
		panel_1.add(lblPCalle);
		
		JLabel lblCasa = new JLabel("Casa:");
		lblCasa.setBounds(275, 36, 50, 13);
		panel_1.add(lblCasa);
		
		JLabel lblCuidad = new JLabel("Cuidad:\r\n");
		lblCuidad.setBounds(10, 88, 50, 13);
		panel_1.add(lblCuidad);
		
		txtCalle = new JTextField();
		txtCalle.setColumns(10);
		txtCalle.setBounds(85, 32, 158, 19);
		panel_1.add(txtCalle);
		
		txtCasa = new JTextField();
		txtCasa.setColumns(10);
		txtCasa.setBounds(350, 32, 158, 19);
		panel_1.add(txtCasa);
		
		txtCuidad = new JTextField();
		txtCuidad.setColumns(10);
		txtCuidad.setBounds(85, 84, 158, 19);
		panel_1.add(txtCuidad);
		
        setLocationRelativeTo(null);

	}
}
