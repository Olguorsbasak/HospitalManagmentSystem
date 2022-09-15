import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;

public class LoginGUI extends JFrame {

	private JPanel w_pane;
	private JTextField fld_patientTc;
	private JTextField fld_patientPass;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
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
	public LoginGUI() {
		setResizable(false);
		setTitle("Hospital Managment System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400); // design üzerinden ayarlanabilir ama burada daha kolay
		w_pane = new JPanel();
		w_pane.setBackground(Color.WHITE);
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		JLabel lbl_logo = new JLabel(new ImageIcon(getClass().getResource(("medicine.png"))));
		lbl_logo.setBounds(206, 11, 100, 55);
		w_pane.add(lbl_logo);
		
		JLabel lblNewLabel = new JLabel(" Welcome Hospital Managment System ");
		lblNewLabel.setBounds(63, 63, 394, 33);
		lblNewLabel.setFont(new Font("Menlo", Font.BOLD, 18));
		w_pane.add(lblNewLabel);
		
		JTabbedPane w_tabpane = new JTabbedPane(JTabbedPane.TOP);
		w_tabpane.setBackground(new Color(66, 66, 66));
		w_tabpane.setFont(new Font("Menlo", Font.PLAIN, 13));
		w_tabpane.setBounds(10, 128, 464, 222);
		w_pane.add(w_tabpane);
		
		JPanel p_patientHome = new JPanel();
		w_tabpane.addTab("Patient Home Page", null, p_patientHome, null);
		p_patientHome.setBackground(UIManager.getColor("CheckBox.background"));
		p_patientHome.setLayout(null);
		
		JLabel lblTcId = new JLabel(" TC ID:");
		lblTcId.setFont(new Font("Menlo", Font.BOLD, 18));
		lblTcId.setBounds(18, 21, 409, 33);
		p_patientHome.add(lblTcId);
		
		JLabel lblPassword = new JLabel(" Password: ");
		lblPassword.setFont(new Font("Menlo", Font.BOLD, 18));
		lblPassword.setBounds(18, 66, 409, 33);
		p_patientHome.add(lblPassword);
		
		fld_patientTc = new JTextField();
		fld_patientTc.setFont(new Font("Menlo", Font.PLAIN, 13));
		fld_patientTc.setBounds(176, 25, 251, 26);
		p_patientHome.add(fld_patientTc);
		fld_patientTc.setColumns(10);
		
		fld_patientPass = new JTextField();
		fld_patientPass.setFont(new Font("Menlo", Font.PLAIN, 13));
		fld_patientPass.setColumns(10);
		fld_patientPass.setBounds(176, 70, 251, 26);
		p_patientHome.add(fld_patientPass);
		
		JButton btn_patientLogin = new JButton("Login");
		btn_patientLogin.setBackground(UIManager.getColor("Button.disabledText"));
		btn_patientLogin.setFont(new Font("Menlo", Font.PLAIN, 13));
		btn_patientLogin.setBounds(28, 111, 195, 47);
		p_patientHome.add(btn_patientLogin);
		
		JButton btn_patientSignUp = new JButton("Sign Up");
		btn_patientSignUp.setFont(new Font("Menlo", Font.PLAIN, 13));
		btn_patientSignUp.setBackground(Color.GRAY);
		btn_patientSignUp.setBounds(232, 111, 195, 47);
		p_patientHome.add(btn_patientSignUp);
		
		JPanel p_doctorHome = new JPanel();
		p_doctorHome.setBackground(UIManager.getColor("CheckBox.background"));
		w_tabpane.addTab("Doctor Home Page", null, p_doctorHome, null);
		p_doctorHome.setLayout(null);
		
		JLabel lblTcId_1 = new JLabel(" TC ID:");
		lblTcId_1.setFont(new Font("Menlo", Font.BOLD, 18));
		lblTcId_1.setBounds(28, 17, 409, 33);
		p_doctorHome.add(lblTcId_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Menlo", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBounds(165, 21, 251, 26);
		p_doctorHome.add(textField);
		
		JLabel lblPassword_1 = new JLabel(" Password: ");
		lblPassword_1.setFont(new Font("Menlo", Font.BOLD, 18));
		lblPassword_1.setBounds(28, 62, 409, 33);
		p_doctorHome.add(lblPassword_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Menlo", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(165, 62, 251, 26);
		p_doctorHome.add(textField_1);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setFont(new Font("Menlo", Font.PLAIN, 13));
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setBounds(28, 107, 388, 47);
		p_doctorHome.add(btnNewButton_1);
		
		ConnectionDB.connect();
	}
}
