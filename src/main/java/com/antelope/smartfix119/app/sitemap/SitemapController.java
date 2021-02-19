package com.antelope.smartfix119.app.sitemap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * サイトマップ用コントローラ.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
@Controller
public class SitemapController {

	/**
	 * サイトマップの描画処理.
	 * 
	 * @return xmlUrlSetの返却
	 */
	@ResponseBody
	@RequestMapping(value = "/sitemap.xml", method = RequestMethod.GET)
	public XmlUrlSet main() {
		XmlUrlSet xmlUrlSet = new XmlUrlSet();
		create(xmlUrlSet, "", XmlUrl.Priority.HIGH);
		create(xmlUrlSet, "/#home_section", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/#about_section", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/#search_section", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/#service_section", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/#news_section", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/#maker_section", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/#contact_section", XmlUrl.Priority.MEDIUM);

		// Area
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

		// Area Pages 北海道・東北
		create(xmlUrlSet, "/search?page=0&size=8&area=hokkaido", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=1&size=8&area=hokkaido", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=2&size=8&area=hokkaido", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=aomori", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=iwate", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=miyagi", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=1&size=8&area=miyagi", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=akita", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=yamagata", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=fukushima", XmlUrl.Priority.MEDIUM);

		// Area Pages 関東
		create(xmlUrlSet, "/search?page=0&size=8&area=ibaraki", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=tochigi", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=1&size=8&area=tochigi", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=gunma", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=1&size=8&area=gunma", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=saitama", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=1&size=8&area=saitama", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=2&size=8&area=saitama", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=3&size=8&area=saitama", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=4&size=8&area=saitama", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=5&size=8&area=saitama", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=6&size=8&area=saitama", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=chiba", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=1&size=8&area=chiba", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=2&size=8&area=chiba", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=3&size=8&area=chiba", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=4&size=8&area=chiba", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=1&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=2&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=3&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=4&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=5&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=6&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=7&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=8&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=9&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=10&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=11&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=12&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=13&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=14&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=15&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=16&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=17&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=18&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=19&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=20&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=21&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=22&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=23&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=24&size=8&area=tokyo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=kanagawa", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=1&size=8&area=kanagawa", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=2&size=8&area=kanagawa", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=3&size=8&area=kanagawa", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=4&size=8&area=kanagawa", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=5&size=8&area=kanagawa", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=6&size=8&area=kanagawa", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=7&size=8&area=kanagawa", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=8&size=8&area=kanagawa", XmlUrl.Priority.MEDIUM);

		// Area Pages 北陸・甲信越
		create(xmlUrlSet, "/search?page=0&size=8&area=niigata", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=toyama", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=ishikawa", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=fukui", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=yamanashi", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=nagano", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=1&size=8&area=nagano", XmlUrl.Priority.MEDIUM);

		// Area Pages 東海
		create(xmlUrlSet, "/search?page=0&size=8&area=gifu", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=shizuoka", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=1&size=8&area=shizuoka", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=2&size=8&area=shizuoka", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=3&size=8&area=shizuoka", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=aichi", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=1&size=8&area=aichi", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=2&size=8&area=aichi", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=3&size=8&area=aichi", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=mie", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=1&size=8&area=mie", XmlUrl.Priority.MEDIUM);

		// Area Pages 近畿
		create(xmlUrlSet, "/search?page=0&size=8&area=shiga", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=kyoto", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=osaka", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=1&size=8&area=osaka", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=2&size=8&area=osaka", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=3&size=8&area=osaka", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=hyogo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=1&size=8&area=hyogo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=2&size=8&area=hyogo", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=nara", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=wakayama", XmlUrl.Priority.MEDIUM);

		// Area Pages 中国・四国
		create(xmlUrlSet, "/search?page=0&size=8&area=tottori", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=shimane", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=okayama", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=hiroshima", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=1&size=8&area=hiroshima", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=yamaguchi", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=tokushima", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=kagawa", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=ehime", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=1&size=8&area=ehime", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=kochi", XmlUrl.Priority.MEDIUM);

		// Area Pages 九州
		create(xmlUrlSet, "/search?page=0&size=8&area=fukuoka", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=1&size=8&area=fukuoka", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=2&size=8&area=fukuoka", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=saga", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=nagasaki", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=kumamoto", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=oita", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=miyazaki", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=kagoshima", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/search?page=0&size=8&area=okinawa", XmlUrl.Priority.MEDIUM);

		// Apple
		create(xmlUrlSet, "/model?modelName=iPhone3G", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhone3GS", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhone4", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhone4S", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhone5", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhone5c", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhone5s", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhone6", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhone6+Plus", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhone6s", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhone6s+Plus", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhoneSE", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhone7", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhone7+Plus", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhone8", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhone8+Plus", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhoneX", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhoneXS", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhoneXS+Max", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhoneXR", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhone11", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhone11+Pro", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhone11+Pro+Max", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhoneSE%28第2世代%29", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhone12", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhone12+Pro", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhone12+mini", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=iPhone12+Pro+Max", XmlUrl.Priority.MEDIUM);

		// SHARP
		create(xmlUrlSet, "/model?modelName=SH2101V", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=LYNX+SH-10B", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=LYNX+3D+SH-03C", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=ブックリーダー+SH-07C", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=Q-pot.Phone+SH-04D", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=SH-06D+NERV", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=SH-01E+Vivienne+Westwood", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=スマートフォン+for+ジュニア+SH-05E", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=SH-01F+DRAGON+QUEST", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=SH-04F", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=スマートフォン+for+ジュニア2+SH-03F", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=Disney+Mobile+on+docomo+SH-05", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=IS01+%28CDMA+SHI01／NB30%29", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=IS03+%28CDMA+SHI03／AS31%29", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=IS05+%28CDMA+SHI05／AS32%29", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=INFOBAR+A01+%28CDMA+SHX11／AS35%29", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=INFOBAR+C01+%28CDMA+SHX12／AF30%29", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=GALAPAGOS+003SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=GALAPAGOS+005SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=007SH+KT", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=Yahoo%21+Phone+009SH+Y", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=PANTONE+5+107SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=ボス電+107SH+B", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=PANTONE+6+200SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=シンプルスマホ+204SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=DM009SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=DM010SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=DM011SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=DM012SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=DM013SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=DM014SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=DM016SH", XmlUrl.Priority.MEDIUM);

		// SHARP(AQUOS)
		create(xmlUrlSet, "/model?modelName=AQUOS+ZETA+SH-04F", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+ZETA+SH-01G", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+ZETA+SH-03G", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+EVER+SH-04G", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+ZETA+SH-01H", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+Compact+SH-02H", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+ZETA+SH-04H", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+EVER+SH-02J", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+R+SH-03J", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+sense+SH-01K", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+R2+SH-03K", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+sense2+SH-01L", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+R3+SH-04L", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+sense3+SH-02M", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+SERIE+SHL25", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+SERIE+mini+SHV31", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+SERIE+SHV32", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+SERIE+mini+SHV33", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+SERIE+SHV34", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+U+SHV35", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+U+SHV37", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+SERIE+mini+SHV38", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+R+SHV39", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+sense+SHV40", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+R+compact+SHV41", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+R2+SHV42", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+sense2+SHV43", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+R3+SHV44", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+sense2+かんたん", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+sense3+SHV45", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+sense3+plus+サウンド+SHV46", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+Zero2+SHV47", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+R5G+SHG01", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+sense3+basic+SHV48", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+Zero5G+basic+DX+SHG02", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+Xx+304SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+CRYSTAL+305SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+CRYSTAL+X+402SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+Xx+404SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+CRYSTAL+2+403SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+Xx2+506SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+Xx3+mini+603SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+R+605SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+ea+606SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+R+compact+701SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+sense+basic+702SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+R2+706SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+zero+801SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+R2+Compact+803SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+R3+808SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+zero2", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+CRYSTAL+Y+402SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+Xx-Y+404SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+CRYSTAL+Y2+403SH", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+L", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+L2", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+sense", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+sense2+SHV43", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+SH-M01", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+SH-M02", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+SH-RM02", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+SH-M20-EVA20", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+mini+SH-M03", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+SH-M04+SH-M04-A", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+sense+lite+SH-M05", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+R+compact+SH-M06", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+sense+plus+SH-M07", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+sense2+SH-M08", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+R2+Compact+SH-M09", XmlUrl.Priority.MEDIUM);
		create(xmlUrlSet, "/model?modelName=AQUOS+zero+SH-M10", XmlUrl.Priority.MEDIUM);

		return xmlUrlSet;
	}

	/**
	 * サイトマップのパス生成.
	 */
	private void create(XmlUrlSet xmlUrlSet, String link, XmlUrl.Priority priority) {
		xmlUrlSet.addUrl(new XmlUrl("https://smartfix119.com" + link, priority));
	}

}