package ch05.A3a;

public class Main extends Thread {
    // main이 thread클래스 된다는 말
    public static void main(String[] args) {
        System.out.println("Start.");
        //스레드객체가 3개 생성하고 각각 시작시킴
        new Main("A").start();//스레드의 run을 자동으로 실행함
        new Main("B").start();
        new Main("C").start();
        System.out.println("End.");
    }

    @Override
    public void run() {
        Singleton obj = Singleton.getInstance();//동시에 3개의 스레드가 get instance호출함_>singleton을 멀티스레드에서는 하면 안된다
        System.out.println(getName() + ": obj = " + obj);//obj에는 주소가 들어있음.출력 순서는 돌릴때마다 달라진다?
    }

    public Main(String name) {
        super(name);
    }
}
