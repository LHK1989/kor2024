package day23.Login.View;

import day23.Login.Controller.Controller;

import java.util.Scanner;

public class View {
    private static View view = new View();

    private View() {
    }

    public static View getInstance() {
        return view;
    }


    Scanner scan = new Scanner(System.in);

    public void mainpage() {
        while (true) {
            System.out.println(" 1. 회원가입 2. 로그인 : ");
            int choose = scan.nextInt();
            if (choose == 1) {
                signup();
            } else if (choose == 2) {
                login();
            }
        }
    }

    public void signup(){
        System.out.print(" Id: ");  String id = scan.next();
        System.out.print(" Password: "); String password = scan.next();

        boolean result = Controller.getInstance().signup(id,password);

        if(result){
            System.out.println("등록완료");
        }else{
            System.out.println("이미 존재하는 아이디입니다.");
        }
    }

    public void login(){
        System.out.print(" Id: ");  String id = scan.next();
        System.out.print(" Password: "); String password = scan.next();

        int result = Controller.getInstance().login(id,password);

        if(result==3){
            System.out.println("로그인 성공");
        }else if(result==2){
            System.out.println("비밀번호가 다릅니다.");
        }else{
            System.out.println("존재하지않는 아이디입니다");
        }

    }
}
