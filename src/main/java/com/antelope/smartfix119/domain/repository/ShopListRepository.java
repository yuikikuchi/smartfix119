package com.antelope.smartfix119.domain.repository;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.antelope.smartfix119.domain.model.ShopListEntity;

public interface ShopListRepository {
	
	long countByCriteria(String areaNo);
	
	List<ShopListEntity> findPageByCriteria(String areaNo, RowBounds rowBounds);
	
	List<ShopListEntity> findByAreaNo(String areaNo);
	
	List<ShopListEntity> findByPickupShop();

}
