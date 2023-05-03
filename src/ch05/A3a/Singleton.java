package ch05.A3a;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("인스턴스가 생성되었습니다.");
        slowdown();//생성시 시간이 걸리게 하기 위해서 
    }

    // public static Singleton getInstance() {
    public static synchronized Singleton getInstance() {//인스턴스가 하나만 만들어지고 각 스레드가 얻어간 주소가 같은것을 확인 가능. 
        //synchronized가 머길래?->동시에 두개 이상의 스레드가 메소드 안에 들어오지 못하게 막음
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }//반드시 try catch 해줘야함
    }
}
