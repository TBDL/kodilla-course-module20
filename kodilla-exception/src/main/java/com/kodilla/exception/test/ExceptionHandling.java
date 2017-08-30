package com.kodilla.exception.test;

import java.time.LocalDateTime;

public class ExceptionHandling {


    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(11.5, 5.5);
        } catch (Exception e) {
            System.out.println("Problem on: " + e);
        } finally {
            System.out.println("Date and time of operation: " + LocalDateTime.now());
        }

    }

}
