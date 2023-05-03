package ch02.practice1;
//220볼트에 해당됨. 즉 이미 제공되는 클래스(adaptee)
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }//paren이 ()

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
