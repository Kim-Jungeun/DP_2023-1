package hw.ch05;
import hw.ch05.idcard.IDCardFactoryKJE2;

public class Main2 extends Thread{
    public static void main(String[] args){
        System.out.println("20210934 김정은");
        new Main2("최승훈").start();//스레드의 run을 자동으로 실행함
        new Main2("김정은").start();
        new Main2("현유나").start();
    }
    @Override
    public void run() {
        IDCardFactoryKJE2 obj = IDCardFactoryKJE2.getInstance();//동시에 3개의 스레드가 get instance호출함_>singleton을 멀티스레드에서는 하면 안된다
        System.out.println(getName() + ": obj = " + obj);//obj에는 주소가 들어있음.출력 순서는 돌릴때마다 달라진다?
    }

    public Main2(String name) {
        super(name);
    }
        // //1.신분증 생산(직접)
        // Product id01= new IDCard("kje1");
        // id01.use();

        // //2.신분증 생산(공장을 통해서)
        // Factory f= new IDCardFactory();
        // Product id02 = f.create("kje2");
        // id02.use();
}

