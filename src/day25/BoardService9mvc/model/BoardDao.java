package day25.BoardService9mvc.model;

import com.sun.jdi.IntegerValue;

import java.io.*;
import java.util.ArrayList;

/*

    - boardservice8mvc 패키지를 복사해서 boardservice9mvc 패키지명 변경후 진행
    - 조건 : 파일 입출력을 활용하여 프로그램이 종료되고 다시 실행 했을 때 영구 저장 되도록 하시오.

    [생각해보기]
    1. txt 메모장는 문자열만 저장되는 윈도우 프로그램의 확장자 , txt( 객체지향x )
    2. 게시물들( ArrayList<BoardDto> ) 저장을 하기 위해서는 변환이 필요하다. , java( 객체지향 o )
    문제점 : 서로 다른 언어/프로그램 들 간의 데이터를 주고 받을려면 형식/타입이 같으면 좋을텐데.
    - 관례적으로 사용되는 타입 : CSV, JSON, XML 파일 타입 주로 사용한다.
    -- > 서로 다른 언어/프로그램 들 간의 공통된 형식/타입을 사용하므로 데이터 통신하자.

    [ CSV ]
    1. , 쉼표로 구분된 값의 문자열 파일 형식
    2. \n 백슬래스n 이용한 줄바꿈 처리를 한다.
    3. .csv 확장자 가진다.

    [ 게시물 객체를 CSV 형식으로 변환 ]
    1. boardDto( content="안녕하세요",writer ="유재석",pwd=1234) : 자바 객체로 임의로 시각화
    2. 하나의 문자열로 필드명을 제외한 필드값들을 쉼표로 구분하여 문자열로 반환 : " 안녕하세요,유재석,1234 "

    [ 여러개 게시물 객체가 존재 했을 때 ]
    point1 : 필드간의 구분을 , 쉼표로 한다.
    point2 : 객체간의 구분을 \n으로 한다.
 */


public class BoardDao {
    private static BoardDao boardDao = new BoardDao();
    private BoardDao(){}
    public static BoardDao getInstance(){
        return boardDao;
    }

    ArrayList<BoardDto> boardDB = new ArrayList<>();

    // 1. 게시물 등록 접근 함수
    public boolean boardWrite( BoardDto boardDto){
        boardDB.add( boardDto );
        // 만약에 리스트에 게시물을 추가했다면 , 파일에도 추가된 게시물을 쓰기
        fileSave();
        return true;
    }

    // 2. 게시물 출력 접근 함수
    public  ArrayList<BoardDto> boardPrint(){
        return boardDB;


    }

    // ============================== 영구 저장을 위한 게시물들을 파일에 저장하는 기능 =============================
    public void fileSave(){ // 게시물 등록을 성공ㅇ했을 때 지정한 함수 사용/호출

        // 여러개의 게시물들을 boardDB 하나의 문자열 String,csv로 표현하는 방법
            // 1. 임의의 문자열 변수 선언
        String outstr = "";
        // 2. 반복문을 이용한 모든 게시물들을 순회/반복
        for( int index = 0 ; index <= boardDB.size()-1 ; index++){ // 리스트 객체내 0번 인덱스부터 마지막까지 반복
            BoardDto boardDto = boardDB.get(index); // 3. index번째의 게시물
            // 4 . [ 객첸내 필드 구분 ] csv형식 만들기
            outstr += boardDto.getContent() + "," + boardDto.getWriter() +"," + boardDto.getPwd();
            // += 복합대입연산자 : 오른쪽값을 왼쪽변수 값와 더한후에 결과를 왼쪽 변수에 대입한다.
            // 5.  [객체 구분]
            outstr += "\n";
        }
        System.out.println(outstr);
        try {
            // [1] 파일 출력 객체를 생성한다.
            FileOutputStream outputStream = new FileOutputStream("./src/day25/boardservice9mvc/test/test.txt");
            // [2] 파일 출력 객체를 이용한 바이트 쓰기 / 내보내기
            outputStream.write( outstr.getBytes() ); // 위에서 객체들을 모두 csv형식으로 반횐된 문자열을 바이트로 변환
            // [3] 안내메시지
            System.out.println("[파일 저장 성공]");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    // ============================= 영구 저장된 파일의 게시물들을 가져오는 기능 ================================
    public void fileLoad(){
        try {
            // [1] 파일 입력 객체 생성
            FileInputStream inputStream = new FileInputStream("./src/day25/boardservice9mvc/test/test.txt");
            // [2] 파일 용량만큼 바이트 배열 선언
            File file = new File("./src/day25/boardservice9mvc/test/test.txt");
            byte[] bytes = new byte[(int)file.length()];
            //[3] 파일 입력 객체를 이용한 파일 읽어서 바이트 배열 저장
            inputStream.read(bytes);
            // [4] 읽어온 바이트 배열을 문자열로 변환
            String inStr = new String( bytes );
            // 활용 과제 : 파일로 부터 읽어온 문자열의 게시물 정보들을 다시 ArrayList<BoardDto> boardDB에 저장하시오.

            String[] m = inStr.split("\n");
            for( int i=0; i<=m.length - 1; i++){
                String[] m2 = m[i].split(",");
                int num = Integer.valueOf(m2[2]);
               BoardDto boardDto = new BoardDto(m2[0],m2[1],num);
               boardDB.add(boardDto);
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
