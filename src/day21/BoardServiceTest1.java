package day21;

import java.util.Scanner;

public class BoardServiceTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array = new String[300];
        while (true) {
            System.out.println("1.게시물 쓰기: 2.게시물 출력: ");
            int choose = scan.nextInt();
            if (choose == 1) {
                System.out.println(" 새로운 게시물 제목: ");
                String cont = scan.next();
                System.out.println(" 새로운 게시물 작성자: ");
                String writ = scan.next();
                System.out.println(" 게시물 비밀번호[4자리] : ");
                int pass = scan.nextInt();
                String password = "";
                boolean save = false;
                while (true) {
                    if (pass > 9999 || pass < 0) {
                        System.out.println(" 다시 입력하세요 4자리 :");
                        pass = scan.nextInt();
                    } else {
                        password = String.valueOf(pass);
                        break;
                    }
                }
                for (int index = 0; index <= 99; index++) {
                    if (array[index] == null) {
                        array[index] = cont;
                        array[index + 100] = writ;
                        array[index + 200] = password;
                        save = true;
                        break;
                    }
                }
                if (!save) {
                    System.out.println(" 비어있는 자리가 없습니다 ");
                } else {
                    System.out.println(" 게시물 쓰기 성공 ");
                }
            }
                    if (choose == 2) {
                        for (int index = 0; index <=99; index++) {
                            if (array[index] != null) {
                                System.out.printf("작성자 : %s, 내용 : %s, 비밀번호 : %s \n", array[index], array[index + 100], array[index + 200]);
                            }
                        }
                    }

                }
            }
        }



