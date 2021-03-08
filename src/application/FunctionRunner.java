package application;

import entities.CriptoCurrency;
import util.LowerCaseFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionRunner {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<CriptoCurrency> list = new ArrayList<>();
        list.add(new CriptoCurrency("BTCUSDT", 49899.0));
        list.add(new CriptoCurrency("ADAUSDT", 1.10));
        list.add(new CriptoCurrency("DOTUSDT", 38.7));
        list.add(new CriptoCurrency("USDTBRL", 5.76));

        list.stream().map(k -> k.getPair().toLowerCase()).collect(Collectors.toList());

        Function<CriptoCurrency, String> func = k -> k.getPair().toLowerCase();
        list.stream().map(func).collect(Collectors.toList());

        list.stream().map(new LowerCaseFunction()).collect(Collectors.toList());
        list.stream().map(CriptoCurrency::staticLowerCaseFunction).collect(Collectors.toList());
        list.stream().map(CriptoCurrency::nonStaticLowerCaseFunction).collect(Collectors.toList());
    }
}
