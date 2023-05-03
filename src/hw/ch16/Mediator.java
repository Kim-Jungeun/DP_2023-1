package hw.ch16;

public interface Mediator {//중재자 역할을 하는 인터페이스
    // Colleague를 생성한다 
    public abstract void createColleagues();

    // Colleage의 상태가 변화했을 때 호출된다(보고받을때)
    public abstract void colleagueChanged();
}
