package com.kurbanov__003;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AutoBases {
    private int id;
    private String carName;
    private String drive;
    private String state;

    public AutoBases() {
    }

    public AutoBases(int id, String carName, String drive, String state) {
        this.id = id;
        this.carName = carName;
        this.drive = drive;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarName() {
        return 0;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public String getState() {
        return state;
    }

    public AutoBases setState(String state) {
        this.state = state;
        return null;
    }

    @Override
    public String toString() {
        return id + "  | " + carName  + "       |            |"+                    state
                ;
    }
    public static void etap1( List<AutoBases>autoBases){
        for (AutoBases a:autoBases) {
            System.out.println(a);
        }
    }
    public static void etap3(List<AutoBases>autoBases1){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Кайсы машина жонундо маалымат алгыныз келип атат Idси мн танданыз");
        int a1=scanner.nextInt();
        for (AutoBases a:autoBases1) {
            if (a.getId()==a1){
                System.out.println("  id      |"+  a.getId());
                System.out.println("carName   |"+a.carName);
                System.out.println("drive     |"   +a.getDrive());
                System.out.println("states    |"+a.getState());
        } else if (a.id==a1) {
                System.out.println("id        |"+a.id);
                System.out.println("carName   |"+a.carName);
                System.out.println("drive     |"+a.getDrive());
                System.out.println("states    |"+a.getState());
            }else if (a.id==a1){
                System.out.println("id        |"+a.id);
                System.out.println("carName   |"+a.carName);
                System.out.println("drive     |"+a.getDrive());
                System.out.println("states    |"+a.getState());
            }
            }
    }
    public static void Counter(){
        System.out.println("Сменить водителя - changeDriver");
        System.out.println("Отправить на маршрут - startDriving");
        System.out.println("Отправить на ремонт - startRepair");
    }
    public void startDriving1(List<AutoBases>autoBases) {
        Random random = new Random();
        int randomNum = random.nextInt(2);
        if(randomNum==0){
            autoBases.set(1,setState("Base"));
            System.out.println();
        }else {
            System.out.println();
        }
    }
}
