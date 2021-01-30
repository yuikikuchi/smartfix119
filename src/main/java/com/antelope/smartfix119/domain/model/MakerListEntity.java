package com.antelope.smartfix119.domain.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 機種情報用Bean.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
@Entity
public class MakerListEntity implements Serializable {

	/**
	 * バージョン
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * モデルNo
	 */
	@Id
	private int modelNo;

	/**
	 * メイカー名
	 */
	private String makerName;

	/**
	 * モデル名
	 */
	private String modelName;

	/**
	 * 発売日
	 */
	private String releaseDay;

	/**
	 * キャリア
	 */
	private String carriers;

	/**
	 * 画面情報
	 */
	private String display;

	/**
	 * ストレージ情報
	 */
	private String storage;

	/**
	 * CPU情報
	 */
	private String cpu;

	/**
	 * メモリ情報
	 */
	private String memory;

	/**
	 * バッテリー情報
	 */
	private String battery;

	/**
	 * メインカメラ情報
	 */
	private String mainCamera;

	/**
	 * サブカメラ情報
	 */
	private String subCamera;

	/**
	 * OS情報
	 */
	private String os;

	/**
	 * {@link MakerListEntity#modelNo}
	 */
	public int getModelNo() {
		return modelNo;
	}

	/**
	 * {@link MakerListEntity#modelNo}
	 */
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	/**
	 * {@link MakerListEntity#makerName}
	 */
	public String getMakerName() {
		return makerName;
	}

	/**
	 * {@link MakerListEntity#makerName}
	 */
	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}

	/**
	 * {@link MakerListEntity#modelName}
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * {@link MakerListEntity#modelName}
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	/**
	 * {@link MakerListEntity#releaseDay}
	 */
	public String getReleaseDay() {
		return releaseDay;
	}

	/**
	 * {@link MakerListEntity#releaseDay}
	 */
	public void setReleaseDay(String releaseDay) {
		this.releaseDay = releaseDay;
	}

	/**
	 * {@link MakerListEntity#carriers}
	 */
	public String getCarriers() {
		return carriers;
	}

	/**
	 * {@link MakerListEntity#carriers}
	 */
	public void setCarriers(String carriers) {
		this.carriers = carriers;
	}

	/**
	 * {@link MakerListEntity#display}
	 */
	public String getDisplay() {
		return display;
	}

	/**
	 * {@link MakerListEntity#display}
	 */
	public void setDisplay(String display) {
		this.display = display;
	}

	/**
	 * {@link MakerListEntity#storage}
	 */
	public String getStorage() {
		return storage;
	}

	/**
	 * {@link MakerListEntity#storage}
	 */
	public void setStorage(String storage) {
		this.storage = storage;
	}

	/**
	 * {@link MakerListEntity#cpu}
	 */
	public String getCpu() {
		return cpu;
	}

	/**
	 * {@link MakerListEntity#cpu}
	 */
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	/**
	 * {@link MakerListEntity#memory}
	 */
	public String getMemory() {
		return memory;
	}

	/**
	 * {@link MakerListEntity#memory}
	 */
	public void setMemory(String memory) {
		this.memory = memory;
	}

	/**
	 * {@link MakerListEntity#battery}
	 */
	public String getBattery() {
		return battery;
	}

	/**
	 * {@link MakerListEntity#battery}
	 */
	public void setBattery(String battery) {
		this.battery = battery;
	}

	/**
	 * {@link MakerListEntity#mainCamera}
	 */
	public String getMainCamera() {
		return mainCamera;
	}

	/**
	 * {@link MakerListEntity#mainCamera}
	 */
	public void setMainCamera(String mainCamera) {
		this.mainCamera = mainCamera;
	}

	/**
	 * {@link MakerListEntity#subCamera}
	 */
	public String getSubCamera() {
		return subCamera;
	}

	/**
	 * {@link MakerListEntity#subCamera}
	 */
	public void setSubCamera(String subCamera) {
		this.subCamera = subCamera;
	}

	/**
	 * {@link MakerListEntity#os}
	 */
	public String getOs() {
		return os;
	}

	/**
	 * {@link MakerListEntity#os}
	 */
	public void setOs(String os) {
		this.os = os;
	}

}
