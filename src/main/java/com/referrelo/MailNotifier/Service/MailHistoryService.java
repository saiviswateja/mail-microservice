package com.referrelo.MailNotifier.Service;

import com.referrelo.MailNotifier.DTO.MailHistory;
import com.referrelo.MailNotifier.repos.MailHistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailHistoryService {
    @Autowired
    public MailHistoryRepo mailHistoryRepo;

    public void saveEmailHistory(MailHistory mailHistory) {
        mailHistoryRepo.save(mailHistory);
    }
}
