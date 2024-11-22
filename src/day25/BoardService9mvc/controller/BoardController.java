package day25.BoardService9mvc.controller;

import day25.BoardService9mvc.model.BoardDao;
import day25.BoardService9mvc.model.BoardDto;

import java.util.ArrayList;

public class BoardController {

    // 싱글톤
    // 1.
    private static BoardController boardController = new BoardController();
    private BoardController(){}
    public static BoardController getInstance(){
        return boardController;
    }

    // 1. 게시물 등록 제어 함수
    public boolean boardWrite( String content,String writer, int pwd){
        // 1. 다양한 데이터 검사 = 유효성검사, 오늘은 생략
        // 2. 유효성 검사 통과했으면 서로 다른 데이터를 하나로 만들기;
        BoardDto boardDto = new BoardDto( content, writer, pwd);
        // 3. 입력받은 객체를 저장하기 위해 dao 전달하고 결과를 응답 받기

        return BoardDao.getInstance().boardWrite( boardDto );
    }
    // 2. 게시물 출력 제어 함수
    public ArrayList<BoardDto> boardPrint(){
        // void : 메소드 호출 시 반환되는 값이 없다는 뜻을 가진 키워드
        // - void대신 여러개 게시물을 반환받고싶어
        // void --> ArrayList<Board>
        // *dao 에게 게시물 전체 출력 함수를 호출해서 결과를 받는다


        ArrayList<BoardDto> result = BoardDao.getInstance().boardPrint();

        return result;


    }
}
