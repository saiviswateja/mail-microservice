package com.referrelo.MailNotifier.amqp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.referrelo.MailNotifier.DTO.MailHistory;
import com.referrelo.MailNotifier.Service.EmailSender;
import com.referrelo.MailNotifier.Service.MailHistoryService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @Autowired
    private EmailSender emailSender;

    @RabbitListener(queues = MQconfig.QUEUE)
    public void mailListener(MailRequest mailRequest) {
        final ObjectMapper mapper = new ObjectMapper(); // jackson's objectmapper
        final MailHistory mailHistory = mapper.convertValue(mailRequest.getMessage(), MailHistory.class);
        emailSender.sendSimpleEmail(mailHistory);
    }
}
