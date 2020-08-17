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

@Controller
@RequestMapping("/")
@Mapper
public class ContactController {
	
	@Inject
	ContactService contactService;
	
	
	/**
	 * お問い合わせ送信
	 * 
	 * @param form
	 * @param model
	 */
	@RequestMapping(value = "contact", params = "contact", method = RequestMethod.POST)
	public String contact(ContactForm form, Model model) {
		
		Contact contact = new Contact();
		BeanUtils.copyProperties(form, contact);
		
		contactService.mailSend(contact);
		contactService.replyMail(contact);

		return "top";
	}

}
