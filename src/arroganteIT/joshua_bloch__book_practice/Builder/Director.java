package arroganteIT.joshua_bloch__book_practice.Builder;

public class Director {

    public void constructSportsCar(CarBuilder carBuilder) {
        carBuilder.setWheels(new Wheels(19, "summer"));
        carBuilder.setEngine(new Engine("5", "15", true));
        carBuilder.setFrame(new Frame("black", "crossover"));
    }
}
