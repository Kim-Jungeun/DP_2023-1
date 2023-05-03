package ch06.Sample.framework;

import java.util.HashMap;
import java.util.Map;
//product라는 부모타입을 이용해서 구현됨
//원칙:programming to interface/abstract class
public class Manager {
    private Map<String,Product> showcase = new HashMap<>();//맵은 인터페이스 해시맵은 인터페이스를 구현하는~~?

    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }

    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName);
        //return p;
        //return p.clone(); 할수는 없을까?->clone메소드는 자기 자신만 호출할수 있기 때문
        return p.createCopy();//복제품을 리턴함
    }
}
