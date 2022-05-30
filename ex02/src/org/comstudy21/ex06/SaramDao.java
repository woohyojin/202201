package org.comstudy21.ex06;

import static org.comstudy21.ex06.R.dao;
import static org.comstudy21.ex06.R.txtFld2;

import java.util.Vector;

public class SaramDao {
	// 일관성을 위해서 ~_~

	public static Vector<SaramDTO> saramList = new Vector<SaramDTO>();
	static {
		saramList.add(new SaramDTO(1, "kim", "kim@aa.com", "010-1111-1111"));
		saramList.add(new SaramDTO(2, "lee", "lee@aa.com", "010-2222-2222"));
		saramList.add(new SaramDTO(3, "park", "park@aa.com", "010-3333-3333"));
	}
	public static int sequence = 4;

	public Vector selectAll() {
		Vector vector = new Vector();
		for (int i = 0; i < saramList.size(); i++) {
			vector.add(saramList.get(i).toVector());
		}
		return vector;
	}

	public void insert(SaramDTO saramDTO) {
		if (saramDTO != null) {
			saramDTO.setIdx(sequence++);
			saramList.add(saramDTO);
		}
	}

	public Vector search(SaramDTO saramDTO) {
		Vector vector = new Vector();
		for (int i = 0; i < saramList.size(); i++) {
			if (saramDTO.getName().equals(saramList.get(i).getName())) {
				vector = (saramList.get(i).toVector());
				return vector;
			}
		}
		return null;
	}
	
	
	private SaramDTO searchData(String name) {
		for(SaramDTO vector: saramList) {
			if(vector.getName().equals(name))
				return vector;
		}
		return null;
	}

	public boolean delete(String name) {
		SaramDTO dto = searchData(name);
		if(dto==null) {
			return false;
		} else {
			saramList.remove(dto);
			return true;
		}
		
		
		
//		Vector vector = new Vector();
//		for (int i = 0; i < saramList.size(); i++) {
//			if (saramDTO.getName().equals(saramList.get(i).getName())) {
//				saramList.remove(i);
//				vector = (saramList.get(i).toVector());
//				return vector;
//			}
//		}
//		return null;
		
		
	}


	

}
