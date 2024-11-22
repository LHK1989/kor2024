package day25.BoardService9mvc.model;

public class BoardDto {

    private String content;
    private String writer;
    private int pwd;

    BoardDto(){}

    public BoardDto(String content){ this.content=content;}

    public BoardDto(String content, String writer){ this.content =content; this.writer =writer;}

    public BoardDto(String content, String writer, int pwd){this.content = content; this.writer= writer; this.pwd=pwd;}

    // 2. 생성자

    // 3. 메소드
    // - getter 함수 ( 필드값 호출함수 ) : private 선언된 필드를 public 함수로 외부클래스로부터 간접접근을 허용한다

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public int getPwd() {
        return pwd;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Board{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", pwd=" + pwd +
                '}';
    }
}
