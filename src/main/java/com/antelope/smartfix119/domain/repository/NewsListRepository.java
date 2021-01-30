package com.antelope.smartfix119.domain.repository;

import java.util.List;

import com.antelope.smartfix119.domain.model.NewsListEntity;

/**
 * ニュース検索リポジトリ.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
public interface NewsListRepository {

	/**
	 * ニュースを検索
	 */
	List<NewsListEntity> findAll();
}
