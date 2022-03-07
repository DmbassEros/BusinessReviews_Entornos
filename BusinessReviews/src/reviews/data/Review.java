package reviews.data;

public class Review {
    private User user;
    private String comment;
    private float rate;

    public User getReviews() {
        return user;
    }

    public void setReviews(User reviews) {
        this.user = reviews;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        if (rate >= 0 || rate <=5)
            this.rate = rate;
    }

    public Review(User user, String comment, float rate) {
        this.user = user;
        this.comment = comment;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return " user " + user+'\''+
                "comment: " + comment + '\'' +
                "rate: " + rate + "/5";
    }
}
