package hw.ch02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("20210934 김정은");
        FileIO f = new FileProperties();//어댑터생성
        try {
            f.readFromFile("file.txt");
            f.setValue("year", "2023");
            f.setValue("bornyear", "2001");
            f.setValue("studentid", "20210934");
            f.setValue("name", "Kimjungeun");
            f.setValue("location", "Seoul");

            f.writeToFile("kimjungeun.txt");
            System.out.println("kimjungeun.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
