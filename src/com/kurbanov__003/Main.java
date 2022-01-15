package com.kurbanov__003;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONObject;
import org.json.JSONArray;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
public static final GsonBuilder BUILDER=new GsonBuilder();
public static final Gson GSON=BUILDER.setPrettyPrinting().create();
public static final Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        List<AutoBases>autoBases=List.of(
                new AutoBases(1,"Honda"," ","On Base"),
                new AutoBases(2,"Damas"," ","On Base"),
                new AutoBases(3,"Lexus"," ","On Base")
        );
        List<Drive>drives=List.of(
                new Drive(1,"Aisuluu"," "),
                new Drive(2,"Nurullo"," "),
                new Drive(3,"Muhamed"," ")
        );

        System.out.println("# | Bus         |  Driver    |  State");
        AutoBases.etap1(autoBases);
        System.out.println("2-et");
        System.out.println("#   |Driver                  |  Bus");
        Drive.etap2(drives);
        AutoBases.etap3( autoBases);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Кайсы метотду кылгыныз келип атат танданыз");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        AutoBases.Counter();
        String data=GSON.toJson(autoBases);
        writeFiles(data);
//        String data1=GSON.toJson(drives);
//        writeFiles(data1);
        AutoBases autoBases1=new AutoBases();
    //    autoBases1.startDriving1(autoBases);

    }
    public static void writeFiles(String json) throws IOException {
        Path writePaths=Paths.get("C:\\Users\\krasa\\IdeaProjects\\HomeWork2\\json2.json");
        try {
            Files.writeString(writePaths, json, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void readFiles(){
        Path readPaths=Paths.get("C:\\Users\\krasa\\IdeaProjects\\HomeWork2\\json2.json");
        try {
            FileReader fileReader=new FileReader(String.valueOf(readPaths));
            int a;
            while ((a= fileReader.read())!=-1){
                System.out.print((char)a);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void JsonFiles() throws IOException {
        String data =new String(Files.readAllBytes(Paths.get("C:\\Users\\krasa\\IdeaProjects\\HomeWork2\\json1.json")));
        JSONArray jsonArray=new JSONArray(data);
        List<AutoBases>autoBases=new LinkedList<>();
        int id;
        String carname,drive,state;
        for (int i = 0; i < jsonArray.length(); i++) {
            String str=jsonArray.get(i).toString();
            JSONObject object=new JSONObject(str);
            id=object.getInt("id");
            carname=object.getString("carName");
            drive=object.getString("drive");
            state=object.getString("state");
            AutoBases autoBases1=new AutoBases(id,carname,drive, state);
            autoBases.add(autoBases1);
        }
    }
    public static void driveJson() throws IOException {
        String data1=new String(Files.readAllBytes(Paths.get("C:\\Users\\krasa\\IdeaProjects\\HomeWork2\\json2.json")));
        JSONArray jsonArray1=new JSONArray(data1);
        List<Drive>drives=new ArrayList<>();
        int id;
        String driverName,bus;
        for (int i = 0; i < jsonArray1.length(); i++) {
            String str2=jsonArray1.get(i).toString();
            JSONObject object2=new JSONObject(str2);
            id=object2.getInt("id");
            driverName=object2.getString("driveName");
            bus=object2.getString("bus");
            Drive drive=new Drive(id,driverName,bus);
            drives.add(drive);
        }
    }

}
