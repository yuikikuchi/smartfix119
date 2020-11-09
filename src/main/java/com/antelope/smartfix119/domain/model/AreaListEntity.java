package com.antelope.smartfix119.domain.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class AreaListEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private String area2No;
	
	private String area2Name;
	
	private String area2Name2;
	
	private String area1No;
	
	private String map;

	public String getArea2No() {
		return area2No;
	}

	public void setArea2No(String area2No) {
		this.area2No = area2No;
	}

	public String getArea2Name() {
		return area2Name;
	}

	public void setArea2Name(String area2Name) {
		this.area2Name = area2Name;
	}

	public String getArea2Name2() {
		return area2Name2;
	}

	public void setArea2Name2(String area2Name2) {
		this.area2Name2 = area2Name2;
	}

	public String getArea1No() {
		return area1No;
	}

	public void setArea1No(String area1No) {
		this.area1No = area1No;
	}

	public String getMap() {
		return map;
	}

	public void setMap(String map) {
		this.map = map;
	}

}
