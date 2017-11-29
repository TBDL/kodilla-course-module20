package com.kodilla.kodillapatterns2.facade.api;

public final class ItemDto {
    private final Long prodcutId;
    private final double quantity;

    public ItemDto(final Long prodcutId, final double quantity) {
        this.prodcutId = prodcutId;
        this.quantity = quantity;
    }

    public Long getProdcutId() {
        return prodcutId;
    }

    public double getQuantity() {
        return quantity;
    }

}
