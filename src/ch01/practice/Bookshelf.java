package ch01.practice;
import java.util.Iterator;
import java.util.List

public class BookShelf implements Iterable<Book>{
    //private Book[] books;//배열을 선언한것, 변수이름을 복수로 하는게 좋아요
    private List<Book> books=new ArrayList<Book>();
    private int last=0;//마지막에 꽂힌 위치

    public BookShelf(int maxsize) {
        //생성자를 통해 배열을 생성한것 
        this.books = new Book[maxsize];//maxsize통해 조금 더 일반적인 코드 작성 가능

    }
    //책 꽂는 메소드
    public void appendBook(Book book){
        books[last]=book;//배열의 i번째에 책 꽂기
        last++;
    }
    //책 가져오는 메소드
    public Book getBookAt(int index){//public Book getBookFrom(int index){
        return books[index];//인덱스 위치의 책을 꺼내옴
    }
    //책갯수반환 매소드
    public int getLength(){
        return last;
    }
    //자신의 iterator를 반환하는 메소드
    @Override
    //public BookShelfIterator iterator(){
    public Iterator<Book> iterator()
        return new BookShelfIterator(this);
        //return new BookShelfIteratorBackward(this);
    }
}
