package Visual;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;

import Logico.Conexion;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class Principal extends JFrame {

    private JPanel contentPane;
    private JTextField txtBuscar;
    private JComboBox cmbFiltro;
    public JButton btnIniciarSesion;
    public JButton btnRegistrarse;
    private JButton btnMisPropiedades;
    

    /**
     * Launch the application.
     */
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Principal frame = new Principal();
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
    public Principal() {
    	setTitle("YouJevaRent");
    	
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				try {
					java.sql.Statement sqlStatement = Conexion.getConexion().createStatement();
					String consulta = "EXEC sp_eliminar_CurrentUser;";
					sqlStatement.executeQuery(consulta);
				} catch (SQLException ex) {
					if(ex.getErrorCode() == 0) {
						JOptionPane.showMessageDialog(null, "Secion cerrada");
					}else {
					JOptionPane.showMessageDialog(null, ex.toString());
					}
				}
			}
		});

    	
    	setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/Image/homepage_home_house_icon_153873.png")));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        panel_1.setBounds(10, 286, 1374, 434);
        panel.add(panel_1);
        
        txtBuscar = new JTextField();
        txtBuscar.setText("Buscar Ciudad...");
        txtBuscar.setBounds(450, 32, 504, 29);
        panel.add(txtBuscar);
        txtBuscar.setColumns(10);
        
       btnMisPropiedades = new JButton("Mis Propiedades");

        btnMisPropiedades.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		MisPropiedades MisPropie = new MisPropiedades();
        		MisPropie.setVisible(true);
		        //setVisible(false);
        	}
        });
        btnMisPropiedades.setBounds(0, 0, 151, 23);
        panel.add(btnMisPropiedades);
        mostrarbtn(obtenerUsuarioActual());
        cmbFiltro = new JComboBox();
        cmbFiltro.setModel(new DefaultComboBoxModel(new String[] {"Filtrar...", "Recientes", "Disponibles", "Precio", "Mas Rentadas", "Casa", "Habitaci\u00F3n", "Apartamento "}));
        cmbFiltro.setToolTipText("");
        cmbFiltro.setBounds(10, 253, 120, 22);
        panel.add(cmbFiltro);
        
        JButton btnNewButton = new JButton("");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton.setIcon(new ImageIcon(Principal.class.getResource("/Image/search_look_for_seek_magnifying_glass_lens_icon_141967 (1).png")));
        btnNewButton.setBounds(952, 32, 41, 29);
        panel.add(btnNewButton);
        
        btnIniciarSesion = new JButton("Iniciar Sesion");
        btnIniciarSesion.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		InicioSesion ini = new InicioSesion();
				ini.setVisible(true);
		        setVisible(false);
        	}
        });
        btnIniciarSesion.setBounds(1274, 1, 120, 21);
        panel.add(btnIniciarSesion);
        
       // Component btnRegistrarse;
		btnRegistrarse = new JButton("Registrarse ");
        btnRegistrarse.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Registrarse reg = new Registrarse();
				reg.setVisible(true);
		        //setVisible(false);

        	}
        });
        btnRegistrarse.setBounds(1155, 1, 120, 21);
        panel.add(btnRegistrarse);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/Image/house_rent_home_building_icon_231026 (2).png")));
        lblNewLabel.setBounds(574, 72, 256, 206);
        panel.add(lblNewLabel);

        // Agrega el código para establecer el tamaño y la posición de la ventana
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height - 300;
        int width = screenSize.width - 500;
        setSize(width, height);
        setLocationRelativeTo(null);

        setVisible(true);
    }
    private void mostrarbtn(String Id) {
    	
    	try {
	        Connection con = Conexion.getConexion();
	        Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery("EXEC sp_obtener_tipo_usuarioVendedor '"+ Id +"';");
	        if (rs.next()) {
	             if( rs.getString("TipoUsuario").equals("1")) {
	            	 System.out.println("Funciona ID " + Id);
	            	 btnMisPropiedades.setVisible(true);
	             }else {
	            	 btnMisPropiedades.setVisible(false);
	             }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
    	
    }
	public String obtenerUsuarioActual() {
	    String usuarioActual = "No encontrado";
	    try {
	        Connection con = Conexion.getConexion();
	        Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery("SELECT ID_User FROM CurrentUser");
	        if (rs.next()) {
	            usuarioActual = rs.getString("ID_User");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return usuarioActual;
	}
    
}

