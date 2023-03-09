package ch01.practice;

public class Main {
    public static void main(String[] args) {
        //책 생성
        Book b1 = new Book (name: "book1");
        System.out.println(b1.getName());
        //책꽂이 생성
        Bookshelf bs1= new BookShelf(maxsize:10);
        bs1.appendBook(b1);
        Book result bs1.getBookAt(index:0);
        System.out.println(result.getName());
    }
}