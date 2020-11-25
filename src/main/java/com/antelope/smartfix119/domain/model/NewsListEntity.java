package com.antelope.smartfix119.domain.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NewsListEntity {
	
	@Id
	private int newsNo;
	
//	private String koumoku;
	
//	private String siteName;
	
	private String script;
	
	private String script2;
	
	private Date createdAt;

	public int getNewsNo() {
		return newsNo;
	}

	public void setNewsNo(int newsNo) {
		this.newsNo = newsNo;
	}

//	public String getKoumoku() {
//		return koumoku;
//	}

//	public void setKoumoku(String koumoku) {
//		this.koumoku = koumoku;
//	}

//	public String getSiteName() {
//		return siteName;
//	}

//	public void setSiteName(String siteName) {
//		this.siteName = siteName;
//	}

	public String getScript() {
		return script;
	}

	public void setScript(String script) {
		this.script = script;
	}

	public String getScript2() {
		return script2;
	}

	public void setScript2(String script2) {
		this.script2 = script2;
	}

	public String getCreatedAt() {
		SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy/MM/dd");
		String formatedDate = simpledateformat.format(this.createdAt);
		return formatedDate;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}
