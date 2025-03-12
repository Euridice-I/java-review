package snack_machine;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {
    private static int snackCount = 0;
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Snack(){
        this.id = ++snackCount;
    }

    public Snack(String name, double price, int quantity){
        this();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static int getSnackCount() {
        return snackCount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return id == snack.id && Double.compare(price, snack.price) == 0 && quantity == snack.quantity && Objects.equals(name, snack.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, quantity);
    }
}
