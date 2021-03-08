package entities;

import java.io.Serializable;
import java.util.Objects;

public class CriptoCurrency implements Serializable {

    private String pair;
    private Double price;

    public CriptoCurrency(){};

    public CriptoCurrency(String pair, Double price) {
        this.pair = pair;
        this.price = price;
    }

    public String getPair() {
        return pair;
    }

    public void setPair(String pair) {
        this.pair = pair;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static boolean staticCriptoCurrencyPredicate(CriptoCurrency cc){
        return cc.getPrice() <= 10.0;
    }

    public boolean nonStaticCriptoCurrencyPredicate(){
        return this.price <= 10.0;
    }

    public static void staticPriceUpdateConsumer(CriptoCurrency cc){
         cc.setPrice(cc.getPrice() + 1.1);
    }

    public void nonStaticPriceUpdateConsumer(){
        price = price * 1.1;
    }

    public static String staticLowerCaseFunction(CriptoCurrency cc){
        return cc.getPair().toLowerCase();
    }

    public String nonStaticLowerCaseFunction(){
        return pair.toLowerCase();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CriptoCurrency that = (CriptoCurrency) o;
        return pair.equals(that.pair) &&
                Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pair, price);
    }

    @Override
    public String toString() {
        return "CriptoCurrency{" +
                "pair='" + pair + '\'' +
                ", price=" + price +
                '}';
    }
}
