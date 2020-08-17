package com.antelope.smartfix119.domain.model;

//@Data
public class Contact {
	
	/** 名前 */
	private String name;

	/** 送信元メールアドレス */
	private String mailAddress;

	/** 電話番号 */
	private String phone;

	/** 件名 */
	private String subject;

	/** メッセージ */
	private String message;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
