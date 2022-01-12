package org.comstudy21.ex06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.ObjectInput;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

import org.comstudy21.guiex.myframe.MyJFrame;
import static org.comstudy21.ex06.R.*;

public class TestJTable extends MyJFrame {
	private DefaultTableModel tbModel;

	public TestJTable() {
		super("JTable 연습", 640, 480);

	}

	private void mkTableData() {
		columNames = new Vector();
		columNames.add("IDX");
		columNames.add("NAME");
		columNames.add("EMAIL");
		columNames.add("PHONE");

		data = dao.selectAll();
	}

	protected void displayLayer() {
		mkTableData();
		contentPan = getContentPane();

		contentPan.add(BorderLayout.WEST, new LeftPane());
		contentPan.add(BorderLayout.SOUTH, new BottomPane());

		tbModel = new DefaultTableModel(data, columNames);
		table = new JTable(tbModel);
		scrollPane = new JScrollPane(table);
		contentPan.add(scrollPane);
	}

	protected void addRowDataTest() {
		tbModel.setDataVector(null, columNames);
		tbModel.addRow(new Object[] { 4, "aaa", "aaa@naver.com", "010-4444-4444" });
		tbModel.addRow(new Object[] { 5, "bbb", "bbb@naver.com", "010-5555-5555" });

	}

	protected void actionEvent() {
		// 테이블 이벤트 핸들러 추가
		table.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
				JTable tbl = (JTable) e.getSource();
				// 테이블의 전체 행과 열 알아내기
				int totalCol = tbl.getColumnCount();
				int totalRow = tbl.getRowCount();
				// 선택한 컬럼의 행과 열 알아내기
				int row = table.getSelectedRow();
				int col = table.getSelectedColumn();
				// 데이터 찾아오기
				int idx = (int) tbModel.getValueAt(row, 0);
				String name = (String) tbModel.getValueAt(row, 1);
				String email = (String) tbModel.getValueAt(row, 2);
				String phone = (String) tbModel.getValueAt(row, 3);
				// 찾아 온 데이터 적용하기
				txtFld1.setText("" + idx);
				txtFld2.setText("" + name);
				txtFld3.setText("" + email);
				txtFld4.setText("" + phone);
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseClicked(MouseEvent e) {
			}
		});

		allBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tbModel.setDataVector(null, columNames);
				Vector<Vector> saramList = dao.selectAll();
				for (Vector vector : saramList) {
					tbModel.addRow(vector);
				}

			}
		});
		inputBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// textField의 데이터를 읽어온다.
				String name = txtFld2.getText();
				txtFld2.setText("");
				String email = txtFld3.getText();
				txtFld3.setText("");
				String phone = txtFld4.getText();
				txtFld4.setText("");
				// TableModel에 반영해주기
				// dao에 저장 후 list를 다시 그려준다.
				dao.insert(new SaramDTO(0, name, email, phone));
				// list를 다시 그려 준다.
				displayList();

			}

			private void displayList() {
				tbModel.setDataVector(null, columNames);
				Vector<Vector> saramList = dao.selectAll();
				for (Vector vector : saramList) {
					tbModel.addRow(vector);
				}

			}

		});
		searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtFld2.getText();
				Vector vector = dao.search(new SaramDTO(0, name, "", ""));
				tbModel.setDataVector(null, columNames);
				tbModel.addRow(vector);

				// System.out.println(">>> searchBtn 클릭!");

			}
		});
		modifyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(">>> modifyBtn 클릭!");

			}
		});
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtFld2.getText();
				boolean b = dao.delete(name);
				if(b==true) {
					JOptionPane.showMessageDialog(TestJTable.this, "데이터 삭제");
				} else {
					JOptionPane.showMessageDialog(TestJTable.this, "데이터 삭제 실패");
				}
				// System.out.println(">>> deleteBtn 클릭!");

			}
		});
		finishBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(TestJTable.this, "굿바이");
				dispose();
				System.exit(0);

			}
		});
	}

	public static void main(String[] args) {
		new TestJTable().setVisible(true);
	}

}
