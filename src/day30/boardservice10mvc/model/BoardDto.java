package day30.boardservice10mvc.model;

public class BoardDto {
    private String content;
    private String writer;
    private int pwd;
    private int num;

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", pwd=" + pwd +
                ", num=" + num +
                '}';
    }

    public void setNum(int num) {
        this.num = num;
    }

    public BoardDto(String content, String writer, int pwd, int num) {
        this.content = content;
        this.writer = writer;
        this.pwd = pwd;
        this.num = num;
    }

    BoardDto( ){ }
    public BoardDto(String content) {this.content = content;}
    public BoardDto(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }
    public BoardDto(String content, String writer, int pwd) {
        this.content = content;
        this.writer = writer;
        this.pwd = pwd;
    }
    public String getContent() {return content;}
    public String getWriter() {return writer;}
    public int getPwd() {return pwd;}
    public void setContent(String content) {this.content = content;}
    public void setWriter(String writer) {this.writer = writer;}
    public void setPwd(int pwd) {this.pwd = pwd;}
}