package ch05.practice;

public class Main {
    public static void main(String[] args){
        Singleton x1 = Singleton.getInstance();
        Singleton x2 = Singleton.getInstance();
        if (x1==x2){//객체변수에 같은 주소가 들어있음을 확인할 수 있음.
            System.out.println("x1과 x2는 같은 인스턴스 입니다.");
        }else{
            System.out.println("x1과 x2는 다른 인스턴스 입니다.");
        }
    }
    
}
