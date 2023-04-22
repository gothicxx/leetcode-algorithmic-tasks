package arroganteIT.joshua_bloch__book_practice.Builder;

public class Engine {

    private String power;
    private String volume;
    private boolean starter;

    public Engine(String power, String volume, boolean starter) {
        this.power = power;
        this.volume = volume;
        this.starter = starter;
    }

    public String getPower() {
        return power;
    }

    public String getVolume() {
        return volume;
    }

    public boolean isStarter() {
        return starter;
    }
}
