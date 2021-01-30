package com.antelope.smartfix119.domain.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * エリア情報用Bean.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
@Entity
public class AreaListEntity implements Serializable {

	/**
	 * バージョン
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 都道府県No
	 */
	@Id
	private String area2No;

	/**
	 * 都道府県名
	 */
	private String area2Name;

	/**
	 * 都道府県名（ローマ字）
	 */
	private String area2Name2;

	/**
	 * 地方No
	 */
	private String area1No;

	/**
	 * 地図
	 */
	private String map;

	/**
	 * {@link AreaListEntity#area2No}
	 */
	public String getArea2No() {
		return area2No;
	}

	/**
	 * {@link AreaListEntity#area2No}
	 */
	public void setArea2No(String area2No) {
		this.area2No = area2No;
	}

	/**
	 * {@link AreaListEntity#area2Name}
	 */
	public String getArea2Name() {
		return area2Name;
	}

	/**
	 * {@link AreaListEntity#area2Name}
	 */
	public void setArea2Name(String area2Name) {
		this.area2Name = area2Name;
	}

	/**
	 * {@link AreaListEntity#area2Name2}
	 */
	public String getArea2Name2() {
		return area2Name2;
	}

	/**
	 * {@link AreaListEntity#area2Name2}
	 */
	public void setArea2Name2(String area2Name2) {
		this.area2Name2 = area2Name2;
	}

	/**
	 * {@link AreaListEntity#area1No}
	 */
	public String getArea1No() {
		return area1No;
	}

	/**
	 * {@link AreaListEntity#area1No}
	 */
	public void setArea1No(String area1No) {
		this.area1No = area1No;
	}

	/**
	 * {@link AreaListEntity#map}
	 */
	public String getMap() {
		return map;
	}

	/**
	 * {@link AreaListEntity#map}
	 */
	public void setMap(String map) {
		this.map = map;
	}

}
