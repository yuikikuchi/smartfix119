package com.antelope.smartfix119.domain.service;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
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

	@Transactional(readOnly = true)
	@Override
	public Page<ShopListEntity> searchShopLists(String areaNo, Pageable pageable) {
		
		long total = shopListRepository.countByCriteria(areaNo);
		List<ShopListEntity> shopLists;
		
		if (0 < total) {
			RowBounds rowBounds = new RowBounds((int) pageable.getOffset(), pageable.getPageSize());
			shopLists = shopListRepository.findPageByCriteria(areaNo, rowBounds);
		} else {
			shopLists = Collections.emptyList();
		}
		
		return new PageImpl<>(shopLists, pageable, total);
	}
	
	
	@Override
	public List<ShopListEntity> findByPickupShop() {
		List<ShopListEntity> result = shopListRepository.findByPickupShop();
		return result;
	}


@Override
public long count() {
	// TODO Auto-generated method stub
	return 0;
}

}
