package transport;

import drivers.DriverC;
import drivers.DriverD;

public class Bus extends Transport<DriverD>{
    public enum TypeOfCapacity {
    VERYSMALL(null,10),
    SMALL(null,25),
    MIDDLE(40,60),
    BIG(60,80),
    VERYBIG(100,120);

    Integer from;
    Integer to;

    TypeOfCapacity(Integer from, Integer to) {
        this.from = from;
        this.to = to;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }

    @Override
    public String toString() {
        if (from == null) {
            return "TypeOfCapacity{ " +
                    "to= " + to +
                    '}';
        } else if (to == null) {
            return  "TypeOfCapacity{" +
                    "from=" + from +
                    '}';
        }
        return "TypeOfCapacity{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}
    private TypeOfCapacity typeOfCapacity;
    public Bus(DriverD driver, String brand, String model, int engineCapacity, TypeOfCapacity typeOfCapacity) {
        super(driver, brand, model, engineCapacity);
        this.typeOfCapacity =typeOfCapacity;
    }

    @Override
    public void printType() {
        if (typeOfCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(typeOfCapacity);
        }
    }

    @Override
    public void performDiagnostics() {
        System.out.println("Не проводим диагностику, есть водитель или нет(так по заданию).");
    }

}
