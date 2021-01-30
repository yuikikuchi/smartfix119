package com.antelope.smartfix119.domain.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.antelope.smartfix119.domain.model.ChargeListEntity;
import com.antelope.smartfix119.domain.repository.ChargeListRepository;

/**
 * 料金情報検索サービス.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
@Service
@Transactional
public class ChargeListServiceImple implements ChargeListService {

	@Inject
	ChargeListRepository chargeListRepository;

	/**
	 * 料金情報の検索
	 * 
	 * @param shopId 検索条件（店舗ID）
	 * @return 検索結果の返却
	 */
	@Override
	public List<ChargeListEntity> searchCharge(String shopId) {
		List<ChargeListEntity> result = chargeListRepository.findByShopId(shopId);
		return result;
	}

}