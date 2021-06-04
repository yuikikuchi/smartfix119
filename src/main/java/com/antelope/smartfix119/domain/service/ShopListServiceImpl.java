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

/**
 * 店舗情報検索サービス.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
@Service
@Transactional
public class ShopListServiceImpl implements ShopListService {

	@Inject
	ShopListRepository shopListRepository;

	/**
	 * 店舗数カウント
	 */
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * エリアNoを元に店舗情報を検索
	 * 
	 * @param areaNo   検索条件
	 * @param pageable 検索条件
	 * @return ページ情報の返却
	 */
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

	/**
	 * エリアNoを元に店舗情報を検索
	 * 
	 * @param areaNo 検索条件
	 * @return 検索結果の返却
	 */
	@Override
	public List<ShopListEntity> findByAreaNo(String areaNo) {
		List<ShopListEntity> result = shopListRepository.findByAreaNo(areaNo);
		return result;
	}

	/**
	 * ピックアップ店舗を検索
	 * 
	 * @return 検索結果の返却
	 */
	@Override
	public List<ShopListEntity> findByPickupShop() {
		List<ShopListEntity> result = shopListRepository.findByPickupShop();
		return result;
	}
	
	/**
	 * 店舗検索
	 * 
	 * @return 検索結果の返却
	 */
	@Override
	public ShopListEntity findByShopId(int shopId) {
		ShopListEntity result = shopListRepository.findByShopId(shopId);
		return result;
	}

}
