package dev.lanesync;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Feat_1_PaymentAmountTest {
    @Test
    void rejectsNegativeCents() {
        assertThrows(IllegalArgumentException.class, () -> new PaymentAmount(-1));
    }

    @Test
    void zeroIsNotChargeable() {
        assertFalse(new PaymentAmount(0).isChargeable());
        assertEquals(0, new PaymentAmount(0).cents());
    }

    @Test
    void positiveAmountIsChargeable() {
        assertTrue(new PaymentAmount(250).isChargeable());
        assertEquals(250, new PaymentAmount(250).cents());
    }
}
