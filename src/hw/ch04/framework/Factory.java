package hw.ch04.framework;

public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
//자식이 구체적인 생산 방법을 결정하는 메소드->팩토리 메소드
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
    public abstract void printAllModelNames();
}
