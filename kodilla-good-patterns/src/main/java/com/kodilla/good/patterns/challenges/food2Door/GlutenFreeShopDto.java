package com.kodilla.good.patterns.challenges.food2Door;

public class GlutenFreeShopDto {
    boolean isProcessed;
    String additionalInformation;

    public GlutenFreeShopDto(boolean isProcessed, String additionalInformation) {
        this.isProcessed = isProcessed;
        this.additionalInformation = additionalInformation;
    }

    public boolean getIsProcessed() { return isProcessed; }

    public String getAdditionalInformation() {
        return additionalInformation;
    }
}
