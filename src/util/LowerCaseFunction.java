package util;

import entities.CriptoCurrency;

import java.util.function.Function;

public class LowerCaseFunction implements Function<CriptoCurrency, String> {

    public String apply(CriptoCurrency cc){
        return cc.getPair().toLowerCase();
    }
}
