package model.service;

import entities.CriptoCurrency;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class CriptoCurrencyServiceTest {

    private CriptoCurrencyService cs;
    private List<CriptoCurrency> list;
    @BeforeEach
    void setUp() {
        Locale.setDefault(Locale.US);
        list = new ArrayList<>();
        list.add(new CriptoCurrency("BTCUSDT", 49899.0));
        list.add(new CriptoCurrency("ADAUSDT", 1.10));
        list.add(new CriptoCurrency("DOTUSDT", 38.7));
        list.add(new CriptoCurrency("USDTBRL", 5.76));

        cs = new CriptoCurrencyService();
    }

    @Test
    void filterSumAtCharT() {
        assertEquals(cs.filterSum(list, p-> p.getPair().charAt(6) == 'T'), 49938.799999999996);
    }

    @Test
    void filterSumMoreThenPrice(){
        assertEquals(cs.filterSum(list, p-> p.getPrice() >= 40000.0), 49899.0);
    }

    @Test
    void filterSumLowerThenPrice(){
        assertEquals(cs.filterSum(list, p-> p.getPrice() <= 10.0), 6.859999999999999);
    }
}