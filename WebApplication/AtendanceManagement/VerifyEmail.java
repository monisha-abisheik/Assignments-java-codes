package controller;

import java.util.Properties;


import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class VerifyEmail {
	
	VerifyEmail()
	{
		
	}
	
	
	public boolean emailVerification(String email)
	{
		boolean test= false;
		String sendEmail="zattendancemanagement@gmail.com";
		String sendPassword="mwymtzoffzkxpzme";
		String toEmail=email;
		try {
			
		
			    Properties ps = new Properties();
			    ps.put("mail.smtp.host", "smtp.gmail.com");		
		        ps.put("mail.smtp.auth", "true");
		        ps.put("mail.smtp.port", "587");
		        ps.put("mail.smtp.starttls.enable", "true");
		        ps.put("mail.smtp.socketFactory.port", "587");
	            ps.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
				
			Session session=Session.getInstance(ps,new Authenticator()
					{
				
				protected PasswordAuthentication getPasswordAuthentication()
				{
					return new PasswordAuthentication(sendEmail,sendPassword);
				}
				
					}
					);
			
			Message msg=new MimeMessage(session);
			msg.setFrom(new InternetAddress(sendEmail));
			msg.setRecipient(Message.RecipientType.TO,new InternetAddress(toEmail) );
			
			msg.setSubject(" Email Verification");
			msg.setText("Hi,Please verify your Account...");
			System.out.println("Sending");
			Transport.send(msg);
			System.out.println("Messege Send successfully");
			test=true;
		}catch( Exception e)
		{
			e.printStackTrace();
		}
		return test;
		}
	
}