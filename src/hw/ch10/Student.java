package hw.ch10;

class Student implements Comparable<Student>{
        private String name;
        private String id;
        private int height;

        public Student(String name, String id, int height) {
            this.name = name;
            this.id = id;
            this.height = height;
        }
    @Override
    public int compareTo(Student s) {
        if(this.height < s.height) {
            return -1;
        } else if(this.height > s.height) {
            return 1;
        } else {
            return 0;
        }
        //원칙:정렬 주체(List)는 음수가 리턴되면 그대로 두고 양수가 리턴되면 위치를 서로 바꾼다 
        // return ((String)a).compareTo((String)b);
        //String클래스의 compareTo()를 이용해서 크기 비교를 함,.이 타입캐스팅보다 우선순위가 높기떄문에 괄호를 통해 a를 스트링으로 바꿔줌
        //return a.compareTo(b);
        //a-b실행
        //a가 작을떄는 음수가 리턴됨,a가 클때는 양수가 리턴됨
        //a가 더 클때 위치를 서로 바꾼다->큰걸 뒤로 보낸다->오름차순이 된다
    }
    @Override//tostring은 부모에 없는데 왜..?->최상단 클래스인 object클래스로부터 상속 받기 때문!
    public String toString() {
        return "(이름:" + name +",학번:"+id+",키:"+height+ ")";
    }
    
}
