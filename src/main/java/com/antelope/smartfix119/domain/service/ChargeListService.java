package com.antelope.smartfix119.domain.service;

import java.util.List;

import com.antelope.smartfix119.domain.model.ChargeListEntity;

/**
 * 料金情報検索サービス.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
public interface ChargeListService {

	/**
	 * 料金情報の検索
	 * 
	 * @param shopId 検索条件（店舗ID）
	 */
	List<ChargeListEntity> searchCharge(String shopId);

}
