package arroganteIT.joshua_bloch__book_practice.Builder;

public class CarBuilderImpl implements CarBuilder{

    private Engine engine;
    private Frame frame;
    private Wheels wheels;

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    @Override
    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Car builds() {
        return Car.attributesOn(engine, frame, wheels);
    }
}
