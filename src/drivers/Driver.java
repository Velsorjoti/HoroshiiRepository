package drivers;

public class Driver {

    protected String nameDriver;
    protected String presencdriverslicense;
    protected int experience;

    public Driver(String nameDriver, String presencdriverslicense, int experience) {
        if (nameDriver == null || nameDriver.length() == 0) {
            System.out.println("Вы ввели неправильные данные, попробуйте ещё.");
        } else {
            this.nameDriver = nameDriver;
        }
        if (nameDriver == null || nameDriver.length() == 0) {
            System.out.println("Вы ввели неправильные данные, попробуйте ещё.");
        } else {
            this.presencdriverslicense = presencdriverslicense;
        }
        if (experience < 0) {
            System.out.println("Вы вели ошибочные данные");
        } else if (experience == 0) {
            System.out.println("Водитель - новичок");
        } else
            this.experience = experience;
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public void setNameDriver(String nameDriver) {
        if (nameDriver == null || nameDriver.length() == 0) {
            System.out.println("Вы ввели неправильные данные, попробуйте ещё.");
        } else {
            this.nameDriver = nameDriver;
        }
    }

    public String getPresencdriverslicense() {
        return presencdriverslicense;
    }

    public void setPresencdriverslicense(String presencdriverslicense) {
        if (nameDriver == null || nameDriver.length() == 0) {
            System.out.println("Вы ввели неправильные данные, попробуйте ещё.");
        } else {
            this.presencdriverslicense = presencdriverslicense;
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience < 0) {
            System.out.println("Вы вели ошибочные данные");
        } else if (experience == 0) {
            System.out.println("Водитель - новичок");
        } else
            this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "nameDriver='" + nameDriver + '\'' +
                ", presencdriverslicense='" + presencdriverslicense + '\'' +
                ", experience=" + experience +
                '}';
    }

    public void startDrive() {
        System.out.println("Вперёд!");
    }

    public void stopDrive() {
        System.out.println("Стоп");
    }

    public void refuelCar() {
        System.out.println("Заправляет машину");
    }

}
