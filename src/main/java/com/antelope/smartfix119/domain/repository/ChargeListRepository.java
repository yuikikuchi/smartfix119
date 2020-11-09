package com.antelope.smartfix119.domain.repository;

import java.util.List;

import com.antelope.smartfix119.domain.model.ChargeListEntity;

public interface ChargeListRepository {
	
	/**
	 * エリア名を元にエリア情報を検索処理
	 * 
	 * @param area 検索条件
	 */
	List<ChargeListEntity> findByShopId(String shopId);

}
