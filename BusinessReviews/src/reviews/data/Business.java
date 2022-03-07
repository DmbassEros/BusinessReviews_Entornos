package reviews.data;

public abstract class Business implements Comparable<Business>{
    protected String name;
    protected String locaction;
    Review [] reviews;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocaction() {
        return locaction;
    }

    public void setLocaction(String locaction) {
        this.locaction = locaction;
    }

    public Review[] getReviews() {
        return reviews;
    }

    public void setReviews(Review[] reviewAverage) {
        this.reviews = reviewAverage;
    }

    public Business(String name, String locaction, Review[] reviews) {
        this.name = name;
        this.locaction = locaction;
        this.reviews = reviews;
    }
    public void reviewAverage()
    {
        float sum = 0;
        int i = 0;
            while(i < reviews.length)
            {
                sum += reviews[i].getRate();
                i++;
            }
        float average = (sum / reviews.length);
    }
    @Override
    public String toString() {
        return name + " ("+ locaction + ")"+ '\'' +
               "Review average: ";
    }
    public int compareTo(Business b) {
        if(this.name == b.name)
        {
            return 0;
        }
        if(this.name != b.name)
        {
            return -1;
        }
        return 1;
    }
}
