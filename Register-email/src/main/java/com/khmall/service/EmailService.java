package com.khmall.service;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmailService {

	private final JavaMailSender javaMailSender;
	
	private static final String senderEmail="xnwlwjs@gmail.com";
	
	private static int number;
	
	public static void 번호생성() {
		number =(int) (Math.random() * (90000))+100000;
	}
	
	public MimeMessage createMail(String mail) {
		
		번호생성();
		MimeMessage 메세지 = javaMailSender.createMimeMessage();
		
		try {
			메세지.setFrom(senderEmail);
			메세지.setRecipients(MimeMessage.RecipientType.TO, mail);
			//메세지.setRecipient(MimeMessage.RecipientType.TO, mail);
			메세지.setSubject("이메일인증");
			String 이메일본문 = "";
			이메일본문 += "<h3>" + "요청하신 인증 번호입니다" + "</h3>";
			이메일본문 += "<h1>" + "number" + "</h1>";
			메세지.setText(이메일본문,"utf-8","html");
			
			
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 메세지;
	}
	
	public int sendMail(String mail) {
		MimeMessage 메세지 = createMail(mail);
		javaMailSender.send(메세지);
		return number;
	}
	
	
	
}
