package oopNo1;
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;
import transport.Automobile;
import transport.Bus;
import transport.Track;

public class PoleChudes {

    public static void main(String[] args){
        DriverB a = new DriverB("Судьбоносный","Есть",10);
        Automobile ferari = new Automobile( a,"Феррари","Ля Ферарри",1000, Automobile.BodyType.COUPE);
        terribleMetod(a,ferari);
        ferari.printType();
        DriverC voditel = new DriverC("Водитель", "Есть", 10);
        Track uaz = new Track(voditel,"Уаз", "Проходимая", 1000, Track.LoadCapacity.N1 );
        uaz.printType();
        DriverD vodila = new DriverD("Крокодил","Есть",10);
        Bus buhanka = new Bus(vodila,"Буханочка","Народная",1000, Bus.TypeOfCapacity.SMALL);
        buhanka.printType();
        try {
            uaz.performDiagnostics();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void terribleMetod(DriverB driverB, Automobile automobile) {
        System.out.println("Водитель" + driverB.getNameDriver() + " управляет" + automobile.getBrand() + " будет участвовать в заезде.");
    }
}

