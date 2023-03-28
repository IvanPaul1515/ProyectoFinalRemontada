package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class MisPropiedades extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUsuario;

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
		
		txtUsuario = new JTextField();
		txtUsuario.setText("Usuario");
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
		
		JButton btnNewButton = new JButton("A\u00F1adir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A�adirPropiedad A�adirP = new A�adirPropiedad();
				A�adirP.setVisible(true);
		        setVisible(false);
			}
		});
		btnNewButton.setBounds(10, 58, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Modificar");
		btnNewButton_1.setBounds(10, 92, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Eliminar");
		btnNewButton_2.setBounds(10, 126, 89, 23);
		panel.add(btnNewButton_2);
	}
}
