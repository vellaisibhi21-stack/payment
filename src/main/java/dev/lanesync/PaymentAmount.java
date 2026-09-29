package dev.lanesync;

public final class PaymentAmount {
    private final int cents;

    public PaymentAmount(int cents) {
        if (cents < 0) {
            throw new IllegalArgumentException("amount cannot be negative");
        }
        this.cents = cents;
    }

    public int cents() {
        return cents;
    }

    public boolean isChargeable() {
        return cents > 0;
    }
}
