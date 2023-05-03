package ch05.A2a;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Triple {
    private static Map<String,Triple> map = new HashMap<>();
    //클래스 로드시 실행할 코드
    static {
        String[] names = { "ALPHA", "BETA", "GAMMA" };//알파베타감마를 어레이로 만듦
        //스트림을 생성->각각의 원소에 대해 해시맵에 넣음. 
        //s가 바로 원소를 의미,key는 알파베타감마 이름, value는 triple
        Arrays.stream(names).forEach(s -> map.put(s, new Triple(s)));
    }

    private String name;

    private Triple(String name) {
        System.out.println("The instance " + name + " is created.");
        this.name = name;
    }

    public static Triple getInstance(String name) {
        return map.get(name);//해시맵에서 해당 이름의 triple객체를 얻어와서 반환함
    }

    @Override
    public String toString() {
        return this.name;
    }
}
