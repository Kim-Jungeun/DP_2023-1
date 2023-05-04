package ch17.practice;

public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {//관찰 대상이 바뀐것 통지한 후 graphobserver
        System.out.print("GraphObserver:");
        int count = generator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        
        System.out.println("");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
