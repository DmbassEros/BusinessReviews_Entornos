package reviews.data;

public class Hairdresser extends   Business {
    private boolean isUnisex;

    public boolean isUnisex() {
        return isUnisex;
    }

    public void setUnisex(boolean unisex) {
        isUnisex = unisex;
    }

    public Hairdresser(String name, String locaction, boolean isUnisex,Review[] reviews) {
        super(name, locaction, reviews);
        this.isUnisex = isUnisex;
    }

    @Override
    public String toString() {
        String text;
        if(isUnisex)
        {
            text = "unisex";
        }
        else
            text = "not unisex";
        return "Hairdresser "+ super.toString() +" - "+text;
    }
}
