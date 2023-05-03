package hw.ch05.idcard;
import hw.ch05.framework.Factory;
import hw.ch05.framework.Product;
public class IDCardFactoryKJE2 extends Factory{
    private static IDCardFactoryKJE2 factory2 = null;
    private IDCardFactoryKJE2() {
        System.out.println("인스턴스를 생성했습니다.");
        slowdown();
    }
    public static synchronized IDCardFactoryKJE2 getInstance() {
        if (factory2 == null) {
            factory2 = new IDCardFactoryKJE2();
        }
        return factory2;
    }
    private void slowdown() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
    }
    @Override
    protected IDCard createProduct(String owner) {
        return new IDCard(owner);
    }
    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}