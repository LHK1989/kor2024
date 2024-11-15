package day22;

public class BoardTest {

    private String writer;
    private String content;
    private int pwd;

    public BoardTest() {}

    public BoardTest(String writer, String content, int pwd) {
        this.writer = writer;
        this.content = content;
        this.pwd = pwd;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "BoardTest{" +
                "writer='" + writer + '\'' +
                ", content='" + content + '\'' +
                ", pwd=" + pwd +
                '}';
    }
}
