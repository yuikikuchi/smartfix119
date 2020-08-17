package com.antelope.smartfix119.domain.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.antelope.smartfix119.domain.model.ShopListEntity;
import com.antelope.smartfix119.domain.repository.ShopListRepository;

@Service
@Transactional
public class ShopListServiceImpl implements ShopListService {
	
	@Inject
	ShopListRepository shopListRepository;
	
	@Override
	public List<ShopListEntity> findByAreaNo(String areaNo) {
		List<ShopListEntity> result = shopListRepository.findByAreaNo(areaNo);
		return result;
	}

}
