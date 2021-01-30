package com.antelope.smartfix119.domain.model;

import javax.persistence.Entity;

/**
 * 料金表Bean.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
@Entity
public class ChargeListEntity {

	/**
	 * No
	 */
	private String no;

	/**
	 * 店舗ID
	 */
	private String shopId;

	/**
	 * メイカー
	 */
	private String maker;

	/**
	 * 機種
	 */
	private String model;

	/**
	 * ガラス割れ
	 */
	private String glass;

	/**
	 * 液晶
	 */
	private String lcd;

	/**
	 * バッテリー交換
	 */
	private String battery;

	/**
	 * 電源ボタン不良
	 */
	private String power;

	/**
	 * 充電コネクタ不良
	 */
	private String connector;

	/**
	 * 水没修理
	 */
	private String submerge;

	/**
	 * {@link ChargeListEntity#no}
	 */
	public String getNo() {
		return no;
	}

	/**
	 * {@link ChargeListEntity#no}
	 */
	public void setNo(String no) {
		this.no = no;
	}

	/**
	 * {@link ChargeListEntity#shopId}
	 */
	public String getShopId() {
		return shopId;
	}

	/**
	 * {@link ChargeListEntity#shopId}
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	/**
	 * {@link ChargeListEntity#maker}
	 */
	public String getMaker() {
		return maker;
	}

	/**
	 * {@link ChargeListEntity#maker}
	 */
	public void setMaker(String maker) {
		this.maker = maker;
	}

	/**
	 * {@link ChargeListEntity#model}
	 */
	public String getModel() {
		return model;
	}

	/**
	 * {@link ChargeListEntity#model}
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * {@link ChargeListEntity#glass}
	 */
	public String getGlass() {
		return glass;
	}

	/**
	 * {@link ChargeListEntity#glass}
	 */
	public void setGlass(String glass) {
		this.glass = glass;
	}

	/**
	 * {@link ChargeListEntity#lcd}
	 */
	public String getLcd() {
		return lcd;
	}

	/**
	 * {@link ChargeListEntity#lcd}
	 */
	public void setLcd(String lcd) {
		this.lcd = lcd;
	}

	/**
	 * {@link ChargeListEntity#battery}
	 */
	public String getBattery() {
		return battery;
	}

	/**
	 * {@link ChargeListEntity#battery}
	 */
	public void setBattery(String battery) {
		this.battery = battery;
	}

	/**
	 * {@link ChargeListEntity#power}
	 */
	public String getPower() {
		return power;
	}

	/**
	 * {@link ChargeListEntity#power}
	 */
	public void setPower(String power) {
		this.power = power;
	}

	/**
	 * {@link ChargeListEntity#connector}
	 */
	public String getConnector() {
		return connector;
	}

	/**
	 * {@link ChargeListEntity#connector}
	 */
	public void setConnector(String connector) {
		this.connector = connector;
	}

	/**
	 * {@link ChargeListEntity#submerge}
	 */
	public String getSubmerge() {
		return submerge;
	}

	/**
	 * {@link ChargeListEntity#submerge}
	 */
	public void setSubmerge(String submerge) {
		this.submerge = submerge;
	}

}
