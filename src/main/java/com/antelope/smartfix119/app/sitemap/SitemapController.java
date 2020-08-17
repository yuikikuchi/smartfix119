package com.antelope.smartfix119.app.sitemap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SitemapController {

	@RequestMapping(value = "/sitemap.xml", method = RequestMethod.GET)
	@ResponseBody
	public XmlUrlSet main() {
		XmlUrlSet xmlUrlSet = new XmlUrlSet();
		create(xmlUrlSet, "", XmlUrl.Priority.HIGH);
		create(xmlUrlSet, "/search?area=hokkaido", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=aomori", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=iwate", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=miyagi", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=akita", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=yamagata", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=fukushima", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=ibaraki", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=tochigi", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=gunma", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=saitama", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=chiba", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=kanagawa", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=niigata", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=toyama", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=ishikawa", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=fukui", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=yamanashi", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=nagano", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=gifu", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=shizuoka", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=aichi", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=mie", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=shiga", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=kyoto", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=osaka", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=hyogo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=nara", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=wakayama", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=tottori", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=shimane", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=okayama", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=hiroshima", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=yamaguchi", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=tokushima", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=kagawa", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=ehime", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=kochi", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=fukuoka", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=saga", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=nagasaki", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=kumamoto", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=oita", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=miyazaki", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=kagoshima", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=okinawa", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=delivery", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=usedshop", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=purchaseshop", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?area=partsshop", XmlUrl.Priority.MEDIUM);
		return xmlUrlSet;
	}

	private void create(XmlUrlSet xmlUrlSet, String link, XmlUrl.Priority priority) {
		xmlUrlSet.addUrl(new XmlUrl("https://smartfix119.com" + link, priority));
	}

}