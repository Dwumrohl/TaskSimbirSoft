package com.example.TaskSimbirSoft.service;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.Properties;

@Service
public class DefaultEmailService {

    @Autowired
    public JavaMailSender emailSender;

    @Value("${spring.mail.username}")
    private String username;

    @Value("${spring.mail.password}")
    private String password;

    @Value("${spring.mail.port}")
    private String port;

    @Value("${spring.mail.host}")
    private String host;

    public void sendSimpleEmail(String toAddress, String subject, String message) {

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(toAddress);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(message);
        simpleMailMessage.setFrom(username);
        emailSender.send(simpleMailMessage);
    }

    public void sendMimeMessage(String toAddress, String subject, String message) {
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.setProperty("mail.transport.protocol", "smtp");
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.ssl.enable", true);
        properties.put("mail.smtp.auth", false);
        properties.put("mail.smtp.name","ПАвел Да");
        properties.put("mail.smtps.auth", false);
        properties.put("mail.smtp.starttls.enable", true);
        properties.put("mail.smtp.socketFactory.class",
                "jakarta.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.socketFactory.fallback", "false");
        properties.setProperty("mail.smtp.quitwait", "false");


        Session session = Session.getInstance(
                properties,
                new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, "hdzaneanelccraix");
                    }
                }
        );
        session.setDebug(true);
        try {
            MimeMessage message1 = new MimeMessage(session);
            message1.setFrom(new InternetAddress(username));
            message1.addRecipient(Message.RecipientType.TO, new InternetAddress(toAddress));
            message1.setSubject(subject);
            message1.setText(message);
            Transport.send(message1);
        }catch (Exception e){}
    }

}