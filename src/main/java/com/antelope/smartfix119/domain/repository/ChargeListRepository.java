package com.antelope.smartfix119.domain.repository;

import java.util.List;

import com.antelope.smartfix119.domain.model.ChargeListEntity;

/**
 * 料金情報リポジトリ.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
public interface ChargeListRepository {

	/**
	 * 店舗IDを元に店舗情報を検索
	 * 
	 * @param shopId 検索条件
	 */
	List<ChargeListEntity> findByShopId(String shopId);

}
