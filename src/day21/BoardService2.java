package day21;

import java.util.Scanner;

/*
    BoardService2
        - 내용과 작성자로 구성된 게시물을 최대
        100개 까지 저장하는 서비스 구축
        - 조건 : main함수 1개와 배열은 최대2 까지 사용 구현
        - 구축 : 게시물 쓰기와 게시물 출력기능 구현
 */
public class BoardService2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 배열이란 ? 여러개의 동일한 타입의 데이터들을 하나의 변수에 저장할 수 있는 [참조]타입
        // 인덱스란? 배열내 저장된 데이터들의 저장 순서 번호 , 0 ~ 최대 길이
        // 반복문 활용 : 시작값부터 끝값까지 반복

        String[] content = new String[100]; // 배열 선언 방법 : 타입[] 변수명 = new 타입[ 개수 ]
        String[] writer = new String[100]; // String 데이터를 100개를 저장할 수 있는 배열 선언

        while (true) {
            System.out.println("1.게시물 쓰기: 2.게시물 출력: ");
            int choose = scan.nextInt();
            if (choose == 1) {
                System.out.println(" 새로운 게시물 제목: ");
                String cont = scan.next();
                System.out.println(" 새로운 게시물 작성자: ");
                String writ = scan.next();
                boolean save = false;
                for (int index = 0; index <= content.length - 1; index++) {
                    if (content[index] == null) {
                        content[index] = cont;
                        writer[index] = writ;
                        save = true;
                        break;
                    }
                }
                if (!save) {
                    System.out.println(" 비어있는 자리가 없습니다 ");
                } else {
                    System.out.println(" 게시물 쓰기 성공 ");
                }
                if (choose == 2) {
                    for (int index = 0; index <= content.length - 1; index++) {
                        if (content[index] != null) { // 만약 index번째 게시물이 존재하면
                            System.out.printf("작성자 : %s, 내용 : %s \n", writer[index], content[index]);
                        }
                    }
                }
            }


            //
        }
    }
}
