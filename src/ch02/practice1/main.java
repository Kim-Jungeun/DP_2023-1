package ch02.practice1;

public class main {
    public static void main(String[] args) {
        //banner 이용하기
        //banner를 클라이언트가 직접 사용하지 못하는 경우를 가정해보자.->어댑터 이용하는 경우와 배너 이용하는 경우 둘다 모두 결과는 같음
        Banner b=new Banner("kje");
        b.showWithParen();
        b.showWithAster();
        
        //어댑터를 이용하기 
        //banner클래스를 수정해도 클라이언트는 영향을 안받는다.
        Print x=new PrintBanner("kje");//어댑터 생성.프리ㄴ트에 클라이언트가 원하는 인터페이스 지정되어잇음
        x.printWeak();
        x.printStrong();
    }

    
}
