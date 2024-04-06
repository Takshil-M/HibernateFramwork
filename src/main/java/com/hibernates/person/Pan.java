package com.hibernates.person;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pan {
	
	@Id
	private int id;
	private String pan_no;
	private String father_name;
	
	
	@Override
	public String toString() {
		return "Pan [id=" + id + ", pan_no=" + pan_no + ", father_name=" + father_name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPan_no() {
		return pan_no;
	}
	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	

}
