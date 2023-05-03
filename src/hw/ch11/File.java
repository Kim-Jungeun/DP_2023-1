package hw.ch11;
//leaf node에 해당됨. 자기 밑에 뭐 가질수 없음
public class File extends Entry {
    private String name;
    private String date;
    private int size;
    private String author;

    public File(String name, String date, int size, String author) {
        this.name = name;
        this.date = date;
        this.size = size;
        this.author = author;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    public int getCount() {
        return 1;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
