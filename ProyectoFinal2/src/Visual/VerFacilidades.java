package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Toolkit;

public class VerFacilidades extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JButton btnVolver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VerFacilidades dialog = new VerFacilidades();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VerFacilidades() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VerFacilidades.class.getResource("/Image/homepage_home_house_icon_153873.png")));
		setTitle("Facilidades\r\n");
		setBounds(100, 100, 326, 350);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(UIManager.getBorder("DesktopIcon.border"));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JScrollPane scrollPane = new JScrollPane();
				panel.add(scrollPane, BorderLayout.CENTER);
				{
					table = new JTable();
					scrollPane.setViewportView(table);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnVolver = new JButton("Volver\r\n");
				btnVolver.setActionCommand("Cancel");
				buttonPane.add(btnVolver);
			}
		}
		setLocationRelativeTo(null);
	}

}
