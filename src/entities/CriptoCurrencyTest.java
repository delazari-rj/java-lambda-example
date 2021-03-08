package entities;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CriptoCurrencyTest {

    private CriptoCurrency cc;

    @BeforeEach
    void setUp() {
        cc = new CriptoCurrency("NANOUSDT", 15.8);
    }

    @Test
    void getPair() {
        assertEquals(cc.getPair(), "NANOUSDT");
    }

    @Test
    void getPrice() {
        assertEquals(cc.getPrice(), 15.8);
    }

    @Test
    void setPair() {
        cc.setPair("BTCUSDT");
        assertEquals(cc.getPair(), "BTCUSDT");
    }

    @Test
    void setPrice() {
        cc.setPrice(33502.5);
        assertEquals(cc.getPrice(), 33502.5);
    }
}