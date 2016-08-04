package com.devopsbuddy.backend.service;

import com.devopsbuddy.web.domain.frontend.Feedback;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by lede on 8/4/16.
 */
public interface EmailService {

    public void sendFeedbackEmail (Feedback feedback);

    public void sendGenericEmailMessage(SimpleMailMessage message);


}
