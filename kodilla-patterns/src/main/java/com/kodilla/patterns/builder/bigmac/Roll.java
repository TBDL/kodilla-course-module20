package com.kodilla.patterns.builder.bigmac;

public class Roll {
    private final String withSesame = "WITH SESAME";
    private final String withoutSesame = "WITHOUT SESAME";
    private final String rollType;

    public Roll(String rollType) {
        if (rollType.equals(withSesame) ||
            rollType.equals(withoutSesame)) {
            this.rollType = rollType;
        } else {
            throw new IllegalStateException("Roll should be WITH SESAME " +
                    "or WITHOUT SESAME");
        }
    }

    @Override
    public String toString() {
        return rollType;
    }
}
