package ch03.A4;

public interface AbstractDisplay {
    public void open();
    public void print();
    public void close();

    public default void display() {
        open();
        for (int i = 0; i < 5; i++) {//하드코딩.유연성이 떨어짐.
            print();
        }
        close();
    }
}
