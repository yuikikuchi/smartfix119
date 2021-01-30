package com.antelope.smartfix119.app.contact;

import java.io.Serializable;

/**
 * 問い合わせ用Bean.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
public class ContactForm implements Serializable {

	/**
	 * バージョン
	 */
	private static final long serialVersionUID = 6495880245131539562L;

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
	 * {@link ContactForm#name}
	 */
	public String getName() {
		return name;
	}

	/**
	 * {@link ContactForm#name}
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * {@link ContactForm#mailAddress}
	 */
	public String getMailAddress() {
		return mailAddress;
	}

	/**
	 * {@link ContactForm#mailAddress}
	 */
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	/**
	 * {@link ContactForm#phone}
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * {@link ContactForm#phone}
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * {@link ContactForm#subject}
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * {@link ContactForm#subject}
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * {@link ContactForm#message}
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * {@link ContactForm#message}
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
