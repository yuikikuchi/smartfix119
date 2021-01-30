package com.antelope.smartfix119.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 店舗一覧用Bean.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
@Entity
public class ShopListEntity {

	/**
	 * 店舗ID
	 */
	@Id
	private int shopId;

	/**
	 * 店舗名
	 */
	private String shopName;

	/**
	 * 住所１
	 */
	private String location1;

	/**
	 * 住所２
	 */
	private String location2;

	/**
	 * 電話番号１
	 */
	private String phoneNo1;

	/**
	 * 電話番号２
	 */
	private String phoneNo2;

	/**
	 * 営業時間１
	 */
	private String businessHour1;

	/**
	 * 営業時間２
	 */
	private String businessHour2;

	/**
	 * 定休日
	 */
	private String holidays;

	/**
	 * サイト
	 */
	private String shopSite;

	/**
	 * エリア１ID
	 */
	private String area1Id;

	/**
	 * エリア２ID
	 */
	private String area2Id;

	/**
	 * マップ
	 */
	private String map;

	/**
	 * 店舗詳細
	 */
	private String introduction;

	/**
	 * ピックアップ店舗フラグ
	 */
	private String pickup;

	/**
	 * {@link ShopListEntity#shopId}
	 */
	public int getShopId() {
		return shopId;
	}

	/**
	 * {@link ShopListEntity#shopId}
	 */
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	/**
	 * {@link ShopListEntity#shopName}
	 */
	public String getShopName() {
		return shopName;
	}

	/**
	 * {@link ShopListEntity#shopName}
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	/**
	 * {@link ShopListEntity#location1}
	 */
	public String getLocation1() {
		return location1;
	}

	/**
	 * {@link ShopListEntity#location1}
	 */
	public void setLocation1(String location1) {
		this.location1 = location1;
	}

	/**
	 * {@link ShopListEntity#location2}
	 */
	public String getLocation2() {
		return location2;
	}

	/**
	 * {@link ShopListEntity#location2}
	 */
	public void setLocation2(String location2) {
		this.location2 = location2;
	}

	/**
	 * {@link ShopListEntity#phoneNo1}
	 */
	public String getPhoneNo1() {
		return phoneNo1;
	}

	/**
	 * {@link ShopListEntity#phoneNo1}
	 */
	public void setPhoneNo1(String phoneNo1) {
		this.phoneNo1 = phoneNo1;
	}

	/**
	 * {@link ShopListEntity#phoneNo2}
	 */
	public String getPhoneNo2() {
		return phoneNo2;
	}

	/**
	 * {@link ShopListEntity#phoneNo2}
	 */
	public void setPhoneNo2(String phoneNo2) {
		this.phoneNo2 = phoneNo2;
	}

	/**
	 * {@link ShopListEntity#businessHour1}
	 */
	public String getBusinessHour1() {
		return businessHour1;
	}

	/**
	 * {@link ShopListEntity#businessHour1}
	 */
	public void setBusinessHour1(String businessHour1) {
		this.businessHour1 = businessHour1;
	}

	/**
	 * {@link ShopListEntity#businessHour2}
	 */
	public String getBusinessHour2() {
		return businessHour2;
	}

	/**
	 * {@link ShopListEntity#businessHour2}
	 */
	public void setBusinessHour2(String businessHour2) {
		this.businessHour2 = businessHour2;
	}

	/**
	 * {@link ShopListEntity#holidays}
	 */
	public String getHolidays() {
		return holidays;
	}

	/**
	 * {@link ShopListEntity#holidays}
	 */
	public void setHolidays(String holidays) {
		this.holidays = holidays;
	}

	/**
	 * {@link ShopListEntity#shopSite}
	 */
	public String getShopSite() {
		return shopSite;
	}

	/**
	 * {@link ShopListEntity#shopSite}
	 */
	public void setShopSite(String shopSite) {
		this.shopSite = shopSite;
	}

	/**
	 * {@link ShopListEntity#area1Id}
	 */
	public String getArea1Id() {
		return area1Id;
	}

	/**
	 * {@link ShopListEntity#area1Id}
	 */
	public void setArea1Id(String area1Id) {
		this.area1Id = area1Id;
	}

	/**
	 * {@link ShopListEntity#area2Id}
	 */
	public String getArea2Id() {
		return area2Id;
	}

	/**
	 * {@link ShopListEntity#area2Id}
	 */
	public void setArea2Id(String area2Id) {
		this.area2Id = area2Id;
	}

	/**
	 * {@link ShopListEntity#map}
	 */
	public String getMap() {
		return map;
	}

	/**
	 * {@link ShopListEntity#map}
	 */
	public void setMap(String map) {
		this.map = map;
	}

	/**
	 * {@link ShopListEntity#introduction}
	 */
	public String getIntroduction() {
		return introduction;
	}

	/**
	 * {@link ShopListEntity#introduction}
	 */
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	/**
	 * {@link ShopListEntity#pickup}
	 */
	public String getPickup() {
		return pickup;
	}

	/**
	 * {@link ShopListEntity#pickup}
	 */
	public void setPickup(String pickup) {
		this.pickup = pickup;
	}

}
