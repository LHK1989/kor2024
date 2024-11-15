package day22;

import java.util.ArrayList;
import java.util.Scanner;

/*
  [ BoardServiceTest2  ]
         - 클래스 설계 : 내용[String타입] 과 작성자[String타입] 과 비밀번호[int타입] 로 구성된 게시물 클래스를 설계
           - 객체 저장 : 게시물 객체를 n개 저장하는 서비스 구축
          - 조건1 : main함수 1개 와 ArrayList객체는 최대1까지 사용 하여 구현
      - 조건2 : Board 클래스를 캡슐화 하시오.
         1. Board클래스내 모든 필드는 private 으로 선언한다.
         2. 객체 생성시 무조건 생성자를 사용한다.
         3. getter , setter , toString 함수들을 이용하여 모든 필드의 데이터를 간접 접근한다.
      - 기능 구축 : 게시물 쓰기 와 게시물 출력 기능 구현

   [ BoardServiceTest3 ]
   - BoardServiceTest2 클래스에서 main함수내 while{} 문 안에 있는 게시물 등록코드 와 게시물 전체 출력코드를 main함수 밖으로 빼서 각 함수로 구현 하시오.
 */
public class BoardServiceTest2 {
    public static void main(String[] args) {
        // -입력객체
        Scanner scan = new Scanner(System.in);
        // - 가변길이 배열 만들기 예제
        ArrayList<BoardTest> boardList = new ArrayList<>();
        // ArrayList<제네릭타입> : 리스트객체에 저장할 여러개 객체들의 타입

        while (true){
            System.out.print("1.글쓰기 2.글출력 : ");
            int choose = scan.nextInt();
            if( choose == 1 ){

                scan.nextLine();
                System.out.print("내용 : ");      String content = scan.nextLine();
                System.out.print("작성자 : ");     String writer = scan.next();
                System.out.print("비밀번호 : ");    int pwd = scan.nextInt();


                BoardTest board = new BoardTest();  // - 게시물 객체 생성
                board.setContent(content); board.setWriter(writer); board.setPwd(pwd);

                boardList.add(board);

            }else if( choose == 2 ){

                for( int index = 0 ; index <= boardList.size()-1 ; index++ ){
                    System.out.printf("작성자 : %s, 내용 : %s \n",boardList.get(index).getContent(),boardList.get(index).getWriter());
                }
            }
        }
    }
}
