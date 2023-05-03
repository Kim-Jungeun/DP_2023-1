package ch02.practice2;

import ch02.Sample1.Print;

//어댑터(위임을 이용)
public class PrintBanner extends Print {
    //어댑티(banner)를 가리키는 변수가 존재해야함
    private Banner banner;
    private String string;
    public PrintBanner(String string){
        this.string=string;
        banner=new Banner(string);
    }
    @Override
    public void printStrong(){//12볼트
        banner.showWithAster();//어댑티의 220볼트 호출(위임)
    }
    @Override
    public void printWeak(){
        banner.showWithParen();
    }
}
