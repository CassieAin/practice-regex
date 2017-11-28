package model;

import java.util.ArrayList;

public class Journal {
    public static ArrayList<Record> records = new ArrayList<Record>();

    public static void displayRecords(){
        for(Record record : records) {
            System.out.println(record);
        }
    }

    public static void addRecord(Record newRecord){
        if(newRecord != null){
            records.add(newRecord);
        }
    }

    public static ArrayList<Record> getRecords() {
        return records;
    }

    public static void setRecords(ArrayList<Record> records) {
        Journal.records = records;
    }
}
