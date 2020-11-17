package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import bean.SinhVien;
import bean.nguoibean;
import bo.truongbo;

import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmSinhVien extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField masvtxt;
	private JTextField hotentxt;
	private JTextField tenloptxt;
	
	private JTextField tuoitxt;
	truongbo tb= new truongbo();
	void napbang(ArrayList<nguoibean> ds) {
		//tao ra mo hinh bang
		DefaultTableModel mh= new DefaultTableModel();
		//tao ra 4 cot masv, hoten,tuoi, tenlop
		mh.addColumn("masv");
		mh.addColumn("hoten");
		mh.addColumn("tuoi");
		mh.addColumn("tenlop");
		//nap mang ds vao mo hinh

		for(nguoibean i :ds) {
			if(i instanceof SinhVien) {
				SinhVien sv1= (SinhVien)i;
				Object[] t = new Object[4]; // tao mang 4 phan tu
				t[0]=sv1.getMasv();
				t[1]=sv1.getHoten();
				t[2]=sv1.getTuoi();
				t[3]=sv1.getTenlop();
				//them 1 hang
				mh.addRow(t);
			}

		}
		//Dua mo hinh vao bang
		table.setModel(mh);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmSinhVien frame = new FrmSinhVien();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public FrmSinhVien() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				try {
					napbang(tb.getds());
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 476);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(31, 13, 540, 159);
		contentPane.add(tabbedPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
		});
		tabbedPane.addTab("New tab", null, scrollPane, null);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();

				String txtmasv = (String) model.getValueAt(table.getSelectedRow(),0);  
				String txthoten = (String) model.getValueAt(table.getSelectedRow(),1);
				int txttuoi =(int) model.getValueAt(table.getSelectedRow(),2);
				String txttenlop = (String) model.getValueAt(table.getSelectedRow(),3);
				masvtxt.setText(txtmasv);
				hotentxt.setText(txthoten);
				tuoitxt.setText(String.valueOf(txttuoi));
				tenloptxt.setText(txttenlop);
			}
		});
		scrollPane.setViewportView(table); //LUU Y
		
		masvtxt = new JTextField();
		masvtxt.setBounds(168, 210, 197, 22);
		contentPane.add(masvtxt);
		masvtxt.setColumns(10);
		
		hotentxt = new JTextField();
		hotentxt.setBounds(168, 262, 197, 22);
		contentPane.add(hotentxt);
		hotentxt.setColumns(10);
		
		tenloptxt = new JTextField();
		tenloptxt.setBounds(168, 315, 197, 22);
		contentPane.add(tenloptxt);
		tenloptxt.setColumns(10);
		
		tuoitxt = new JTextField();
		tuoitxt.setBounds(168, 374, 197, 22);
		contentPane.add(tuoitxt);
		tuoitxt.setColumns(10);
		
		Object[] row=new Object[4];
		DefaultTableModel mh= new DefaultTableModel();
		
		JButton btnThem = new JButton("Them");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Lay cac tham so tu textfield
				String masv=masvtxt.getText();
				String hoten=hotentxt.getText();
				String tenlop=tenloptxt.getText();
				int tuoi=Integer.parseInt(tuoitxt.getText());
					try {
						tb.Them(masv,hoten,tenlop,tuoi);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				napbang(tb.getdsvaotruongbo());
			}
			
		});
		btnThem.setBounds(451, 209, 97, 25);
		contentPane.add(btnThem);
		
		JButton btnXoa = new JButton("Xoa");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tb.Xoa(masvtxt.getText())) {
					JOptionPane.showMessageDialog(null, "Xoa thanh cong");
					napbang(tb.getdsvaotruongbo());
				} else {
					JOptionPane.showMessageDialog(null, "Khong xoa duoc");
				}
			}
		});
		btnXoa.setBounds(451, 261, 97, 25);
		contentPane.add(btnXoa);
		
		JButton btnSua = new JButton("Sua");
		btnSua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tb.Sua(masvtxt.getText(), hotentxt.getText(), tenloptxt.getText(), Integer.parseInt(tuoitxt.getText()));
				napbang(tb.getdsvaotruongbo());
			}
		});
		btnSua.setBounds(451, 314, 97, 25);
		contentPane.add(btnSua);
		
		JButton btnTimKiem = new JButton("Tim Kiem");
		btnTimKiem.setBounds(451, 373, 97, 25);
		contentPane.add(btnTimKiem);
		
		JLabel lblMaSv = new JLabel("Ma SV");
		lblMaSv.setBounds(79, 213, 97, 19);
		contentPane.add(lblMaSv);
		
		JLabel lblHoTen = new JLabel("Ho Ten");
		lblHoTen.setBounds(75, 265, 56, 16);
		contentPane.add(lblHoTen);
		
		JLabel lblTenLop = new JLabel("Ten Lop");
		lblTenLop.setBounds(75, 318, 56, 16);
		contentPane.add(lblTenLop);
		
		JLabel lblTuoi = new JLabel("Tuoi");
		lblTuoi.setBounds(75, 377, 56, 16);
		contentPane.add(lblTuoi);
	}
}
