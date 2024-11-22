package day23;


    // 클래스 사용처 :
    // 1. main함수를갖는 실행 클래스
    // 2. 객체 생성하기 위한 객체 설계 클래스
    // 클래스 ( 도면지 / 설계도 ) vs 객체
    public class Board {


    // 클래스 구성멤버
    // 1. 필드
            // 필드는 초기값이 없으면 정수 : 0 실수 0.0 boolean false 참조타입 null
            // 주의 할점 : 일반 지역변수는 초기값이 없으면 쓰레기값이 들어간다.

    private String content;
    private String writer;
    private int pwd;

    // private : 다른클래스에 접근을 차단하는 키워드, 즉 현재 클래스에서만 사용가능
        // 왜? 외부로부터 지정한 필드의 직접접근을 차단하기위해

        //2. 생성자(객체초기화함수) : 객체생성시 new 뒤로 오는 함수
            // 생성자는 클래스명과 이름이 동일해야한다. 동일하지 않으면 함수로 취급된다.
            // - 생성자는 매개변수(외부로 부터 함수안으로 들어오는 값들을 저장하는 변수)가 있지만 반환값 return이 없다
            // 오버로딩 : 동일한 함수명/ 생성자명으로 선언은 불가능 이지만 매개변수의 타입 개수 순서에 따라 식별가능한 함수 선언 방법
        // 2-1 매개변수 없는 기본 생성자
        Board(){}

        Board(String content){ this.content=content;}

        Board(String content, String writer){ this.content =content; this.writer =writer;}

        Board(String content, String writer, int pwd){this.content = content; this.writer= writer; this.pwd=pwd;}

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

        // - setter 함수 ( 필드값 저장함수 ) : private 선언된 필드를 public 함수로 외부 클래스로부터 허용한다.

        public void setContent(String content) {
            this.content = content;
        }

        public void setWriter(String writer) {
            this.writer = writer;
        }

        public void setPwd(int pwd) {
            this.pwd = pwd;
        }

        // -  toString : 객체의 정보를 반환할때 사용되는 함수
        // 재정의 : object 클래스내 tostring 함수를 재정의한다.
        // 원래 tostring함수를 객체의 주소값 반환하는 함수인데
        // 주소값 대신 객체의 필드정보를 출력하기 위해 재정의한다


        @Override
        public String toString() {
            return "Board{" +
                    "content='" + content + '\'' +
                    ", writer='" + writer + '\'' +
                    ", pwd=" + pwd +
                    '}';
        }
    }
