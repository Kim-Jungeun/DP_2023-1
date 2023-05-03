package ch12.Sample;
//장식대상(내용물)을 나타내는 클래스
public abstract class Display {
    public abstract int getColumns();           	// 가로 문자 수를 얻는다
    public abstract int getRows();              	// 세로 행수를 얻는다
    public abstract String getRowText(int row); 	// row행째 문자열을 얻는다

    // 모든 행을 표시한다
    public void show() {//큰틀을 제공하는 탬플릿 메소드
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
