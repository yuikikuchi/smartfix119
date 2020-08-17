package com.antelope.smartfix119.domain.repository;

import java.util.List;

import com.antelope.smartfix119.domain.model.ShopListEntity;

public interface ShopListRepository {
	
	List<ShopListEntity> findByAreaNo(String areaNo);

}
