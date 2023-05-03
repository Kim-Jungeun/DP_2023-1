package ch10.practice;


public class Main {
    public static void main (String[] args){
    //바위
    Hand h1 =Hand.ROCK;
    System.out.println(h1.toString());
    //가위
    Hand h2=Hand.getHand(1);
    System.out.println(h2);
    //h1과 h2중 누가 이기나 해보기 
    if(h1.isStrongerThan(h2)){
        System.out.println("h1이 h2보다 쎼다");
    }else if(h1.isWeakerThan(h2)){
        System.out.println("h1이 h2보다 약하다");
    }else{
        System.out.println("무승부");
    }
    Strategy s1=new WinningStrategy(100);
    Hand h3=s1.nextHand();
    System.out.println(h3);//어떤 손이 만들어졌는지 확인하기
    s1.study(true);
    Hand h4=s1.nextHand();
    System.out.println(h4);//가위내서 이긴걸 알려주고 다시 가위가 나오게 만듦
    }
    //게임진행
    //1.플레이어생성
    //2.게임시작
}
