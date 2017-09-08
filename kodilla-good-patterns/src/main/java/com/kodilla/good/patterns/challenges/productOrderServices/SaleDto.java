package com.kodilla.good.patterns.challenges.productOrderServices;

public class SaleDto {

    User user;
    boolean isSold;

    public SaleDto(User user, boolean isSold) {
        this.user = user;
        this.isSold = isSold;
    }

}
