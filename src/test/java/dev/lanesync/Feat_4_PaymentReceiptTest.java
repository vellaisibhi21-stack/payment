package dev.lanesync;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Feat_4_PaymentReceiptTest {
    private final PaymentReceipt receipt = new PaymentReceipt();

    @Test
    void formatsDollarsAndCents() {
        assertEquals("USD 12.50", receipt.format("USD", 1250));
    }

    @Test
    void padsSingleDigitCents() {
        assertEquals("USD 0.05", receipt.format("USD", 5));
    }
}
