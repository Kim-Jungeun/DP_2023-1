package ch06.Sample;

import ch06.Sample.framework.Manager;
import ch06.Sample.framework.Product;

public class Main {
    public static void main(String[] args) {
        // 준비 
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        UnderlinePen pen1 = new UnderlinePen('$');
        pen1.use("Jungeun");


        // 등록 
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        manager.register("dollar pen", pen1);//이름과 프로덕트객체


        // 생성과 사용.클래스 이름 없이 객체를 얻을 수 있음.
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");//매니저에게 앞서 등록한걸 달라고 하는과정.매니저는 등록된 객체를 복제한것을 리턴해준다.

        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");

        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");

        Product p4 = manager.create("dollar pen");
        p4.use("Hello, Jungeun.");
    }
}
