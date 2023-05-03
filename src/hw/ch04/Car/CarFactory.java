package hw.ch04.Car;
import java.util.Vector;
import java.util.Iterator;
import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class CarFactory extends Factory {
    private Vector<String> modelNames = new Vector<>();

    @Override
    protected Product createProduct(String modelName) {
        return new Car_JungeunKim(modelName);
    }

    @Override
    protected void registerProduct(Product product) {
        String modelName = ((Car_JungeunKim) product).getModelName();
        modelNames.add(modelName); // 입력 인자인 product의 모델명을 modelNames에 추가
    }
    @Override
    public void printAllModelNames(){
        Iterator<String> iterator = modelNames.iterator(); 
        // Vector 클래스가 제공하는 iterator를 얻어옴
        while(iterator.hasNext()) { 
            // iterator의 hasNext() 와 next() 메소드를 이용해서 모델 이름들을 출력
            System.out.println(iterator.next());
        }
    }
    
}
