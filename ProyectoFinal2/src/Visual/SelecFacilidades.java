package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;

public class SelecFacilidades extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SelecFacilidades dialog = new SelecFacilidades();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SelecFacilidades() {
		setTitle("Seleccionar Facilidades");
		setIconImage(Toolkit.getDefaultToolkit().getImage(SelecFacilidades.class.getResource("/Image/homepage_home_house_icon_153873.png")));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Seleccionar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JRadioButton rdbtnPiscina = new JRadioButton("Piscina");
			rdbtnPiscina.setBounds(6, 33, 103, 21);
			panel.add(rdbtnPiscina);
			
			JRadioButton rdbtnJacuzzi = new JRadioButton("Jacazzi\r\n");
			rdbtnJacuzzi.setBounds(6, 56, 103, 21);
			panel.add(rdbtnJacuzzi);
			
			JRadioButton rdbtnPingpong = new JRadioButton("Pingpong");
			rdbtnPingpong.setBounds(6, 79, 103, 21);
			panel.add(rdbtnPingpong);
			
			JRadioButton rdbtnWifi = new JRadioButton("Wifi");
			rdbtnWifi.setBounds(111, 33, 103, 21);
			panel.add(rdbtnWifi);
			
			JRadioButton rdbtnParqueo = new JRadioButton("Parqueo");
			rdbtnParqueo.setBounds(111, 56, 103, 21);
			panel.add(rdbtnParqueo);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnAceptar = new JButton("Aceptar");
				btnAceptar.setActionCommand("OK");
				buttonPane.add(btnAceptar);
				getRootPane().setDefaultButton(btnAceptar);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
