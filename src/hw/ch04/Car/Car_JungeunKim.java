package hw.ch04.Car;

import hw.ch04.framework.Product;

public class Car_JungeunKim extends Product {
    private String modelName;

    Car_JungeunKim(String modelName) {    //모델명을 속성에 저장
        this.modelName = modelName;
    }

    @Override
    public void use() {
        System.out.println("모델명 " + this.modelName + "인 car를 사용합니다.");
    }

    public String getModelName() {
        return modelName;
    }
    @Override
    public String toString() {
        return modelName;
    }
}
