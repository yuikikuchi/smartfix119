package com.antelope.smartfix119.domain.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.antelope.smartfix119.domain.model.MakerListEntity;
import com.antelope.smartfix119.domain.repository.MakerListRepository;

/**
 * 端末情報検索サービス.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
@Service
@Transactional
public class MakerListServiceImple implements MakerListService {

	@Inject
	MakerListRepository makerListRepository;

	/**
	 * 端末情報の検索
	 * 
	 * @return 検索結果の返却
	 */
	@Override
	public List<MakerListEntity> searchMaker() {
		List<MakerListEntity> result = makerListRepository.findAll();
		return result;
	}

	/**
	 * 端末情報の検索
	 * 
	 * @param modelName 検索条件（モデル名）
	 * @return 検索結果の返却
	 */
	@Override
	public List<MakerListEntity> searchMaker(String modelName) {
		List<MakerListEntity> result = makerListRepository.findByModelName(modelName);
		return result;
	}

}
