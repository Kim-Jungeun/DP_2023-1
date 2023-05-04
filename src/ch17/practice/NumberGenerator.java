package ch17.practice;

import java.util.ArrayList;
import java.util.List;
//관찰대상. 추상 클래스라 일부 메소드가 구현되어있음.
public abstract class NumberGenerator {
    // Observer를 저장한다  
    private List<Observer> observers = new ArrayList<>();

    // Observer를 추가한다 
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Observer를 제거한다 
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    // Observer에 통지한다 
    public void notifyObservers() {
        //확장된 for문. : 오른쪽에 항상 콜렉션 변수가, 왼족엔 원소 하나를 나타내는 변수가. 
        for (Observer o: observers) {
            o.update(this);
        }
    }

    // 수를 취득한다 
    public abstract int getNumber();

    // 수를 생성한다 
    public abstract void execute();
}
