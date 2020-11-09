package com.antelope.smartfix119.domain.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.antelope.smartfix119.domain.model.ChargeListEntity;
import com.antelope.smartfix119.domain.repository.ChargeListRepository;

@Service
@Transactional
public class ChargeListServiceImple implements ChargeListService {
	
	@Inject
	ChargeListRepository chargeListRepository;
	
	/**
	 * エリア情報の検索
	 * 
	 * @param area(エリア)
	 */
	@Override
	public List<ChargeListEntity> searchCharge(String shopId) {
		List<ChargeListEntity> result = chargeListRepository.findByShopId(shopId);
		return result;
	}

}