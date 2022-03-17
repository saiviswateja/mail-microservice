package com.referrelo.MailNotifier.Controller;

import com.referrelo.MailNotifier.DTO.MailHistory;
import com.referrelo.MailNotifier.Service.EmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mail")
public class EmailController {

    @Autowired
    public EmailSender emailSender;

    @PostMapping("/sendemail")
    public void sendEmail(@RequestBody MailHistory mailHistory) {
        emailSender.sendSimpleEmail(mailHistory);
    }
}
