package hw.ch05;
import hw.ch05.idcard.IDCardFactoryKJE1;


public class Main1 {
    public static void main(String[] args){
        System.out.println("20210934 김정은");
        IDCardFactoryKJE1 factory1 = IDCardFactoryKJE1.getInstance();
        IDCardFactoryKJE1 factory2 = IDCardFactoryKJE1.getInstance();
        if (factory1 == factory2) {
            System.out.println("factory1과 factory2는 같은 인스턴스입니다.");
        } else {
            System.out.println("factory1과 factory2는 같은 인스턴스가 아닙니다.");
        }
    }
}
