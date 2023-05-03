package hw.ch11;

public class Main {
    public static void main(String[]args){
        System.out.println("(학번:20210934, 이름:김정은)");
        Directory root=new Directory("MyDocuments","20230401","JungeunKim");//root디렉토리 만들기

        root.add(new File("김정은0.doc","20230501",1000,"JungeunKim"));
        Directory bin=new Directory("MyData","20230401","JungeunKim");//디렉토리 만들기
        root.add(bin);
        //root밑에 자식으로 추가하기 
        //컴파일러 입장에서는 변수의 타입이 실제 들어가있는 객체보다 중요하다.->root에 add호출 불가함.
        //((Directory)root).add(bin);.이 우선순위가 높아서 괄호쳐줌
        
        //파일 객체 만들어 bin아래에 추가하기
        bin.add(new File("김정은1.doc","20230501",2000,"JungeunKim"));
        bin.add(new File("김정은2.java","20230501",3000,"JungeunKim"));
        Directory usr=new Directory("MyPictures","20230401","JungeunKim");//디렉토리 만들기)
        bin.add(usr);
        
        //파일 객체 만들어 usr아래에 추가하기
        usr.add(new File("김정은3.gif","20230501",4000,"JungeunKim"));
        usr.add(new File("김정은4.jpg","20230501",5000,"JungeunKim"));
        usr.add(new File("김정은5.png","20230501",6000,"JungeunKim"));

        //System.out.println(root.getSize());
        root.printList();
    }
}
