package arroganteIT.joshua_bloch__book_practice.Builder;

public class Wheels {

    private int size;
    private String seasonType;

    public Wheels(int size, String seasonType) {
        this.size = size;
        this.seasonType = seasonType;
    }

    public int getSize() {
        return size;
    }

    public String getSeasonType() {
        return seasonType;
    }
}
