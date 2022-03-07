package reviews.data;

public class Garage extends Business{
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Garage(String name, String locaction, float price, Review[] reviews) {
        super(name, locaction, reviews);
        this.price = price;
    }

    @Override
    public String toString() {
        return"Garage "+ super.toString()+" - "+price+" eur/h";
    }
}
