package org.common.email.controller;

import org.common.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

/**
 * Created by abburi on 6/18/17.
 */

@RestController
public class SendEmailController {

    @Autowired
    private EmailService emailService;
    
    @Value("${email.from.address}")
    private String toEmail;

    @RequestMapping(value = "/sendEmail" , method = RequestMethod.GET)
    public String sendEmail(){
       String message=""; 
    	try {
    		emailService.sendMail(toEmail, "Data Science Requirement", "Please find the Data Science related data");
            message="We have sent an email to the customer receipents successfully ";
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    	return message;
    }

}
