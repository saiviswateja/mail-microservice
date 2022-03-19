package com.referrelo.MailNotifier.repos;

import com.referrelo.MailNotifier.DTO.MailHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailHistoryRepo extends JpaRepository<MailHistory, Long> {
}
