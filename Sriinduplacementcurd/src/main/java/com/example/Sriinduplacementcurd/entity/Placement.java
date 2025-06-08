package com.example.Sriinduplacementcurd.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table
@Entity

public class Placement {
	@Id
	public Long pid;
	public String pname;
	public LocalDate pdate;
	public String pqualification;
	public int pyear;
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public LocalDate getPdate() {
		return pdate;
	}
	public void setPdate(LocalDate pdate) {
		this.pdate = pdate;
	}
	public String getPqualification() {
		return pqualification;
	}
	public void setPqualification(String pqualification) {
		this.pqualification = pqualification;
	}
	public int getPyear() {
		return pyear;
	}
	public void setPyear(int pyear) {
		this.pyear =pyear;
	}

}
