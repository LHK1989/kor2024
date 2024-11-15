package day22;

import java.util.ArrayList;
import java.util.Scanner;
/*[ BoardServiceTest3 ]
        - BoardServiceTest2 클래스에서 main함수내 while{} 문 안에 있는 게시물 등록코드 와 게시물 전체 출력코드를 main함수 밖으로 빼서 각 함수로 구현 하시오.1

 */


public class BoardServiceTest3 {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<BoardTest> boardList = new ArrayList<>();

    static void setBoard(){
        scan.nextLine();
        System.out.print("내용 : ");      String content = scan.nextLine();
        System.out.print("작성자 : ");     String writer = scan.next();
        System.out.print("비밀번호 : ");    int pwd = scan.nextInt();

        BoardTest board = new BoardTest();  // - 게시물 객체 생성
        board.setContent(content); board.setWriter(writer); board.setPwd(pwd);

        boardList.add(board);

    }

    static void getBoard(){
        for( int index = 0 ; index <= boardList.size()-1 ; index++ ){
            System.out.printf("작성자 : %s, 내용 : %s \n",boardList.get(index).getContent(),boardList.get(index).getWriter());
        }
    }

    public static void main(String[] args) {

        while (true){
            System.out.println("1. 글 쓰기 2. 글 출력 : ");
            int choose = scan.nextInt();
            if(choose==1){
                setBoard();
            }else if(choose==2){
                getBoard();
            }
        }

    }
}
