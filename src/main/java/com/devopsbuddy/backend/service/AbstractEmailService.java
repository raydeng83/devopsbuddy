package com.devopsbuddy.backend.service;

import com.devopsbuddy.web.domain.frontend.Feedback;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by lede on 8/4/16.
 */
public abstract class AbstractEmailService implements EmailService{


    @Value("${default.to.address}")
    private String defaultToAddress;

    protected SimpleMailMessage prepareSimpleMailMessageFromFeedback(Feedback feedback) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(defaultToAddress);
        message.setFrom(feedback.getEmail());
        message.setSubject("[DevOps Buddy]: Feedback received from "+feedback.getFirstName()+" "+feedback.getLastName
                ()+"!");
        message.setText(feedback.getFeedback());

        return message;
    }

    @Override
    public void sendFeedbackEmail(Feedback feedback) {
        sendGenericEmailMessage(prepareSimpleMailMessageFromFeedback(feedback));
    }

}
