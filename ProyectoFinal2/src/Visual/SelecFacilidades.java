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
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setBounds(100, 100, 472, 395);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		{
			
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Seleccionar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JPanel pnlElementosBasicos = new JPanel();
			pnlElementosBasicos.setBorder(new TitledBorder(null, "Elementos b\u00E1sicos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			pnlElementosBasicos.setBounds(10, 22, 428, 74);
			panel.add(pnlElementosBasicos);
			pnlElementosBasicos.setLayout(null);
			
			JRadioButton rdbtnWifi = new JRadioButton("Wifi");
			rdbtnWifi.setBounds(6, 17, 124, 21);
			pnlElementosBasicos.add(rdbtnWifi);
			
			JRadioButton rdbtnCocina = new JRadioButton("Cocina\r\n");
			rdbtnCocina.setBounds(149, 17, 124, 21);
			pnlElementosBasicos.add(rdbtnCocina);
			
			JRadioButton rdbtnLavadora = new JRadioButton("Lavadora\r\n");
			rdbtnLavadora.setBounds(149, 40, 124, 21);
			pnlElementosBasicos.add(rdbtnLavadora);
			
			JRadioButton rdbtnAireAcondicionado = new JRadioButton("Aire Acondicionado\r\n");
			rdbtnAireAcondicionado.setBounds(279, 40, 143, 21);
			pnlElementosBasicos.add(rdbtnAireAcondicionado);
			
			JRadioButton rdbtnCalefaccin = new JRadioButton("Calefacci\u00F3n\r\n");
			rdbtnCalefaccin.setBounds(279, 17, 143, 21);
			pnlElementosBasicos.add(rdbtnCalefaccin);
			
			JRadioButton rdbtnPiscina_1 = new JRadioButton("Televisi\u00F3n");
			rdbtnPiscina_1.setBounds(6, 40, 103, 21);
			pnlElementosBasicos.add(rdbtnPiscina_1);
			
			JPanel pnlCaracteriticas = new JPanel();
			pnlCaracteriticas.setLayout(null);
			pnlCaracteriticas.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Caracteristicas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			pnlCaracteriticas.setBounds(10, 106, 428, 74);
			panel.add(pnlCaracteriticas);
			
			JRadioButton rdbtnPiscina = new JRadioButton("Piscina");
			rdbtnPiscina.setBounds(6, 17, 124, 21);
			pnlCaracteriticas.add(rdbtnPiscina);
			
			JRadioButton rdbtnJacuzzi = new JRadioButton("Jacazzi\r\n");
			rdbtnJacuzzi.setBounds(6, 40, 124, 21);
			pnlCaracteriticas.add(rdbtnJacuzzi);
			
			JRadioButton rdbtnBarbacoa = new JRadioButton("Barbacoa");
			rdbtnBarbacoa.setBounds(149, 17, 124, 21);
			pnlCaracteriticas.add(rdbtnBarbacoa);
			
			JRadioButton rdbtnParqueo = new JRadioButton("Parqueo");
			rdbtnParqueo.setBounds(149, 40, 124, 21);
			pnlCaracteriticas.add(rdbtnParqueo);
			
			JRadioButton rdbtnGimnasio = new JRadioButton("Gimnasio");
			rdbtnGimnasio.setBounds(279, 17, 143, 21);
			pnlCaracteriticas.add(rdbtnGimnasio);
			
			JRadioButton rdbtnPingpong = new JRadioButton("Pingpong");
			rdbtnPingpong.setBounds(279, 40, 143, 21);
			pnlCaracteriticas.add(rdbtnPingpong);
			
			JPanel pnlSeguridad = new JPanel();
			pnlSeguridad.setLayout(null);
			pnlSeguridad.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Seguridad", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			pnlSeguridad.setBounds(10, 250, 428, 50);
			panel.add(pnlSeguridad);
			
			JRadioButton rdbtnAlarma = new JRadioButton("Alarma");
			rdbtnAlarma.setBounds(6, 17, 124, 21);
			pnlSeguridad.add(rdbtnAlarma);
			
			JRadioButton rdbtnCamaras = new JRadioButton("Camaras \r\n");
			rdbtnCamaras.setBounds(149, 17, 124, 21);
			pnlSeguridad.add(rdbtnCamaras);
			
			JRadioButton rdbtnDetectorDeHumo = new JRadioButton("Detector de humo\r\n");
			rdbtnDetectorDeHumo.setBounds(279, 17, 143, 21);
			pnlSeguridad.add(rdbtnDetectorDeHumo);
			
			JPanel pnlUbiacion = new JPanel();
			pnlUbiacion.setLayout(null);
			pnlUbiacion.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ubicaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			pnlUbiacion.setBounds(10, 190, 428, 50);
			panel.add(pnlUbiacion);
			
			JRadioButton rdbtnFrenteAlMar = new JRadioButton("Frente al Mar");
			rdbtnFrenteAlMar.setBounds(6, 17, 124, 21);
			pnlUbiacion.add(rdbtnFrenteAlMar);
			
			JRadioButton rdbtnMalecn = new JRadioButton("Malec\u00F3n\r\n");
			rdbtnMalecn.setBounds(149, 17, 124, 21);
			pnlUbiacion.add(rdbtnMalecn);
			
			JRadioButton rdbtnPenthouse = new JRadioButton("Penthouse");
			rdbtnPenthouse.setBounds(279, 17, 143, 21);
			pnlUbiacion.add(rdbtnPenthouse);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnGuardar = new JButton("Guardar");
				btnGuardar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						AñadirPropiedad AñadirPropie = new AñadirPropiedad();
						AñadirPropie.setVisible(true);
				        setVisible(false);
					}
				});
				btnGuardar.setActionCommand("OK");
				buttonPane.add(btnGuardar);
				getRootPane().setDefaultButton(btnGuardar);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						AñadirPropiedad AñadirPropie = new AñadirPropiedad();
						AñadirPropie.setVisible(true);
				        setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}