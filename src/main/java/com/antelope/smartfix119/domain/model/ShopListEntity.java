package com.antelope.smartfix119.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShopListEntity {
	
	@Id
	private int shopId;
	
	private String shopName;
	
	private String location1;
	
	private String location2;
	
	private String phoneNo1;
	
	private String phoneNo2;
	
	private String businessHour1;
	
	private String businessHour2;
	
	private String holidays;
	
	private String shopSite;
	
	private String area1Id;
	
	private String area2Id;
	
	private String map;
	
	private String introduction;
	
	private String pickup;

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getLocation1() {
		return location1;
	}

	public void setLocation1(String location1) {
		this.location1 = location1;
	}

	public String getLocation2() {
		return location2;
	}

	public void setLocation2(String location2) {
		this.location2 = location2;
	}

	public String getPhoneNo1() {
		return phoneNo1;
	}

	public void setPhoneNo1(String phoneNo1) {
		this.phoneNo1 = phoneNo1;
	}

	public String getPhoneNo2() {
		return phoneNo2;
	}

	public void setPhoneNo2(String phoneNo2) {
		this.phoneNo2 = phoneNo2;
	}

	public String getBusinessHour1() {
		return businessHour1;
	}

	public void setBusinessHour1(String businessHour1) {
		this.businessHour1 = businessHour1;
	}

	public String getBusinessHour2() {
		return businessHour2;
	}

	public void setBusinessHour2(String businessHour2) {
		this.businessHour2 = businessHour2;
	}

	public String getHolidays() {
		return holidays;
	}

	public void setHolidays(String holidays) {
		this.holidays = holidays;
	}

	public String getShopSite() {
		return shopSite;
	}

	public void setShopSite(String shopSite) {
		this.shopSite = shopSite;
	}

	public String getArea1Id() {
		return area1Id;
	}

	public void setArea1Id(String area1Id) {
		this.area1Id = area1Id;
	}

	public String getArea2Id() {
		return area2Id;
	}

	public void setArea2Id(String area2Id) {
		this.area2Id = area2Id;
	}

	public String getMap() {
		return map;
	}

	public void setMap(String map) {
		this.map = map;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getPickup() {
		return pickup;
	}

	public void setPickup(String pickup) {
		this.pickup = pickup;
	}

}
