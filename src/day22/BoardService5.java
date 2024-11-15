/*
    - 컬렉션 프레임워크 : 수집 관련 클래스들
        - 여러개의 데이터들을 하나의 객체에서 관리하기 위해서
            --> 배열은 고정길이 라서 가변길이로 구현하는 방법은 복잡하다.
            --> 자바회사에서 배열을 ㅁ이용한 가변길이의 배열클래스를 이용하여 편의성ㅇ과
    - 대표 인터페이스 : list , set, map 컬렉션
    - arraylist 클래스
        대표함수
            .add( 새로운 객체 ) : 리스트내 지정한 객체 저장하는 함수
            .get( index ) : 리스트 내 지정한 인덱스에 객체 반환함수
            .size() : 리스트내 저장한 총 객체수 반환함수
            .remove( index ) : 리스트 내 지정한 인덱스에 객체 삭제하는 함수
 */
package day22;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

    // 컬렉션 프레임워크 Arraylist 컬렉션 프레임으로 수정
public class BoardService5 {
    public static void main(String[] args) {
        // -입력객체
        Scanner scan = new Scanner(System.in);
        // - 가변길이 배열 만들기 예제
        ArrayList<Board> boardList = new ArrayList<>();
            // ArrayList<제네릭타입> : 리스트객체에 저장할 여러개 객체들의 타입

        while (true){
            System.out.print("1.글쓰기 2.글출력 : ");
            int choose = scan.nextInt();
            if( choose == 1 ){
                // [1] 사용자로 저장할 데이터 입력 받는다.
                scan.nextLine(); // 의미 없는 nextLine() 코드 작성한다.
                System.out.print("내용 : ");      String content = scan.nextLine();
                // .next() 문자열(공백x) 입력 , .nextLine() 문자열(공백/띄어쓰기 포함) 입력
                // .nextLine() 사용시 주의할점 : .nextLine() 앞에 또 다른 .nextXX() 존재하면 의미없는 .nextLine() 작성해준다.
                System.out.print("작성자 : ");     String writer = scan.next();
                System.out.print("비밀번호 : ");    int pwd = scan.nextInt();

                // [2] 입력받은 데이터로 게시물 객체 생성
                Board board = new Board();  // - 게시물 객체 생성
                board.content = content; board.writer = writer; board.pwd = pwd;

                boardList.add(board);

            }else if( choose == 2 ){
                // 배열내 존재하는 게시물 모두 출력하기
                for( int index = 0 ; index <= boardList.size()-1 ; index++ ){
                    System.out.printf("작성자 : %s, 내용 : %s",boardList.get(index).writer,boardList.get(index).content);
                } // for end
            }
        } // w end
    } // m end
} // c end
