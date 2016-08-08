package com.devopsbuddy.web.controllers;

import com.devopsbuddy.backend.persistence.domain.backend.PasswordResetToken;
import com.devopsbuddy.backend.service.PasswordResetTokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lede on 8/8/16.
 */

@Controller
public class ForgotMyPasswordController {
    
    /** The application logger */
    private static final Logger LOG = LoggerFactory.getLogger(ForgotMyPasswordController.class);

    public static final String EMAIL_ADDRESS_VIEW_NAME = "forgotmypassword/emailForm";

    public static final String FORGOT_PASSWORD_URL_MAPPING = "/forgotmypassword";

    public static final String MAIL_SENT_KEY = "mailSent";

    @Autowired
    private PasswordResetTokenService passwordResetTokenService;

    @RequestMapping(value = FORGOT_PASSWORD_URL_MAPPING ,method = RequestMethod.GET)
    public String forgotPasswordGet() {
        return EMAIL_ADDRESS_VIEW_NAME;
    }

    @RequestMapping(value = FORGOT_PASSWORD_URL_MAPPING, method = RequestMethod.POST)
    public String forgotPasswordPost(HttpServletRequest request, @RequestParam("email") String email, ModelMap model) {

        PasswordResetToken passwordResetToken = passwordResetTokenService.createPasswordResetTokenForEmail(email);

        if (null == passwordResetToken) {
            LOG.warn("Couldn't find a password reset token for email {}", email);
        } else {
            LOG.info("Token value: {}", passwordResetToken.getToken());
            LOG.debug("Username {}", passwordResetToken.getUser().getUsername());
        }

        model.addAttribute(MAIL_SENT_KEY, "true");

        return EMAIL_ADDRESS_VIEW_NAME;
    }


}
