package day22;
/*

public : 공개용 , 모든 클래스/ 패키지 내에서 접근가능
private : 비공개용 , 현재 클래스내에서 접근가능
    - 이유 : 객체의 자료는 중요하기 때문에 쉽게 저장/변경 하면 안된다. ( 유효성 검사 - 1. 원하는데이터인지 2. 안전한데이터인지)
    - 객체를 통해 필드 직접 접근을 차단하고 간접접근을ㅇ 이용한 유효성 검사를 시행한다.
protected : 동일한 패키지 내에서 접근 가능, 상속관계이면 다른패키지에서도 접근가능하다.
(default) : 동일한 패키진내에서 접근가능 , 접근제한자를 생략했을때 기본적으로 적용되는 접근제한자.
 */
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

// 컬렉션 프레임워크 Arraylist 컬렉션 프레임으로 수정
public class BoardService6 {
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