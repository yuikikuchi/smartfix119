package com.antelope.smartfix119.domain.service;

import com.antelope.smartfix119.domain.model.Contact;

/**
 * 問い合わせサービス.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
public interface ContactService {

	/**
	 * 問い合わせメールの送信（相手）
	 * 
	 * @param contact 問い合わせ情報
	 */
	public void mailSend(Contact contact);

	/**
	 * 問い合わせメールの送信（自分）
	 * 
	 * @param contact 問い合わせ情報
	 */
	public void replyMail(Contact contact);

}
