package webservices;

import java.util.Objects;

public class Ingredient {

    private String itemDescription;
    private int quantity;

    public Ingredient(String itemDescription, int quantity) {
        this.itemDescription = itemDescription;
        this.quantity = quantity;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return quantity == that.quantity && Objects.equals(itemDescription, that.itemDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemDescription, quantity);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "itemDescription='" + itemDescription + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
