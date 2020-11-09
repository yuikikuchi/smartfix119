package com.antelope.smartfix119.domain.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.antelope.smartfix119.domain.model.ShopListEntity;

public interface ShopListService {
	
	List<ShopListEntity> findByAreaNo(String areaNo);
	
	public long count();

	Page<ShopListEntity> searchShopLists(String areaNo, Pageable pageable);
	
	List<ShopListEntity> findByPickupShop();

}
