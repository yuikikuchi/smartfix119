package com.antelope.smartfix119.domain.service;

import java.util.List;

import com.antelope.smartfix119.domain.model.ShopListEntity;

public interface ShopListService {
	
	List<ShopListEntity> findByAreaNo(String areaNo);

}
