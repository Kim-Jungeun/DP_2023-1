package ch01.practice;//book이 어느 패키지 안에 속하는지 알 수 있음

public class Book {
    //속성
    private String name="";

    //메소드
    public Book(String name) {
        this.name = name;
    }


    public String getName(){
        return name;
    }
    
}