package ch10.Q4;

import java.util.Comparator;

// public class ComparatorDesending implements Comparator{
    public class ComparatorDesending implements Comparator<String>{

    @Override
    // public int compare(Object a, Object b) {
        public int compare(String a, String b) {
        // return ((String)b).compareTo((String)a);
        return b.compareTo(a);
        //b가 더 클떄 양수가 반환됨->뒤에 있는것이 더 클때 위치를 서로 바꿈
        //뒤에 있는게 앞으로 옴->내림차순
    }
    
}
