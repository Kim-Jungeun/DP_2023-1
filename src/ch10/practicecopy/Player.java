package ch10.practicecopy;
public class Player {
    private String name="";
    private Strategy strategy;//현재 전략을 보관(부모타입으로 선언돼서 자식중에 어떤거든 가질수 있다)
    private int wincount=0;
    private int losecount=0;
    private int gamecount=0;

    // 이름과 전략을 받아서 플레이어를 만든다 
    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    // 전략에 따라 다음 손을 결정한다
    public Hand nextHand() {
        return strategy.nextHand();//현재 전략 객체에게 위임한다
    }

    // 승리
    public void win() {
        strategy.study(true);//현재 전략 객체에게 ㅇㄹ려줌
        wincount++;
        gamecount++;
    }

    // 패배
    public void lose() {
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    // 무승부 
    public void even() {
        gamecount++;
    }

    @Override
    public String toString() {//플레이어에 문자열이 필요할떄 자동호출됨
        return "["
            + name + ":"
            + gamecount + " games, "
            + wincount + " win, "
            + losecount + " lose"
            + "]";
    }
    //전략 교체 메소드 
    public void setStrategy(Strategy s) {
        this.strategy = s;//s를 받아와서 자기 속성에 담아둠. 누구든지 이거 호출하면 전략 바뀜
    }
}
