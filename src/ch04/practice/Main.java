package ch04.practice;

import ch04.practice.idcard.IDCardFactory;
import ch04.practice.framework.Factory;
import ch04.practice.framework.Product;
import ch04.practice.idcard.IDCard;

public class Main {
    public static void main(String[] args){
        //1.신분증 생산(직접)
        Product id01= new IDCard("kje1");
        id01.use();

        

        //2.신분증 생산(공장을 통해서)
        Factory f= new IDCardFactory();
        Product id02 = f.create("kje2");
        id02.use();
    }
}
