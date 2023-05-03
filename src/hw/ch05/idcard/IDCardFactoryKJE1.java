package hw.ch05.idcard;
import hw.ch05.framework.Factory;
import hw.ch05.framework.Product;

public class IDCardFactoryKJE1 extends Factory{
    private static IDCardFactoryKJE1 factory1 = new IDCardFactoryKJE1();
    private IDCardFactoryKJE1(){
        // System.out.println("IDCard가 생성되었습니다");
        }
        @Override
    protected IDCard createProduct(String owner) {
        return new IDCard(owner);
    }
    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
        public static IDCardFactoryKJE1 getInstance(){
            return null;
            }
        }