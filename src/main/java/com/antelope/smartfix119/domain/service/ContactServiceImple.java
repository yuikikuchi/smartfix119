package com.antelope.smartfix119.domain.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

import com.antelope.smartfix119.domain.model.Contact;

/**
 * 問い合わせサービス.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
@Service
public class ContactServiceImple implements ContactService {

	/**
	 * 問い合わせメールの送信（相手）
	 * 
	 * @param contact 問い合わせ情報
	 */
	@Override
	public void replyMail(Contact contact) {
		try {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
			String recepDate = sdf.format(date);
			Properties property = new Properties();

			// SMTPを使うときの設定
			property.put("mail.smtp.auth", "true");
			property.put("mail.smtp.starttls.enable", "true");
			property.put("mail.smtp.host", "www3176.sakura.ne.jp");
			property.put("mail.smtp.port", "587");
			property.put("mail.smtp.debug", "true");
			property.put("mail.smtp.ssl.trust", "www3176.sakura.ne.jp");

			Session session = Session.getInstance(property, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					// 利用するSMTPサーバのメールアドレスとパスワードを設定
					return new PasswordAuthentication("support@smartfix119.com", "Dplus_01");
				}
			});

			// メール本文を作るためのインスタンス
			MimeMessage mimeMessage = new MimeMessage(session);
			// "受信者のメールアドレス", "受信者の名前"
			InternetAddress toAddress = new InternetAddress(contact.getMailAddress(), contact.getName());

			mimeMessage.setRecipient(Message.RecipientType.TO, toAddress);
			// "送信者のメールアドレス","送信者の名前"
			InternetAddress fromAddress = new InternetAddress("support@smartfix119.com", "SmartFix119 Support");
			mimeMessage.setFrom(fromAddress);
			String title = contact.getSubject();
			String text = "※このメールはシステムからの自動返信です。 \n" + " \n" + contact.getName() + " 様 \n" + " \n"
					+ "平素より弊サイトをご利用いただき、誠にありがとうございます。 \n" + "以下の内容でお問い合わせを受け付けいたしました。 \n" + " \n"
					+ "━━━━━━□■□　お問い合わせ内容　□■□━━━━━━ \n" + "お名前：" + contact.getName() + " \n" + "E-Mail："
					+ contact.getMailAddress() + " \n" + "電話番号：" + contact.getPhone() + " \n" + " \n" + "お問い合わせ内容："
					+ contact.getSubject() + " \n" + contact.getMessage() + " \n" + " \n"
					+ "━━━━━━━━━━━━━━━━━━━━━━━━━━━━ \n" + " \n" + "受付日時：" + recepDate + " \n" + " \n"
					+ "担当者より、追ってご回答させていただきます。 \n" + " \n" + "スマホ・タブレット修理のキュレーションメディア【SmartFix119】 \n"
					+ "https://smartfix119.com/ \n" + " \n";

			mimeMessage.setSubject(title, "ISO-2022-JP");
			mimeMessage.setText(text, "ISO-2022-JP");
			Transport.send(mimeMessage);
			System.out.println("送信しました。");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("メール送信エラー");

		}
	}

	/**
	 * 問い合わせメールの送信（自分）
	 * 
	 * @param contact 問い合わせ情報
	 */
	@Override
	public void mailSend(Contact contact) {
		try {
			Properties property = new Properties();

			// SMTPを使うときの設定
			property.put("mail.smtp.auth", "true");
			property.put("mail.smtp.starttls.enable", "true");
			property.put("mail.smtp.host", "www3176.sakura.ne.jp");
			property.put("mail.smtp.port", "587");
			property.put("mail.smtp.debug", "true");
			property.put("mail.smtp.ssl.trust", "www3176.sakura.ne.jp");

			Session session = Session.getInstance(property, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					// 利用するSMTPサーバのメールアドレスとパスワードを設定
					return new PasswordAuthentication("xxx@smartfix119.com", "Dplus_01");
				}
			});

			// メール本文を作るためのインスタンス
			MimeMessage mimeMessage = new MimeMessage(session);
			// "受信者のメールアドレス", "受信者の名前"
			InternetAddress toAddress = new InternetAddress("support@smartfix119.com", "SmartFix119問い合わせ");

			mimeMessage.setRecipient(Message.RecipientType.TO, toAddress);
			// "送信者のメールアドレス","送信者の名前"
			InternetAddress fromAddress = new InternetAddress("xxx@smartfix119.com", "SmartFix119");
			mimeMessage.setFrom(fromAddress);
			String title = contact.getSubject();
			String text = "SmartFix119 問い合わせ \n" + "-------------------- \n" + "名前　：　" + contact.getName()
					+ " 様 より問い合わせが届きました。 \n" + "メールアドレス　：　" + contact.getMailAddress() + "\n" + "電話番号　：　"
					+ contact.getPhone() + "\n" + "問い合わせ項目　：　" + contact.getSubject() + "\n" + "問い合わせ内容　：　"
					+ contact.getMessage() + "\n" + "--------------------";

			mimeMessage.setSubject(title, "ISO-2022-JP");
			mimeMessage.setText(text, "ISO-2022-JP");
			Transport.send(mimeMessage);
			System.out.println("送信しました。");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("メール送信エラー");

		}
	}

}
