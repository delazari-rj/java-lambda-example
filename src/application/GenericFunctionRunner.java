package application;

import entities.CriptoCurrency;
import model.service.CriptoCurrencyService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class GenericFunctionRunner {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<CriptoCurrency> list = new ArrayList<>();
        list.add(new CriptoCurrency("BTCUSDT", 49899.0));
        list.add(new CriptoCurrency("ADAUSDT", 1.10));
        list.add(new CriptoCurrency("DOTUSDT", 38.7));
        list.add(new CriptoCurrency("USDTBRL", 5.76));

        CriptoCurrencyService cs = new CriptoCurrencyService();
        double sum = cs.filterSum(list, p -> p.getPair().charAt(6) == 'T');

        System.out.println(sum);
    }
}
