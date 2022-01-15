package com.kurbanov__003;

import java.util.List;
import java.util.Random;

public class Drive implements methods {
    private int id;
    private String driveName;
    private String bus;

    public Drive(int id, String driveName, String bus) {
        this.id = id;
        this.driveName = driveName;
        this.bus = bus;
    }

    public Drive() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDriveName() {
        return driveName;
    }

    public void setDriveName(String driveName) {
        this.driveName = driveName;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(AutoBases bus) {
        this.bus = getBus();
    }

    @Override
    public String toString() {
        return id + "   |" + driveName + "                 |" + bus;
    }

    public static void etap2(List<Drive> drives) {
        drives.stream().forEach(System.out::println);
    }

    @Override
    public void changeDriver(List<AutoBases> autoBases, List<Drive> drives) {
        AutoBases autoBases1 = new AutoBases();
        int count = 0;
        for (int i = 0; i < drives.size(); i++) {
            if (drives.get(i).getBus() != null) {
                count++;
            }
        }
        autoBases1.setDrive(drives.get(count).getDriveName());
        drives.get(count).setBus(autoBases.get(autoBases1.getCarName()));
    }

    @Override
    public void startDriving(AutoBases autoBases) throws Exception {
        if (autoBases.getDrive().equals("")) {
            throw new Exception();
        } else {
            autoBases.setState("Route");
            System.out.println("успешно вышли на маршруt");
        }
    }

    @Override
    public void startRepair(AutoBases autoBases1) {
        autoBases1.setState("Repair");
        System.out.println("repair");
    }

}
