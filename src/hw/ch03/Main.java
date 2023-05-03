package hw.ch03;


public class Main {
    public static void main(String[] args){
        System.out.println("20210934 김정은");
        AbstractDisplay a;
        a = new KimJungEunDisplay("김정은", "20210934", 3);
        a.open();
        a.print();
        a.close();

        a.display(5);
    }
    
}
