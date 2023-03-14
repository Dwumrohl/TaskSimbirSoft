package com.example.TaskSimbirSoft.service;

import com.example.TaskSimbirSoft.Entity.EmailDetails;
public interface EmailService {
    String sendSimpleMail(EmailDetails details);

    String sendMailWithAttachment(EmailDetails details);

}
