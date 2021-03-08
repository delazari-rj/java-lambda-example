package util;

import entities.CriptoCurrency;

import java.util.function.Predicate;

public class CriptoCurrencyPredicate implements Predicate<CriptoCurrency> {

    @Override
    public boolean test(CriptoCurrency cc) {
        return cc.getPrice() <= 10.0;
    }
}
