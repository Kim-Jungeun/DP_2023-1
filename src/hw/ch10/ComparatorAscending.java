package hw.ch10;

import java.util.Comparator;

    public class ComparatorAscending implements Comparator<Student>{

    @Override
    // public int compare(Object a, Object b) {
        public int compare(Student s1, Student s2) {
        //원칙:정렬 주체(List)는 음수가 리턴되면 그대로 두고 양수가 리턴되면 위치를 서로 바꾼다 
        // return ((String)a).compareTo((String)b);
        //String클래스의 compareTo()를 이용해서 크기 비교를 함,.이 타입캐스팅보다 우선순위가 높기떄문에 괄호를 통해 a를 스트링으로 바꿔줌
        return s1.compareTo(s2);
        //a-b실행
        //a가 작을떄는 음수가 리턴됨,a가 클때는 양수가 리턴됨
        //a가 더 클때 위치를 서로 바꾼다->큰걸 뒤로 보낸다->오름차순이 된다
    }
    
}
