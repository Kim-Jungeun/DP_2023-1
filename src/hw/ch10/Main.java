package hw.ch10;

import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("학번:20210934, 이름:김정은");
        System.out.println("");
        //리스트 생성
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("최승훈", "20210001", 180));
        studentList.add(new Student("김정은", "20210934", 160));
        studentList.add(new Student("박리아", "20210002", 170));
        studentList.add(new Student("장은혜", "20210003", 175));
        studentList.add(new Student("임동현", "20210004", 185));

        // 키 오름차순으로 정렬
        studentList.sort(new ComparatorAscending());
        System.out.println("**(1)정렬결과(오름차순)");
        System.out.print("[");
        for(Student student : studentList) {
            System.out.print(student);
        }
        System.out.println("]");
        // 키 내림차순으로 정렬
        studentList.sort(new ComparatorDesending());
        System.out.println("");
        System.out.println("**(2)정렬결과(내림차순)");
        System.out.print("[");
        for(Student student : studentList) {
            System.out.print(student);
        }
        System.out.print("]");
    }
}
