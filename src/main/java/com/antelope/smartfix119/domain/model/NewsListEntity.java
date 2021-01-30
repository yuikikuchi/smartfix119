package com.antelope.smartfix119.domain.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * ニュース記事用Bean.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
@Entity
public class NewsListEntity {

	/**
	 * ニュースNo
	 */
	@Id
	private int newsNo;

	/**
	 * スクリプト１
	 */
	private String script;

	/**
	 * スクリプト２
	 */
	private String script2;

	/**
	 * 作成日
	 */
	private Date createdAt;

	/**
	 * {@link NewsListEntity#newsNo}
	 */
	public int getNewsNo() {
		return newsNo;
	}

	/**
	 * {@link NewsListEntity#newsNo}
	 */
	public void setNewsNo(int newsNo) {
		this.newsNo = newsNo;
	}

	/**
	 * {@link NewsListEntity#script}
	 */
	public String getScript() {
		return script;
	}

	/**
	 * {@link NewsListEntity#script}
	 */
	public void setScript(String script) {
		this.script = script;
	}

	/**
	 * {@link NewsListEntity#script2}
	 */
	public String getScript2() {
		return script2;
	}

	/**
	 * {@link NewsListEntity#script2}
	 */
	public void setScript2(String script2) {
		this.script2 = script2;
	}

	/**
	 * {@link NewsListEntity#createdAt}
	 */
	public String getCreatedAt() {
		SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy/MM/dd");
		String formatedDate = simpledateformat.format(this.createdAt);
		return formatedDate;
	}

	/**
	 * {@link NewsListEntity#createdAt}
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}
