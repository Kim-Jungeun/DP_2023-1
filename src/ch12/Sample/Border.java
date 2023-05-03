package ch12.Sample;
//장식자를 나타냄
public abstract class Border extends Display {
    //장식대상
    protected Display display;             // 이 장식틀이 감싸는 '내용물'

    protected Border(Display display) { // 인스턴스 생성 시 '내용물'을 인수로 지정
    //추상클래스 안에 생성자가 있잖아요. 그건 장식 대상을 부모쪽에서 담아두기 위해서.
        this.display = display;
    }
}
