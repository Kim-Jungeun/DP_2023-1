package ch06.Sample;

import ch06.Sample.framework.Product;

public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int decolen = 1 + s.length() + 1;
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();//줄바꾸기

        System.out.println(decochar + s + decochar);//가운데 줄

        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {//자기를 복제하는 메소드.호출하면 복제품이 리턴됨
        Product p = null;
        try {
            p = (Product)clone();//clone:실제로 복제품을 만드는 메소드.object에 있음..cloneable인터페이스를 구현한 메소드만 clone이용가능함
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;//p에 담아서 리턴함
    }
}
