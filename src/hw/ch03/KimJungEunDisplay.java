package hw.ch03;

public class KimJungEunDisplay extends AbstractDisplay {
    private String name; // 표시해야 하는 문자 
    private String studentid;
    private int grade;

    // 생성자 
    public KimJungEunDisplay(String name,String studentid,int grade) {
        this.name= name;
        this.studentid=studentid;
        this.grade=grade;
    }

    @Override
    public void open() {
        // 시작 문자열 "<<"를 표시한다
        System.out.println("====================");
        System.out.println("덕성여대 IT미디어공학과");
    }

    @Override
    public void print() {
        // 필드에 기억해 둔 문자를 1회 표시한다 
        System.out.printf("학번 %s/",studentid);
        System.out.printf("%d학년/",grade);
        System.out.println(name);
    }

    @Override
    public void close() {
        // 종료 문자열 ">>"를 표시한다 
        System.out.println("템플릿 메소드 패턴 숙제입니다.");
        System.out.println("====================");
    }
}
