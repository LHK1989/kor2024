/*
BoardService6
    - BoardService5 모든 코드를 복사후 진행
    - 추가조건 :Board 클래스 객체들을 캡슐화(접근제한자) 하시오.
        - 1. Board는 내용[String타입] 과 작성자[String타입] 과 비밀번호[int타입] 로 구성된 게시물 클래스
        - 2. Board의 모든 필드(멤버변수) 는 private 으로 선언한다.
        - 3. 외부에서 객체 생성시 생성자를 사용한다.
        - 4. getter(필드값호출함수) , setter(필드값대입함수) , toString(객체정보함수) 함수들을 이용하여 모든 필드의 데이터를 간접 접근한다.
*/
package day23;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardService6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Board> boardList = new ArrayList<>();

        while (true){
            System.out.print("1.글쓰기 2.글출력 : ");
            int choose = scan.nextInt();
            if( choose == 1 ){
                scan.nextLine();
                System.out.print("내용 : ");      String content = scan.nextLine();
                System.out.print("작성자 : ");     String writer = scan.next();
                System.out.print("비밀번호 : ");    int pwd = scan.nextInt();
                Board board = new Board( content , writer , pwd );  // - 게시물 객체 생성
                boardList.add( board );
            }else if( choose == 2 ){
                for( int index = 0 ; index <= boardList.size()-1 ; index++ ){
                    System.out.printf("작성자 : %s , 내용 : %s \n" ,
                            boardList.get( index).getContent() ,
                            boardList.get(index).getWriter() );
                } // for end
            }

        } // w end
    } // m end
}