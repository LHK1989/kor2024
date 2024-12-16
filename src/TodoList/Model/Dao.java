package TodoList.Model;



import java.io.*;
import java.util.ArrayList;

public class Dao {
    private static Dao dao = new Dao();
    private Dao(){
        File file = new File("./src/Todolist/data.txt");
        if(file.exists()){
            load();
        }else{
            try{
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static Dao getInstance(){
        return dao;
    }


    ArrayList<Dto> todoDB = new ArrayList<>();


    public boolean Write(Dto dto){

        todoDB.add(dto);
        Save();

        return true;
    }

    public ArrayList<Dto> Print(){

        return todoDB;
    }




    public void Save(){

        String outstr = "";

        for( int index = 0 ; index <= todoDB.size()-1 ; index++){
            Dto dto = todoDB.get(index);

            outstr += dto.getContent() + "," + dto.getDay() +"," + dto.isStatus();

            outstr += "\n";
        }
        System.out.println(outstr);
        try {

            FileOutputStream outputStream = new FileOutputStream("./src/Todolist/data.txt");

            outputStream.write( outstr.getBytes() );

            System.out.println("[파일 저장 성공]");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void load(){
        try {
            FileInputStream inputStream = new FileInputStream("./src/Todolist/data.txt");
            File file = new File("./src/Todolist/data.txt");

            byte[] bytes = new byte[ (int) file.length()];

            inputStream.read(bytes);

            String inStr = new String( bytes );

            String[] objStr = inStr.split("\n");


            for( int i = 0 ; i <= objStr.length - 1 ; i++ ){

                String obj = objStr[i];

                String[] field =  obj.split(",");
                String content = field[0];
                String date = field[1];

                Dto dto = new Dto(content , date);

                todoDB.add( dto );
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }










}
