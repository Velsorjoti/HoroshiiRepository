package transport;

import enumpocket.FixType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

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
    public String toString() {
        return "Transport{" +
                "driver=" + driver +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", fixType=" + fixType +
                ", mechanic=" + mechanic +
                '}';
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return engineCapacity == transport.engineCapacity && Objects.equals(driver, transport.driver) && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && fixType == transport.fixType && Objects.equals(mechanic, transport.mechanic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driver, brand, model, engineCapacity, fixType, mechanic);
    }
}
