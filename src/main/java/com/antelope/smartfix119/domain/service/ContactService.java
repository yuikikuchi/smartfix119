package com.antelope.smartfix119.domain.service;

import com.antelope.smartfix119.domain.model.Contact;

public interface ContactService {
	
	/**
	 * 問い合わせ
	 * 
	 * @param area(エリア名)
	 */
//	void mailSend(ContactHelper dto);
	
//	void replyMail(ContactHelper dto);
	
	public void mailSend(Contact contact);
	
	public void replyMail(Contact contact);

}
