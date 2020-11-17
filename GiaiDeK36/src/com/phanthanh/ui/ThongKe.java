package com.phanthanh.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.phanthanh.entity.Xe;

@SuppressWarnings("serial")
public class ThongKe extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private List<Xe> lstDS;
	private DefaultTableModel model;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongKe frame = new ThongKe();
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
	
	public ThongKe() {
		this.setTitle("THỐNG KÊ CHI TIẾT VÀO/RA BÃI ĐỖ XE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		model = new DefaultTableModel();
		Vector<String> column = new Vector<String>();
		column.add("Loại xe");
		column.add("Biển số xe");
		column.add("Số vé xe");
		column.add("Thời gian vào bãi");
		column.add("Thời gian ra bãi");
		column.add("Tiền thuê bãi");
		model.setColumnIdentifiers(column);
		
		table = new JTable(model);
		scrollPane.setViewportView(table);
		table.getTableHeader().setBackground(Color.cyan);
		table.setBackground(Color.WHITE);
	}

	public List<Xe> getLstDS() {
		return lstDS;
	}

	public void setLstDS(List<Xe> lstDS) {
		this.lstDS = lstDS;
		
		try {
			for(Xe x : lstDS) {
				Vector<String> row = new Vector<String>();
				row.add(x.getLoaiXe());
				row.add(x.getBienSoXe());
				row.add(x.getSoVeXe());
				row.add(x.getThoiGianVaoBai().toString());
				row.add(x.getThoiGianRaBai().toString());
				
				int dongia = 0;
				if(x.getLoaiXe().equals("0")) dongia = 1000;
				else if (x.getLoaiXe().equals("2")) dongia = 3000;
				else if (x.getLoaiXe().equals("4")) dongia = 5000;
				String thanhtien = "";
				if(x.getLoaiXe().equals("0") || x.getLoaiXe().equals("2")) {
					int thoigian = (int) (x.getThoiGianRaBai().getTime() - x.getThoiGianVaoBai().getTime());
					if(thoigian%(1000*60*60*24) != 0)
						thoigian = thoigian/(1000*60*60*24) + 1;
					else 
						thoigian = thoigian/(1000*60*60*24);
					thanhtien = String.format("%d", thoigian * dongia);
				} else {
					if(x.getTinhTrangRaBai().trim() != null && !x.getTinhTrangRaBai().trim().equals("Binh thuong"))
						thanhtien = "Chua xac dinh - dang xu ly boi thuong";
					else {
						int thoigian = (int) (x.getThoiGianRaBai().getTime() - x.getThoiGianVaoBai().getTime());
						if(thoigian%(1000*60*30) != 0)
							thoigian = thoigian/(1000*60*30) + 1;
						else 
							thoigian = thoigian/(1000*60*30);
						thanhtien = String.format("%d", thoigian * dongia);
					}
				}
				
				row.add(thanhtien);
				System.out.println(x.getLoaiXe() + ";" + x.getBienSoXe() + ";" + x.getSoVeXe() + ";" + x.getThoiGianVaoBai() + ";" + x.getThoiGianRaBai() + ";" + thanhtien);
				model.addRow(row);
			}
			table.setModel(model);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
