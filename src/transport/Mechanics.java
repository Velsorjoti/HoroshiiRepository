package transport;

import enumpocket.FixType;

import java.util.*;

public class Mechanics {

    private String nameMechanic;
    private String company;
    private List<FixType> fixTypes;

    public Mechanics(String nameMechanic, String company, FixType...fixType) {
        this.nameMechanic = nameMechanic;
        this.company = company;
        this.fixTypes = new ArrayList<>();
        Collections.addAll(this.fixTypes,fixType);
    }
    public void fixCar(Transport...transports){
        for(Transport transport: transports )
        if(fixTypes.contains(transport.getFixType())) {
            System.out.println("Чиню автомобиль, честно-честно");
        } else {
            System.out.println("Не могу чинить");
        }
    }

    public void performMaintenance(Transport...transports) throws CheckDrivers{
        for (Transport transport:transports) {
            if(fixTypes.contains(transport.getFixType())) {
                transport.performDiagnostics();
            } else
                System.out.println("Не могу провести диагностику.");
        }
    }

    public String getNameMechanic() {
        return nameMechanic;
    }

    public void setNameMechanic(String nameMechanic) {
        this.nameMechanic = nameMechanic;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<FixType> getFixTypes() {
        return fixTypes;
    }

    public void setFixTypes(List<FixType> fixTypes) {
        this.fixTypes = fixTypes;
    }

    @Override
    public String toString() {
        return "Mechanics{" +
                "nameMechanic='" + nameMechanic + '\'' +
                ", company='" + company + '\'' +
                ", fixTypes=" + fixTypes +
                '}';
    }
}
