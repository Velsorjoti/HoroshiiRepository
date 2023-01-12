package oopNo1;
import drivers.Driver;
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;
import enumpocket.FixType;
import transport.*;

import java.util.*;

public class PoleChudes {

    public static void main(String[] args){
        DriverB destiny = new DriverB("Судьбоносный","Есть",10);
        Automobile ferari = new Automobile( destiny,"Феррари","Ля Ферарри",1000, Automobile.BodyType.COUPE, FixType.C);

        DriverC voditel = new DriverC("Водитель", "Есть", 10);
        Track uaz = new Track(voditel,"Уаз", "Проходимая", 1000, Track.LoadCapacity.N1, FixType.B );

        DriverD vodila = new DriverD("Крокодил","Есть",10);
        Bus buhanka = new Bus(vodila,"Буханочка","Народная",1000, Bus.TypeOfCapacity.SMALL, FixType.D);

        List<Transport> allMashines = new ArrayList<>();
        allMashines.add(ferari);
        allMashines.add(uaz);
        allMashines.add(buhanka);

        List<Driver> allDrivers = new ArrayList<>();
        allDrivers.add(destiny);
        allDrivers.add(voditel);
        allDrivers.add(vodila);

        Mechanics vasilii = new Mechanics("Вася", "Маруся", FixType.B);
        Mechanics petr = new Mechanics("Петя","Маша и Три Медведя", FixType.C);
        Mechanics ivan = new Mechanics("Иван", "Золушка-Металлист", FixType.D);
        Mechanics momsFriendSon = new Mechanics("Сын маминой подруги Барнэби","Газпром", FixType.C, FixType.D, FixType.B);

        List<Mechanics> allMechanics = new ArrayList<>();
        allMechanics.add(vasilii);
        allMechanics.add(petr);
        allMechanics.add(ivan);
        allMechanics.add(momsFriendSon);

        Map<Transport,Mechanics> transportMechanicsMap = new HashMap<>();
        transportMechanicsMap.put(ferari,vasilii);
        transportMechanicsMap.put(uaz,petr);
        transportMechanicsMap.put(buhanka,ivan);
        transportMechanicsMap.put(ferari,vasilii);
        for (Map.Entry<Transport,Mechanics> transportMechanicsEntry: transportMechanicsMap.entrySet()) {
            System.out.println("Ключ " + transportMechanicsEntry.getKey().getBrand() + " : " + transportMechanicsEntry.getValue().getNameMechanic());
        }

        Set<Driver> set = new HashSet<>(allDrivers);
        Iterator<Driver> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getNameDriver());
        }

    }

    public static void terribleMetod(DriverD driverd,Automobile automobile) {
        System.out.println("Водитель" + driverd.getNameDriver() + " управляет" + automobile.getBrand() + " будет участвовать в заезде.");
    }

    public static void  printInfoAuto(Transport transport){
        System.out.println("Машину ведёт " + transport.getDriver() + "механики у неё: " + transport.getMechanic());
    }

}

