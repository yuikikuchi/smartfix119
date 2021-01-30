package com.antelope.smartfix119.domain.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.antelope.smartfix119.domain.model.NewsListEntity;
import com.antelope.smartfix119.domain.repository.NewsListRepository;

/**
 * ニュース検索サービス.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
@Service
@Transactional
public class NewsListServiceImple implements NewsListService {

	@Inject
	NewsListRepository newsListRepository;

	/**
	 * ニュースの検索
	 * 
	 * @return 検索結果の返却
	 */
	@Override
	public List<NewsListEntity> findAll() {
		List<NewsListEntity> result = newsListRepository.findAll();
		return result;
	}
}
