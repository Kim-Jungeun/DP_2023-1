package ch02.practice1;

//어댑터(상속을 이용한)
//타겟 인터페이스를 구현함 (implements에서 타겟인터페이스 제공) 부모인 배너 상속받음
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {//생성자
        super(string);//super는 부모를 의미,부모생성자
    }

    @Override//메소드 이름이 변환된다고 정의할 수 있음.
    public void printWeak() {//12볼트
        showWithParen();//220볼트
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
