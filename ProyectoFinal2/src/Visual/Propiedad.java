package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.JTable;

public class Propiedad extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPropiedad;
	private JTextField txtPropietario;
	private JTextField txtEstado;
	private JTextField txtPrecio;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Propiedad dialog = new Propiedad();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Propiedad() {
		setBounds(100, 100, 787, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		contentPanel.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panel_1.setBounds(10, 42, 741, 108);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtPropiedad = new JTextField();
		txtPropiedad.setEditable(false);
		txtPropiedad.setEnabled(false);
		txtPropiedad.setBounds(10, 11, 190, 20);
		panel_1.add(txtPropiedad);
		txtPropiedad.setColumns(10);
		
		txtPropietario = new JTextField();
		txtPropietario.setEnabled(false);
		txtPropietario.setEditable(false);
		txtPropietario.setBounds(593, 11, 138, 20);
		panel_1.add(txtPropietario);
		txtPropietario.setColumns(10);
		
		JLabel lblPropietario = new JLabel("Propietario:");
		lblPropietario.setBounds(521, 14, 73, 14);
		panel_1.add(lblPropietario);
		
		txtEstado = new JTextField();
		txtEstado.setEnabled(false);
		txtEstado.setEditable(false);
		txtEstado.setBounds(645, 42, 86, 20);
		panel_1.add(txtEstado);
		txtEstado.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(593, 45, 52, 14);
		panel_1.add(lblEstado);
		
		JLabel lblPrecioPorNoche = new JLabel("Precio por noche:");
		lblPrecioPorNoche.setBounds(10, 45, 101, 14);
		panel_1.add(lblPrecioPorNoche);
		
		txtPrecio = new JTextField();
		txtPrecio.setEnabled(false);
		txtPrecio.setEditable(false);
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(114, 42, 86, 20);
		panel_1.add(txtPrecio);
		
		JButton btnVerFacilidades = new JButton("Ver Facilidades\r\n");
		btnVerFacilidades.setBounds(593, 73, 138, 23);
		panel_1.add(btnVerFacilidades);
		
		JButton btnVolver = new JButton("Volver\r\n");
		btnVolver.setBounds(22, 8, 89, 23);
		panel.add(btnVolver);
		
		JButton btnReservar = new JButton("Reservar");
		btnReservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReservar.setBounds(20, 161, 89, 23);
		panel.add(btnReservar);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panel_1_1.setBounds(10, 216, 741, 224);
		panel.add(panel_1_1);
		panel_1_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_1_1.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblComentario = new JLabel("Comentarios");
		lblComentario.setBounds(10, 191, 79, 14);
		panel.add(lblComentario);
		{
			setLocationRelativeTo(null);
		}
	}
}
