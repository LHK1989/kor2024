package day22;

import java.util.Scanner;

/*
BoardService4
    - BoardService3 모든 코드를 복사후 진행
    - 기존코드 : 고정길이인 Board[] boardList = new Board[100];
    - 수정조건 :
        고정길이 가 아닌 가변길이 형식으로 수정하여 100개 아닌
        무한개 저장 가능한 가변길이 배열 만들기
    * 이유 : 가변길이의 여러개 데이터를 관리할때는
            - 컬렉션프레임워크(ArrayList) = 실무
            - 가변배열 = 시험/코딩테스트
*/
public class testest {
    public static void main(String[] args) {
        Board[] boardList = null;

        Scanner scan = new Scanner(System.in);

        int count = 0;

        while(true){
            System.out.println(" 1. 쓰기 2. 출력");
            int choose = scan.nextInt();
            if(choose==1){
                scan.nextLine();
                System.out.print("내용 : ");      String content = scan.nextLine();
                // .next() 문자열(공백x) 입력 , .nextLine() 문자열(공백/띄어쓰기 포함) 입력
                // .nextLine() 사용시 주의할점 : .nextLine() 앞에 또 다른 .nextXX() 존재하면 의미없는 .nextLine() 작성해준다.
                System.out.print("작성자 : ");     String writer = scan.next();
                System.out.print("비밀번호 : ");    int pwd = scan.nextInt();

                Board board = new Board();
                board.content = content; board.writer = writer; board.pwd = pwd;

                count ++;

                Board[] newboardlist = new Board[count];

                if(count != 1){
                    for(int i=0; i<=count-2; i++){
                        newboardlist[i] = boardList[i];
                    }
                }

                newboardlist[count-1] = board;

                boardList = newboardlist;








            }else if(choose == 2){

                for( int index = 0 ; index <= boardList.length-1 ; index++ ){
                    if( boardList[index] != null ){ // 게시물이 존재하면
                        System.out.printf("작성자 : %s , 내용 : %s \n" ,
                                boardList[index].writer , boardList[index].content );
                    }
                } // for end







            }


















        } // w end
    }
}
