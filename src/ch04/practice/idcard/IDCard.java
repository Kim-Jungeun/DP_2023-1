package ch04.practice.idcard;

import ch04.practice.framework.Product;

public class IDCard extends Product {
    private String owner;

    //같은 패키지에서만 호출 가능한 package visability
    //IDCard(String owner) {
    public IDCard(String owner) {
        //아무것도 안하면 부모의 인자 없는 생성자가 자동으로 호출됨

        //명시적으로 부모의 인자 있는 생성자를 호출하고 싶으면 첫줄에 super()를 호출해야한다. 
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {//product에서 선언한 use를 구현함
        System.out.println(this + "을 사용합니다.");
        //이떄는 +기호가 문자열 연결에 사용됨.여기서는 this가 문자열이 아니기 떄문에 this.tostring이 자동으로 호출되게 됨.
    }

    @Override//tostring은 부모에 없는데 왜..?->최상단 클래스인 object클래스로부터 상속 받기 때문!
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
