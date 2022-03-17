package com.referrelo.MailNotifier.Service;

import com.referrelo.MailNotifier.DTO.MailHistory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailSender {
    @Autowired
    private JavaMailSender javaMailSender;

    public void sendSimpleEmail(MailHistory mailHistory) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("referralomailer@gmail.com");
        simpleMailMessage.setTo(mailHistory.getEmailAddress());
        simpleMailMessage.setSubject(mailHistory.getSubject());
        simpleMailMessage.setText(mailHistory.getEmailContent());
        log.info("Trying to send email to user " + mailHistory.getEmailAddress());
        javaMailSender.send(simpleMailMessage);
        log.info("Email Sent to user " + mailHistory.getEmailAddress());
    }
}
