package Visual;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class Principal extends JFrame {

    private JPanel contentPane;
    private JTextField txtBuscar;
    private JButton btnMisPropiedades;
    private JComboBox cmbFiltro;
    

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
        panel_1.setBounds(10, 286, 1724, 584);
        panel.add(panel_1);
        
        txtBuscar = new JTextField();
        txtBuscar.setText("Buscar Ciudad...");
        txtBuscar.setBounds(629, 32, 504, 29);
        panel.add(txtBuscar);
        txtBuscar.setColumns(10);
        
        btnMisPropiedades = new JButton("Mis Propiedades");
        btnMisPropiedades.setVisible(false);

        btnMisPropiedades.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	
        	}
        });
        btnMisPropiedades.setBounds(0, 0, 130, 23);
        panel.add(btnMisPropiedades);
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
        btnNewButton.setBounds(1133, 32, 41, 29);
        panel.add(btnNewButton);
        
        JButton btnIniciarSesion = new JButton("Iniciar Sesion");
        btnIniciarSesion.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		InicioSesion ini = new InicioSesion();
				ini.setVisible(true);
		        setVisible(false);
        	}
        });
        btnIniciarSesion.setBounds(1624, 1, 120, 21);
        panel.add(btnIniciarSesion);
        
        JButton btnRegistrarse = new JButton("Registrarse ");
        btnRegistrarse.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Registrarse reg = new Registrarse();
				/*reg.setModal(true);*/
				reg.setVisible(true);
		        setVisible(false);

        	}
        });
        btnRegistrarse.setBounds(1515, 1, 110, 21);
        panel.add(btnRegistrarse);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/Image/house_rent_home_building_icon_231026 (2).png")));
        lblNewLabel.setBounds(748, 72, 256, 206);
        panel.add(lblNewLabel);

        // Agrega el código para establecer el tamaño y la posición de la ventana
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height - 150;
        int width = screenSize.width - 150;
        setSize(width, height);
        setLocationRelativeTo(null);

        setVisible(true);
    }
}
