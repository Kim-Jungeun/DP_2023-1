package hw.ch03;

public abstract class AbstractDisplay {
    // open, print, close는 하위 클래스에 구현을 맡기는 추상 메소드 
    public abstract void open();
    public abstract void print();
    public abstract void close();

    // display는 AbstractDisplay에서 구현하는 메소드 
    public final void display(int times) {//구상메소드. 구현되어 있는 메소드 안에서 이용되는건 모두 추상 메소드. 큰 틀을 제공함함
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
