package util;

import entities.CriptoCurrency;

import java.util.function.Consumer;

public class PriceUpdateConsumer implements Consumer<CriptoCurrency> {

    public void accept(CriptoCurrency cc){

        cc.setPrice(cc.getPrice() * 1.1);
    }
}
