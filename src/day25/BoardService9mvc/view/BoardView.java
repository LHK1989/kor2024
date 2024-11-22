package day25.BoardService9mvc.view;

import day25.BoardService9mvc.controller.BoardController;
import day25.BoardService9mvc.model.BoardDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {
    // -------------- 싱글톤---------------- //
    // 1. 지정한 클래스의 private static 객체를 생성한다.
    private static BoardView boardView = new BoardView();
    //2. 지정한 클래스는 외부로 부터 객체생성을 차단한다.
    private BoardView(){}
    //3. 내부의 객체를 외부로부터 직접접근이 아닌 간접접근 할 수 있도록 getter함수를 만들어준다.
    public static BoardView getInstance(){
        return boardView;
    }

    Scanner scan = new Scanner( System.in);

    public void mainpage(){
        while (true){

            System.out.println(" 1. 게시물 등록 2. 게시물 출력 : ");
            int choose = scan.nextInt();
            if( choose == 1){
                boardWriter();
            }else if( choose == 2){
                boardPrint();
            }



        }
    }

    // view가 해야하는 역할 : 입력과 출력만 해야한다. ( 관례적인 약속 )

    // 1. 게시물 등록 함수
    void boardWriter(){
        //1. 입력
        scan.nextLine();
        System.out.print(" 게시물 내용: ");  String content = scan.nextLine();
        System.out.print(" 게시물 작성자: "); String writer = scan.next();
        System.out.print(" 게시물 비밀번호: "); int pwd = scan.nextInt();

        // 2. 입력받은 값을 컨틀롤러에게 전달

        boolean result = BoardController.getInstance().boardWrite(content,writer,pwd);

        // 3. 컨트롤러에게 전달 후 결과를 받아 출력하기.
        if( result ){
            System.out.println(" 등록 성공 ");
        }else{
            System.out.println(" 등록 실패 ");
        }
    }


    // 2. 게시물 출력 함수
    void boardPrint(){
        // 1. 컨트롤러에게 모든 게시물정보를 요청한다.
            // 왜?? 다른 클래스의 메소드를 호출하기 위해서는 객체가 필요하다.

        // 2. 컨트롤러에게 전달받은 결과를 출력한다.
        ArrayList<BoardDto> result = BoardController.getInstance().boardPrint();

        for (int index = 0; index <= result.size() - 1; index++) {
            System.out.printf("작성자 : %s , 내용 : %s \n",
                    result.get(index).getContent(),
                    result.get(index).getWriter());
        }
    }
    /*
        게시물 1개 = Board 객체 1객
        게시물 여러개 = Board[] 배열 또는 컬렉션프레임워크 Arraylist<Board>
     */

















    // c end
}
