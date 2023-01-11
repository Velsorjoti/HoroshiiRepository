package transport;

import enumpocket.FixType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Transport<T> implements Competing {
    protected T driver;
    protected String brand;
    protected String model;
    protected int engineCapacity;
    protected final FixType fixType;
    protected final List<Mechanics> mechanic;


    public Transport(T driver, String brand, String model, int engineCapacity, FixType fixType, Mechanics...mechanics) {
        this.driver = driver;
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.fixType = fixType;
        this.mechanic = new ArrayList<>();
        Collections.addAll(this.mechanic,mechanics);
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

    public List<Mechanics> getMechanic() {
        return mechanic;
    }

    public FixType getFixType() {
        return fixType;
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
