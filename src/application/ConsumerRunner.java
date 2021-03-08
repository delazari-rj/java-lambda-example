package application;

import entities.CriptoCurrency;
import util.PriceUpdateConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerRunner {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<CriptoCurrency> list = new ArrayList<>();
        list.add(new CriptoCurrency("BTCUSDT", 49899.0));
        list.add(new CriptoCurrency("ADAUSDT", 1.10));
        list.add(new CriptoCurrency("DOTUSDT", 38.7));
        list.add(new CriptoCurrency("USDTBRL", 5.76));

        double factor = 1.1;

        list.forEach(v -> v.setPrice(v.getPrice() + factor));

        Consumer<CriptoCurrency> cons = v -> v.setPrice(v.getPrice() + factor);
        list.forEach(cons);

        list.forEach(new PriceUpdateConsumer());
        list.forEach(CriptoCurrency::staticPriceUpdateConsumer);
        list.forEach(CriptoCurrency::nonStaticPriceUpdateConsumer);

    }
}
