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
	private String location01;

	/**
	 * 住所２
	 */
	private String location02;

	/**
	 * 電話番号１
	 */
	private String phoneNo01;

	/**
	 * 電話番号２
	 */
	private String phoneNo02;

	/**
	 * 営業時間１
	 */
	private String businessHour01;

	/**
	 * 営業時間２
	 */
	private String businessHour02;

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
	private String area01Id;

	/**
	 * エリア２ID
	 */
	private String area02Id;

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
	 * 総務省登録修理業者フラグ
	 */
	private String officialFlg;

	/**
	 * Appleフラグ
	 */
	private String appleFlg;

	/**
	 * Androidフラグ
	 */
	private String androidFlg;

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
	 * {@link ShopListEntity#location01}
	 */
	public String getLocation01() {
		return location01;
	}

	/**
	 * {@link ShopListEntity#location01}
	 */
	public void setLocation01(String location01) {
		this.location01 = location01;
	}

	/**
	 * {@link ShopListEntity#location02}
	 */
	public String getLocation02() {
		return location02;
	}

	/**
	 * {@link ShopListEntity#location02}
	 */
	public void setLocation02(String location02) {
		this.location02 = location02;
	}

	/**
	 * {@link ShopListEntity#phoneNo01}
	 */
	public String getPhoneNo01() {
		return phoneNo01;
	}

	/**
	 * {@link ShopListEntity#phoneNo01}
	 */
	public void setPhoneNo01(String phoneNo01) {
		this.phoneNo01 = phoneNo01;
	}

	/**
	 * {@link ShopListEntity#phoneNo02}
	 */
	public String getPhoneNo02() {
		return phoneNo02;
	}

	/**
	 * {@link ShopListEntity#phoneNo02}
	 */
	public void setPhoneNo02(String phoneNo02) {
		this.phoneNo02 = phoneNo02;
	}

	/**
	 * {@link ShopListEntity#businessHour01}
	 */
	public String getBusinessHour01() {
		return businessHour01;
	}

	/**
	 * {@link ShopListEntity#businessHour01}
	 */
	public void setBusinessHour01(String businessHour01) {
		this.businessHour01 = businessHour01;
	}

	/**
	 * {@link ShopListEntity#businessHour02}
	 */
	public String getBusinessHour02() {
		return businessHour02;
	}

	/**
	 * {@link ShopListEntity#businessHour02}
	 */
	public void setBusinessHour02(String businessHour02) {
		this.businessHour02 = businessHour02;
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
	 * {@link ShopListEntity#area01Id}
	 */
	public String getArea01Id() {
		return area01Id;
	}

	/**
	 * {@link ShopListEntity#area01Id}
	 */
	public void setArea01Id(String area01Id) {
		this.area01Id = area01Id;
	}

	/**
	 * {@link ShopListEntity#area02Id}
	 */
	public String getArea02Id() {
		return area02Id;
	}

	/**
	 * {@link ShopListEntity#area02Id}
	 */
	public void setArea02Id(String area02Id) {
		this.area02Id = area02Id;
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

	/**
	 * {@link ShopListEntity#officialFlg}
	 */
	public String getOfficialFlg() {
		return officialFlg;
	}

	/**
	 * {@link ShopListEntity#officialFlg}
	 */
	public void setOfficialFlg(String officialFlg) {
		this.officialFlg = officialFlg;
	}

	/**
	 * {@link ShopListEntity#appleFlg}
	 */
	public String getAppleFlg() {
		return appleFlg;
	}

	/**
	 * {@link ShopListEntity#appleFlg}
	 */
	public void setAppleFlg(String appleFlg) {
		this.appleFlg = appleFlg;
	}

	/**
	 * {@link ShopListEntity#androidFlg}
	 */
	public String getAndroidFlg() {
		return androidFlg;
	}

	/**
	 * {@link ShopListEntity#androidFlg}
	 */
	public void setAndroidFlg(String androidFlg) {
		this.androidFlg = androidFlg;
	}

}
