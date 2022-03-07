package reviews.data;

public class Restaurant extends Business {
    private String foodType;

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public Restaurant(String name, String locaction, String foodType,Review[] reviews) {
        super(name, locaction, reviews);
        this.foodType = foodType;
    }

    @Override
    public String toString() {
        return "Restaurant " + super.toString() +" - "+foodType;
    }
}
