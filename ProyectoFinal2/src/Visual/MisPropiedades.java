package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Logico.Conexion;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MisPropiedades extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public JTextField txtUsuario;
	private JTable tblMisPropiedades;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MisPropiedades dialog = new MisPropiedades();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MisPropiedades() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MisPropiedades.class.getResource("/Image/homepage_home_house_icon_153873.png")));
		setTitle("Mis Propiedades");
		setBounds(100, 100, 836, 499);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		contentPanel.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Listado de Propiedades", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(0, 172, 810, 278);
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		tblMisPropiedades = new JTable();
		scrollPane.setViewportView(tblMisPropiedades);
		
		txtUsuario = new JTextField();
		txtUsuario.setEditable(false);
		//NUEVO MODIFIQUE AQUI 
		txtUsuario.setText(obtenerUsuarioActual());
		txtUsuario.setBounds(686, 11, 114, 20);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JButton btnInicio = new JButton("Inicio\r\n");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal prin = new Principal();
				prin.setVisible(true);
		        setVisible(false);
			}
		});
		btnInicio.setBounds(10, 24, 89, 23);
		panel.add(btnInicio);
		
		JButton btnAñadir = new JButton("A\u00F1adir");
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AñadirPropiedad AñadirP = new AñadirPropiedad();
				AñadirP.setVisible(true);
		        setVisible(false);
			}
		});
		btnAñadir.setBounds(10, 58, 89, 23);
		panel.add(btnAñadir);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setBounds(10, 92, 89, 23);
		panel.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(10, 126, 89, 23);
		panel.add(btnEliminar);
	}
	
	//NUEVO MODIFIQUE AQUI 
	public String obtenerUsuarioActual() {
	    String usuarioActual = "No encontrado";
	    try {
	        Connection con = Conexion.getConexion();
	        Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery("SELECT user_nick FROM CurrentUser");
	        if (rs.next()) {
	            usuarioActual = rs.getString("user_nick");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return usuarioActual;
	}
}


