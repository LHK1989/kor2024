package day23;

import java.util.ArrayList;
import java.util.Scanner;

// static 이란? static 키워드가 존재하는 변수 혹은 메소드는 우선 할당이 된다.
    // -  static main 함수 내에서 다른 함수가 호출되지 않는 이유 ( 다양한 이유)
    // 1. static main 함수안에서는 호출 할 함수가 static이어야 한다.
public class BoardService7 {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Board> boardList = new ArrayList<>();

    static void boardWriter() {
        scan.nextLine();
        System.out.print("내용 : ");
        String content = scan.nextLine();
        System.out.print("작성자 : ");
        String writer = scan.next();
        System.out.print("비밀번호 : ");
        int pwd = scan.nextInt();
        Board board = new Board(content, writer, pwd);  // - 게시물 객체 생성
        boardList.add(board);
    }

    static void boardPrint() {
        for (int index = 0; index <= boardList.size() - 1; index++) {
            System.out.printf("작성자 : %s , 내용 : %s \n",
                    boardList.get(index).getContent(),
                    boardList.get(index).getWriter());
        }
    }

    public static void main(String[] args) {


        while (true) {
            System.out.print("1.글쓰기 2.글출력 : ");
            int choose = scan.nextInt();
            if (choose == 1) {
            } else if (choose == 2) {

            }
        }

    }
}
