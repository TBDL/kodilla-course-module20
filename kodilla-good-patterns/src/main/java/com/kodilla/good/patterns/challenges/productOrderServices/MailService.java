package com.kodilla.good.patterns.challenges.productOrderServices;

public class MailService implements InformationService {

    public void inform(User user) {
        System.out.println("Sending confirmation to " + user.getName() + " " + user.getSurname());
    }

}
