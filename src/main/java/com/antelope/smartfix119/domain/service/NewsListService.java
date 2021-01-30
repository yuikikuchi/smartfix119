package com.antelope.smartfix119.domain.service;

import java.util.List;

import com.antelope.smartfix119.domain.model.NewsListEntity;

/**
 * ニュース検索サービス.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
public interface NewsListService {

	/**
	 * ニュースの検索
	 */
	List<NewsListEntity> findAll();
}
