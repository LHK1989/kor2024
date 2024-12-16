package day31.boardservice11mvc.model;

public class BoardDto {

    // - 주로 db의 테이블 필드와 동일하게 사용해도 된다.
    // 왜? dto 결국에는 db에 저장된 데이터를 view까지 이동하는 객체

    // [1] 필드
    private int num;        // 게시물 번호
    private String content; // 게시물 내용
    private String writer;  // 게시물 작성자
    private int pwd;        // 게시물 비밀번호


    // [ 2 ] 생성자, 객체 생성시 초기화를 담당하는 메소드 로써
    // dto 주로 생성시 개발자(본인) 초기화할 필드로 생성자를 구성한다. ( 정답 x ) - > 끝도 없네 -> 빌드패턴
        // - 자동완성 생성자 만들기 : 오른쪽클릭

    public BoardDto(String content, String writer, int pwd) {
        this.content = content;this.writer = writer;this.pwd = pwd;
    }

    // 2 게수물 출력, num ,content , writer

    public BoardDto(int num, String content, String writer) {
        this.num = num;this.content = content;this.writer = writer;
    }

    // 3. 게시물 삭제 , num -- > 객체 필요 없을듯 하다.
    // 4. 게시물 수정 , num, content -->

    public BoardDto(int num, String content) {
        this.num = num;
        this.content = content;
    }


    // [3] 메소드 , dto : 실질적인 기능 역할x , 단순 이동 객체이므로
    // dto 주로 getter, setter, tostring 역할 크다.
        // 자동완성 getter/setter : 오른쪽 클릭


    public int getNum() {return num;}

    public void setNum(int num) {this.num = num;}

    public String getContent() {return content;}

    public void setContent(String content) {this.content = content;}

    public int getPwd() {return pwd;}

    public void setPwd(int pwd) {this.pwd = pwd;}

    public String getWriter() {return writer;}

    public void setWriter(String writer) {this.writer = writer;}

        // 자동완성 , 오른쪽 클릭

    @Override
    public String toString() {
        return "BoardDto{" +
                "num=" + num +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", pwd=" + pwd +
                '}';
    }
}   // class end
