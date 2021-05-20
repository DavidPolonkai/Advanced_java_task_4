package hu.uni.miskolc.iit.advancedjava;

import lombok.*;

@Data
public class Product {

    @Setter(AccessLevel.PROTECTED)
    @Getter(AccessLevel.PROTECTED)
    @NonNull
    private String name;

    @NonNull
    private int price;

    private ProductTypes type;

    public void increasePrice(int percentage) {
        price += Math.round(price * (float) percentage / 100);
    }

    public void decreasePrice(int percentage) {
        price -= Math.round(price * (float) percentage / 100);
    }
}
