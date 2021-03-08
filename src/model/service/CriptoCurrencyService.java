package model.service;

import entities.CriptoCurrency;

import java.util.List;
import java.util.function.Predicate;

public class CriptoCurrencyService {

    public double filterSum(List<CriptoCurrency> list, Predicate<CriptoCurrency> criteria){

        double sum  = 0.0;
        for(CriptoCurrency cc : list) {
            if(criteria.test(cc)){
                sum += cc.getPrice();
            }
        }
        return sum;
    }
}
