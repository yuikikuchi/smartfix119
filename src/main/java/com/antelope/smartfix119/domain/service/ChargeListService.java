package com.antelope.smartfix119.domain.service;

import java.util.List;

import com.antelope.smartfix119.domain.model.ChargeListEntity;

public interface ChargeListService {
	
	/**
	 * エリアの検索
	 * 
	 * @param area(エリア名)
	 */
	List<ChargeListEntity> searchCharge(String shopId);

}
