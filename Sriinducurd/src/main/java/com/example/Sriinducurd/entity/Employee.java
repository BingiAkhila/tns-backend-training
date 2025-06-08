package com.example.Sriinducurd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table
@Entity
public class Employee {
	@Id
	public int eid;
	public String ename;
	public float esal;
	public String edept;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public String getEdept() {
		return edept;
	}
	public void setEdept(String edept) {
		this.edept = edept;
	}

}
