package hw.ch12;

public class Main {
    public static void main(String[] args) {
        System.out.println("(학번:20210934, 이름:김정은)");

        MultiStringDisplay md = new MultiStringDisplay();

        md.add("학번: 20210934");
        md.add("이름: 김정은");
        md.add("핸드폰 번호: 010-2928-3028");


        Display d2 = new FullBorder(md);

        Display d3 = new UpDownBorder(d2,"=");

        Display d4 = new MultiSideBorder(d3,'*',3);
        d4.show();
        
    }
}
