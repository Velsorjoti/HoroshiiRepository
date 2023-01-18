package transport;

import drivers.DriverC;
import drivers.DriverD;
import enumpocket.FixType;

public class Track extends Transport<DriverC> {
    public enum LoadCapacity {
        N1(null, 3.5f),
        N2(3.5f, 12f),
        N3(12f, null);
        Float from;
        Float to;

        LoadCapacity(Float from, Float to) {
            this.from = from;
            this.to = to;

        }

        public Float getFrom() {
            return from;
        }

        public void setFrom(Float from) {
            this.from = from;
        }

        public Float getTo() {
            return to;
        }

        public void setTo(Float to) {
            this.to = to;
        }

        @Override
        public String toString() {
            if (from == null) {
                return "LoadCapacity{ " +
                        "to= " + to +
                        '}';
            } else if (to == null) {
                return "LoadCapacity{" +
                        "from=" + from +
                        '}';
            }
            return "LoadCapacity{" +
                    "from=" + from +
                    ", to=" + to +
                    '}';


        }
    }

    private LoadCapacity loadCapacity;

    public static DriverC driver;

    public Track(DriverC driver, String brand, String model, int engineCapacity, LoadCapacity loadCapacity, FixType fixType, Mechanics...mechanics) {
        super(driver, brand, model, engineCapacity, fixType,mechanics);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(loadCapacity);
        }
    }

    @Override
    public void performDiagnostics() throws CheckDrivers{
        if (Track.driver == null) {
            throw new CheckDrivers("Водител нет, автомобиль не прошёл диагностику");
        } else {
            System.out.println(Track.driver);
        }
    }
}