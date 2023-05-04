package hw.ch12;

import java.nio.charset.StandardCharsets;

public class StringDisplay extends Display {
    private String string; // 표시 문자열 
    private int columns=0;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        // return string.getBytes(StandardCharsets.UTF_8).length;
        return string.length();
    }

    @Override
    public int getRows() {
        return 1; // 행수는 1
    }

    @Override
    public String getRowText(int row) {
        if (row != 0) {
            throw new IndexOutOfBoundsException();
        }
        return string;
    }
}
