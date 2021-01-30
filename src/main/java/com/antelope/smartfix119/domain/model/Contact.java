package com.antelope.smartfix119.domain.model;

/**
 * 問い合わせ情報用Bean.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
public class Contact {

	/**
	 * 名前
	 */
	private String name;

	/**
	 * 送信元メールアドレス
	 */
	private String mailAddress;

	/**
	 * 電話番号
	 */
	private String phone;

	/**
	 * 件名
	 */
	private String subject;

	/**
	 * メッセージ
	 */
	private String message;

	/**
	 * {@link Contact#name}
	 */
	public String getName() {
		return name;
	}

	/**
	 * {@link Contact#name}
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * {@link Contact#mailAddress}
	 */
	public String getMailAddress() {
		return mailAddress;
	}

	/**
	 * {@link Contact#mailAddress}
	 */
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	/**
	 * {@link Contact#phone}
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * {@link Contact#phone}
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * {@link Contact#subject}
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * {@link Contact#subject}
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * {@link Contact#message}
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * {@link Contact#message}
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
