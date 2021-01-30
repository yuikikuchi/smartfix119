package com.antelope.smartfix119.domain.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.antelope.smartfix119.domain.model.ShopListEntity;

/**
 * 店舗情報検索サービス.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
public interface ShopListService {

	/**
	 * 店舗数カウント
	 */
	public long count();

	/**
	 * エリアNoを元に店舗情報を検索
	 * 
	 * @param areaNo   検索条件
	 * @param pageable 検索条件
	 */
	Page<ShopListEntity> searchShopLists(String areaNo, Pageable pageable);

	/**
	 * エリアNoを元に店舗情報を検索
	 * 
	 * @param areaNo 検索条件
	 */
	List<ShopListEntity> findByAreaNo(String areaNo);

	/**
	 * ピックアップ店舗を検索
	 */
	List<ShopListEntity> findByPickupShop();

}
