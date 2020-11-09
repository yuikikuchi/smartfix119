package com.antelope.smartfix119.domain.model;

public class ChargeListEntity {
	
	/** No */
	private String no;

	/** 店舗ID */
	private String shopId;

	/** メイカー */
	private String maker;
	
	/** 機種 */
	private String model;
	
	/** ガラス割れ */
	private String glass;
	
	/** 液晶不良 */
	private String lcd;
	
	/** バッテリー交換 */
	private String battery;
	
	/** 電源ボタン不良 */
	private String power;
	
	/** 充電コネクタ不良 */
	private String connector;
	
	/** 水没修理 */
	private String submerge;

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getGlass() {
		return glass;
	}

	public void setGlass(String glass) {
		this.glass = glass;
	}

	public String getLcd() {
		return lcd;
	}

	public void setLcd(String lcd) {
		this.lcd = lcd;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getConnector() {
		return connector;
	}

	public void setConnector(String connector) {
		this.connector = connector;
	}

	public String getSubmerge() {
		return submerge;
	}

	public void setSubmerge(String submerge) {
		this.submerge = submerge;
	}

}
