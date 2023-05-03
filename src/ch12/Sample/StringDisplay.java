package ch12.Sample;
//중심을 나타내는 클래스
public class StringDisplay extends Display {
    private String string; // 표시 문자열 

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        return string.length();
    }

    @Override
    public int getRows() {
        return 1; // 행수는 1, 한줄짜리 가지는애라서
    }

    @Override
    public String getRowText(int row) {
        if (row != 0) {
            throw new IndexOutOfBoundsException();//예외 객체 생성하여 클라이언트에게 throw
        }
        return string;
    }
}
