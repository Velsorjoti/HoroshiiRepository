package transport;

public abstract class Transport<T> implements Competing {
    protected T driver;
    protected String brand;
    protected String model;
    protected int engineCapacity;

    public Transport(T driver, String brand, String model, int engineCapacity) {
        this.driver = driver;
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void pitStop() {
    }

    @Override
    public void bestRingTime() {
    }

    @Override
    public void maxSpeed() {
    }

    public abstract void printType();

    public abstract void performDiagnostics() throws CheckDrivers;
}
