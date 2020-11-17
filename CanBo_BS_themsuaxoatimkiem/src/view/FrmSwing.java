package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bean.NhanVien;
import bean.SinhVien;
import bean.nguoibean;
import bo.truongbo;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmSwing extends JFrame {
	JList list = new JList();
	JComboBox<SinhVien> comboBox = new JComboBox<SinhVien>();
	private JPanel contentPane;
	private final JButton btnLayList = new JButton("Lay List");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmSwing frame = new FrmSwing();
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
	public FrmSwing() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				truongbo tr= new truongbo();
				//Tao ra mo hinh cho Jcombobox
				DefaultComboBoxModel<SinhVien> mhc= new DefaultComboBoxModel<SinhVien>();
				try {
					for(nguoibean n: tr.getds()) {
						if(n instanceof SinhVien) {
							SinhVien sv= (SinhVien)n;
							System.out.println(sv.toString());
							mhc.addElement(sv);//them 1 sv vao mo hinh
						}
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//Dua o hinh vao combobox
				comboBox.setModel(mhc);
				
				DefaultListModel<NhanVien> mhl=new DefaultListModel<NhanVien>();
				try {
					for(nguoibean n: tr.getds()) {
						if(n instanceof NhanVien) {
							NhanVien sv= (NhanVien)n;
							System.out.println(sv.toString());
							mhl.addElement(sv);//them 1 nv vao mo hinh
						}
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//Dua o hinh vao list
				list.setModel(mhl);
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		comboBox.setBounds(101, 35, 207, 22);
		contentPane.add(comboBox);
		
		
		list.setBounds(107, 84, 201, 157);
		contentPane.add(list);
		
		JButton btnLayMa = new JButton("Lay Ma");
		btnLayMa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//lay gia tri tu jcombobox
				SinhVien sv=(SinhVien)comboBox.getSelectedItem();
				System.out.println(sv.getMasv());
				System.out.println(sv.getTenlop());
	
			}
		});
		btnLayMa.setBounds(320, 34, 97, 25);
		contentPane.add(btnLayMa);
		btnLayList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NhanVien nv=(NhanVien)list.getSelectedValue();
				System.out.println(nv.getManv());
				System.out.println(nv.getTendonvi());
			}
		});
		btnLayList.setBounds(320, 92, 97, 25);
		
		contentPane.add(btnLayList);
	}
}
