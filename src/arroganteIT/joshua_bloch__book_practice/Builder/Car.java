package arroganteIT.joshua_bloch__book_practice.Builder;

public class Car {

    private Engine engine;
    private Frame frame;
    private Wheels wheels;

    private Car() {

    }

    public static Car attributesOn(Engine engine, Frame frame, Wheels wheels) {
        Car car = new Car();
        car.engine = engine;
        car.frame = frame;
        car.wheels = wheels;
        return car;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "\n engine=" + engine.getPower() +
                ",\n frame=" + frame.getColor() +
                ",\n wheels=" + wheels.getSeasonType() +
                '}';
    }
}
