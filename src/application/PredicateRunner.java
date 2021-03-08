package application;

import entities.CriptoCurrency;
import util.CriptoCurrencyPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class PredicateRunner {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        List<CriptoCurrency> list = new ArrayList<>();
        list.add(new CriptoCurrency("BTCUSDT", 49899.0));
        list.add(new CriptoCurrency("ADAUSDT", 1.10));
        list.add(new CriptoCurrency("DOTUSDT", 38.7));
        list.add(new CriptoCurrency("USDTBRL", 5.76));

        /*Inline Lambda Example*/
        list.removeIf( v -> v.getPrice() <= 10.0);

        /*Declared Predicate Example*/
        double value = 10.0;
        Predicate<CriptoCurrency> pred = p -> p.getPrice() <= value;
        list.removeIf(pred);

        /*Predicate Class Example*/
        list.removeIf(new CriptoCurrencyPredicate());

        /*Static Method Example*/
        list.removeIf(CriptoCurrency::staticCriptoCurrencyPredicate);

        /*NonStatic Method Example*/
        list.removeIf(CriptoCurrency::nonStaticCriptoCurrencyPredicate);

        list.forEach(System.out::println);
    }
}