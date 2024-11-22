package day23.BoardService8mvc.model;

import java.util.ArrayList;

public class BoardDao {
    private static BoardDao boardDao = new BoardDao();
    private BoardDao(){}
    public static BoardDao getInstance(){
        return boardDao;
    }

    ArrayList<BoardDto> boardDB = new ArrayList<>();

    // 1. 게시물 등록 접근 함수
    public boolean boardWrite( BoardDto boardDto){
        boardDB.add( boardDto );
        return true;
    }

    // 2. 게시물 출력 접근 함수
    public  ArrayList<BoardDto> boardPrint(){
        return boardDB;


    }
}
/*
- 강의내 boardservice8mvc패키지 코드를 재사용하여 프로그램내 출력기능을 MVC 구조로 완성하시오.
   - 조건 : 코드흐름은 무조건 V --> C --> M(DAO)  또는  M(DAO) ---> C --> V 로 한다. 예] view에서는 dao객체를 호출할수 없다.
 */