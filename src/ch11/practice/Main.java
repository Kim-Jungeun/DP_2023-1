package ch11.practice;

public class Main {
    public static void main(String[]args){
        Directory root=new Directory("root");//root디렉토리 만들기

        Directory bin=new Directory("bin");//디렉토리 만들기
        Directory tmp=new Directory("tmp");//디렉토리 만들기
        Directory usr=new Directory("usr");//디렉토리 만들기
        //root밑에 자식으로 추가하기 
        //컴파일러 입장에서는 변수의 타입이 실제 들어가있는 객체보다 중요하다.->root에 add호출 불가함.
        //((Directory)root).add(bin);.이 우선순위가 높아서 괄호쳐줌
        root.add(bin);
        root.add(tmp);
        root.add(usr);
        //파일 객체 만들어 bin아래에 추가하기
        bin.add(new File("vi",100));
        bin.add(new File("latex",200));
        
        System.out.println(root.getSize());
        root.printList();
    }
}
