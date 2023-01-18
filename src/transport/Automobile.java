package transport;

import drivers.DriverB;
import enumpocket.FixType;

public class Automobile extends Transport<DriverB> {
    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хэтчбэк"),
        COUPE("Купе"),
        STATIONWAGON("Универсал"),
        OFFROAD("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        @Override
        public String toString() {
            return "BodyType= " + bodyType;
        }

        public String getBodyType() {
            return bodyType;
        }

        public void setBodyType(String bodyType) {
            bodyType = bodyType;
        }
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public  DriverB driver;

    private BodyType bodyType;

    public Automobile(DriverB driver, String brand, String model, int engineCapacity, BodyType bodyType, FixType fixType, Mechanics...mechanics) {
        super(driver, brand, model, engineCapacity, fixType, mechanics);
        this.bodyType = bodyType;
    }

    @Override
    public void setDriver(DriverB driver) {
        super.setDriver(driver);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }
        System.out.println(bodyType);
    }

    @Override
    public void performDiagnostics() throws CheckDrivers {
        if (this.driver == null) {
            throw new CheckDrivers("Водител нет, автомобиль не прошёл диагностику");
        } else {
            System.out.println(this.driver);
        }
    }
}
