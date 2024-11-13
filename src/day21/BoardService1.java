package day21;

import java.util.Scanner;

public class BoardService1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // - 저장소 설계 , 게시물1개당 내용과 작성자 ( 내용 2개) , 게시물 3개면 내용 6개
        // 변수란? 하나의 데이터/주소값을 저장하는 공간/ 메모리
        // 타입이란? 변수의 저장된 데이터/주소의 타입, 데이터 분류 , 기본 타입( 7: int ~ double) vs 참조타입 ( 클래스,인터페이스,배열)

        // 첫번째 게시물 내용
        String content1 = "";
        String writer1 = "";

        // 두번째 게시물 내용
        String content2 = "";
        String writer2 = "";

        // 세번째 게시물 내용
        String content3 = "";
        String writer3 = "";

        // if : 다중 if는 다중 조건의 다중 결과를 충족할 수 있다.
        // if~else if : 다중 조건의 무조건 1개 결과를 충족한다.

        while (true) { // 무한루프
            System.out.println("1.게시물 쓰기 : 2.게시물출력 선택 : ");
            int choose = scan.nextInt();
            if (choose == 1) {
                // 게시물을 저장 할 내용 입력받기
                System.out.println(" 새로운 게시물 내용: ");
                String content = scan.next();
                System.out.println(" 새로운 게시물 작성자: ");
                String writer = scan.next();
                // 입력값 1 = 게시물을 작성 핧 공간이 있는지 체크 , 임의로 게시물이 없다는 뜻 null or ""
                if (content1 == null) { // 만약에 첫번째 게시물의 정보가 비어있으면
                    content1 = content;
                    writer1 = writer; // 입력받은 값들을 첫번째 게시물 변수에 저장
                } else if (content2 == null) { // 만약에 게시물의 정보가 비어있으면
                    content2 = content;
                    writer2 = writer;
                } else if (content3 == null) {
                    content3 = content;
                    writer3 = writer;
                } else {
                    System.out.println(" 게시물 쓰기 실패 : 빈공간이 없습니다. ");
                }
            } // 1 end
            if (choose == 2) {
                if (content1 != null) {
                    System.out.printf("작성자 : %s, 내용 : %s ,", writer1, content1);
                }
                if (content2 != null) {
                    System.out.printf("작성자 : %s, 내용 : %s ,", writer2, content2);
                }
                if (content3 != null) {
                    System.out.printf("작성자 : %s, 내용 : %s ,", writer3, content3);
                }
            }
        }
    }
}