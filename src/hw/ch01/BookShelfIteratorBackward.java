package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIteratorBackward implements Iterator<Book>{
    private BookShelf bookShelf;
    private int index;

    public BookShelfIteratorBackward(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = bookShelf.getLength()-1;//인덱스가 마지막책 가리킴
    }

    @Override
    public boolean hasNext() {
        if (index >=0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }//다음원소가 없으면 예외발생
        Book book = bookShelf.getBookAt(index);
        index--;//꺼내올때마다 인덱스가 하나씩 줄어든다 
        return book;
    }
}


