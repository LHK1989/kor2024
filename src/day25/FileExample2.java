package day25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExample2 {
    public static void main(String[] args) {
        try {

            FileInputStream fileInput = new FileInputStream("./src/day25/test1.txt");
            byte[] bytes = new byte[10]; // 10 "Hello java" 문자열이 10바이트이므로
            fileInput.read( bytes );
            System.out.println( new String(bytes));
        }catch ( FileNotFoundException e){
            // 만약에 파일의 경로가 존재하지 않으면 예외가 발생후 실행코드 코드
            e.printStackTrace();
        }catch ( IOException e){
            // 만약에 읽어오는 과정에서 예외가 발생하면 실행되는 코드
            e.printStackTrace();
        }
















        // c , m end
    }
}
