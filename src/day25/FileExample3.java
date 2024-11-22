package day25;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
// 생각해보기 :
// 1.키보드로부터 입력받은 자료를 day25폴더내 test2.txt에 저장하시오.
// 2.day25 폴더내 test2.txt에 저장된 바이트를 읽어 콘솔에 출력하시오.
public class FileExample3 {
    public static void main(String[] args) {
        //[1] 입력객체
        Scanner scan = new Scanner(System.in);
        //[2] 키보드로부터 입력 받기
        System.out.println("저장 할 말");
        String word = scan.next();
        // [3] 파일 객체 생성
        try{
            FileOutputStream fileOutput = new FileOutputStream("./src/day25/test2.txt");
            fileOutput.write(word.getBytes());
            System.out.println("저장성공");
            // 파일 출력
            FileInputStream fileInput = new FileInputStream("./src/day25/test2.txt");

            //파일 사이즈  >> 확인 법
            File file = new File("./src/day25/test2.txt");
            System.out.println( file.isFile()); // 지정한 경로의 파일이 존재하는지 있으면 true 없으면 false
            System.out.println( file.getName());    // 지정한 파일의 이름 반환 함수
            System.out.println( file.length() );    // 지정한 파일의 용량(바이트) 반환 함수
            byte[] bytes = new byte[(byte)file.length()];  // 1000개의 바이트( 영문 1글자당 1바이트. 한글자당 2바이트 )를 저장할 수 있는 배열 선언
            // 강제 형변환 ( 반환 타입이 long 이기 때문 )
            fileInput.read(bytes);

            System.out.println(new String(bytes));

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
