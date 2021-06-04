package com.antelope.smartfix119.domain.repository;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.antelope.smartfix119.domain.model.ShopListEntity;

/**
 * 店舗情報リポジトリ.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
public interface ShopListRepository {

	/**
	 * エリアNoを元に店舗数カウント
	 * 
	 * @param areaNo 検索条件
	 */
	long countByCriteria(String areaNo);

	/**
	 * エリアNoを元に店舗情報を検索
	 * 
	 * @param areaNo    検索条件
	 * @param rowBounds 検索条件
	 */
	List<ShopListEntity> findPageByCriteria(String areaNo, RowBounds rowBounds);

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
	
	/**
	 * 店舗検索
	 */
	ShopListEntity findByShopId(int shopId);

}
