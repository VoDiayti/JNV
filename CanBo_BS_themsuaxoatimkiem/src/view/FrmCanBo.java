package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bean.canbobean;
import bo.canbobo;

import java.awt.Panel;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.util.ArrayList;
import java.awt.Button;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmCanBo extends JFrame {

	private JPanel contentPane;
	List list = new List();
	canbobo cb = new canbobo();
	ArrayList<canbobean> ds;
	@SuppressWarnings("deprecation")
	void Hienthi(ArrayList<canbobean> dscb) {
		list.clear();
		for(canbobean c: dscb) {
			list.add(c.getMacb());
			list.add(c.getht());
			list.add(c.getHsl().toString());
			list.add("----------");
		}
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCanBo frame = new FrmCanBo();
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
	public FrmCanBo() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				try {
					ds = cb.getcb();
					for(canbobean c: ds) {//Hien thi can bo ra list
						list.add(c.getMacb());
						list.add(c.getht());
						list.add(c.getHsl().toString());
						list.add("----------");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}	
			}
		});
		setTitle("CAN BO");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Ma Can Bo");
		label.setBounds(10, 10, 70, 24);
		contentPane.add(label);
		
		Label label_1 = new Label("Ho Ten");
		label_1.setBounds(10, 40, 70, 24);
		contentPane.add(label_1);
		
		Label label_2 = new Label("He So Luong");
		label_2.setBounds(10, 70, 70, 24);
		contentPane.add(label_2);
		
		
		list.setBounds(10, 100, 125, 144);
		contentPane.add(list);
		
		TextField txtMacb = new TextField();
		txtMacb.setBounds(155, 10, 106, 24);
		contentPane.add(txtMacb);
		
		TextField txtHoten = new TextField();
		txtHoten.setBounds(155, 40, 106, 24);
		contentPane.add(txtHoten);
		
		TextField txtHsl = new TextField();
		txtHsl.setBounds(155, 70, 106, 24);
		contentPane.add(txtHsl);
		
		Button them = new Button("Them");
		them.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(txtMacb.getText().equals("") || txtHoten.getText().equals("")||txtHsl.getText().equals(""))
						JOptionPane.showMessageDialog(null,"Khong de trong!");
					else {
						boolean x= cb.Them(txtMacb.getText(), txtHoten.getText(),Double.parseDouble(txtHsl.getText()));
						if(x==true)
							JOptionPane.showMessageDialog(null,"Them thanh cong!");
						else
							JOptionPane.showMessageDialog(null,"Ma bi trung, vui long nhap ma khac!");
						Hienthi(ds);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		them.setBounds(149, 108, 79, 24);
		contentPane.add(them);
		
		Button sua = new Button("Sua");
		sua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String macb = JOptionPane.showInputDialog("Nhap ma can bo");
					String hsl = JOptionPane.showInputDialog("He so luong moi");
					boolean i=cb.Sua(macb,hsl);
					if(i==true)
						JOptionPane.showMessageDialog(null, "Sua thanh cong");
					else
						JOptionPane.showMessageDialog(null, "Khong thanh cong");
					Hienthi(ds);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		sua.setBounds(259, 108, 79, 24);
		contentPane.add(sua);
		
		Button xoa = new Button("Xoa");
		xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String st = JOptionPane.showInputDialog("Nhap ma can bo");
					int s = JOptionPane.showConfirmDialog(null, "Chac chan xoa hay khong?");
					if(s==0)
					{	boolean i = cb.Xoa(st);
						if(i == true)
							JOptionPane.showMessageDialog(null, "Xoa thanh cong");
						else
							JOptionPane.showMessageDialog(null,"Xoa that bai");
					}
					Hienthi(ds);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		xoa.setBounds(149, 158, 79, 24);
		contentPane.add(xoa);
		
		Button timkiem = new Button("Tim Kiem");
		timkiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String name = JOptionPane.showInputDialog(null,"Nhap ten can tim");
					list.clear();
					for(canbobean c:ds) {
						String s = c.getht().toLowerCase().trim();
						if(s.contains(name.toLowerCase().trim()))
						{	list.add(c.getMacb());
							list.add(c.getht());
							list.add(c.getHsl().toString());
							list.add("----------------");
						}
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		timkiem.setBounds(259, 158, 79, 24);
		contentPane.add(timkiem);
		
		Button hienthi = new Button("Hien Thi");
		hienthi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hienthi(ds);
			}
		});
		hienthi.setBounds(149, 205, 79, 24);
		contentPane.add(hienthi);
		
		Button luu = new Button("Luu");
		luu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cb.Save(ds);
					JOptionPane.showMessageDialog(null, "Save thanh cong!");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		luu.setBounds(259, 205, 79, 24);
		contentPane.add(luu);
	}
}
