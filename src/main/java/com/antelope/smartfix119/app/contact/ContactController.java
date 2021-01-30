package com.antelope.smartfix119.app.contact;

import javax.inject.Inject;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.antelope.smartfix119.domain.model.Contact;
import com.antelope.smartfix119.domain.service.ContactService;

/**
 * 問い合わせ用コントローラ.<br>
 * メールの送受信を制御.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
@Controller
@RequestMapping("/")
@Mapper
public class ContactController {

	@Inject
	ContactService contactService;

	/**
	 * 問い合わせの送信処理.<br>
	 * {@link ContactService}より相手と自身にメールを送信.
	 * 
	 * @param model ビューのレンダリングに使用する属性
	 * @param form  {@link ContactForm}参照
	 * @return top.jspの返却
	 */
	@RequestMapping(value = "contact", params = "contact", method = RequestMethod.POST)
	public String contact(Model model, ContactForm form) {

		Contact contact = new Contact();
		BeanUtils.copyProperties(form, contact);

		contactService.mailSend(contact);
		contactService.replyMail(contact);

		return "top";
	}

}
