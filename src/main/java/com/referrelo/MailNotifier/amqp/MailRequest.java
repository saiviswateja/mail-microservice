package com.referrelo.MailNotifier.amqp;

import com.referrelo.MailNotifier.DTO.MailHistory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MailRequest {
    private String messageId;
    private Object message;
    private Date messageDate;
}
