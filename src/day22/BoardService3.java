package day22;
/*
   내용[String타입] 과 작성자[String타입] 과 비밀번호[int타입] 로 구성된 게시물 클래스 구축
   게시물 객체 최대 100개까지 구저장하는 서비스 구축
   - 조건 : main 함수 1개와 배열은 최대 1까지 사용하여 구현
   - 구축 : 게시물 쓰기와 게시물 출력 기능 구현

   타입 : 데이터 형태를 분류
    대분류 : 기본타입(byte, short , int , long , float , double, char, boolean) 8개
    참조타입( []배열, 클래스, 인터페이스, 열거타입) 등 - - > 기본값 : null
   클래스 : 멤버변수(필드), 생성자, 메소드(멤버함수)로 구성된 새로운 타입 만들기
   객체 : 참조 타입으로 생성된 메모리 공간
   변수 : 기본/참조 타입으로 생성된 메모리 공간
 */

import java.util.Scanner;

public class BoardService3 {// 실행 클래스
    public static void main(String[] args) {

        // 입력객체
        Scanner scan = new Scanner(System.in);
        // board 객체 100개를 저장할 수 있는 배열 선언
        Board[] boardList = new Board[100]; // board 객체 100개를 저장할 수 있는 배열 선언 - 고정길이
        while(true){
            System.out.println(" 1. 글쓰기 2. 글출력 :");
            int choose = scan.nextInt();
            scan.nextLine();
            if(choose == 1){
                System.out.print(" 내용 : "); String content = scan.nextLine();
                // .next() 공백x .nextline 띄어쓰기 포함
                // scan.nextLine(); 사용시 주의할 점 : .nextline() 앞에 또 다른 .nextxx() 존재하면 의미없는 .nextLine() 작성해준다
                System.out.print(" 작성자 : "); String writer = scan.next();
                System.out.print(" 비밀번호 : "); int pwd = scan.nextInt();
                // [2] 배열 내 빈 공간을 찾아서 게시물 작성하기 ,
                for( int i = 0; i <= boardList.length-1; i++){
                    if(boardList[i]==null){ // 만약에 i번째 게시물이 비어있으면
                        Board board = new Board(); // 게시물 객체생성
                        // 생성된 게시물 객체내 입력받은 값들을 대입한다
                        board.content = content; board.writer = writer; board.pwd = pwd;
                        // 배열내 i번째 위치에 생성한 객체를 저장한다.
                        boardList[i] = board;
                        break;
                    }

                }
            }else if(choose == 2){// 배열내 존재하는 게시물 모두 출력하기
                for( int i = 0 ; i <= boardList.length-1; i++){
                    if( boardList[i] != null){
                        System.out.printf("작성자 : %s, 내용 : %s \n" , boardList[i].writer , boardList[i].content);
                    }
                }

            }
        }
    }
}
