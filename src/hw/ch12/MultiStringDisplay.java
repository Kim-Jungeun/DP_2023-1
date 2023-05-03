package hw.ch12;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {
    // 표시 문자열 저장 장소
    private List<String> body = new ArrayList<>();
    // 표시 문자열 최대 문자 수 
    private int columns = 0;

    // 문자열 추가 
    public void add(String msg) {
        body.add(msg);
        if (columns < msg.length()) {//현재 더 긴 문자열이 추가된다면..
            // 최대 문자 수 갱신
            columns = msg.length();
        }
        updatePadding();//짧은거에 문자를 더 붙여서 전체적인 길이를 같게 만들어줌
    }

    @Override
    public int getColumns() {
        return columns;
    }

    @Override
    public int getRows() {
        return body.size();
    }

    @Override
    public String getRowText(int row) {
        return body.get(row);
    }

    // 표시 문자열 오른쪽 끝에 채울 공백을 필요에 따라 늘린다
    private void updatePadding() {
        for (int row = 0; row < body.size(); row++) {
            String line = body.get(row);
            int padding = columns - line.length();
            //패딩이라는 변수가 몇개의 빈칸을 채울지를 계산해줌(전체길이-묹ㅏ열길이)
            if (padding > 0) {
                body.set(row, line + spaces(padding));
            }
        }
    }

    // count 수만큼의 공백을 만든다 
    private String spaces(int count) {
        StringBuilder spaces = new StringBuilder();
        for (int i = 0; i < count; i++) {
            spaces.append(' ');
        }
        return spaces.toString();
    }
}
