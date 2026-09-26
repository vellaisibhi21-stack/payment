package dev.lanesync;

public final class PaymentReceipt {
    public String format(String currency, int cents) {
        int abs = Math.abs(cents);
        return currency + " " + (abs / 100) + "." + String.format("%02d", abs % 100);
    }
}
