package TodoList.View;


import TodoList.Controller.Controller;
import TodoList.Model.Dto;

import java.util.ArrayList;
import java.util.Scanner;

public class View {

    private static View view = new View();

    private View(){}

    public static View getInstance() { return view; }


    Scanner scan = new Scanner(System.in);



    public void mainpage(){


        while (true){

            System.out.println(" 1. 할 일 등록 2. 할 일 출력 3. 할 일 삭제 4. 할 일 상태 변경");
            int choose = scan.nextInt();

            if(choose == 1 ){
                write();
            }else if(choose == 2){
                read();
            }else if(choose == 3){

            }else if(choose == 4){

            }else{
                System.out.println(" 잘못된 번호 입니다. ");
            }


        }

    }

    void write(){


        String date = "";


        scan.nextLine();
        System.out.print(" 게시물 내용: ");  String content = scan.nextLine();
        System.out.print(" 마감 날짜 \n 년 : "); int year = scan.nextInt();
        System.out.print(" 월 : "); int month = scan.nextInt();
        System.out.print(" 일 : "); int day = scan.nextInt();

        date = Integer.toString(year) + "-" + Integer.toString(month) + "-" + Integer.toString(day);

        boolean result = Controller.getInstance().Write(content,date);

        if( result ){
            System.out.println(" 등록 성공 ");
        }else{
            System.out.println(" 등록 실패 ");
        }

    }

    void read(){

        ArrayList<Dto> result = Controller.getInstance().Print();

        for (int index = 0; index <= result.size() - 1; index++) {
            String check = "";
            if(result.get(index).isStatus()){
                check = "완료";
            }else{
                check = "미완";
            }


            System.out.printf("작성자 : %s , 기간 : %s   : %s \n",
                    result.get(index).getContent(),
                    result.get(index).getDay(),
                    check);
        }

    }





















    //
}
