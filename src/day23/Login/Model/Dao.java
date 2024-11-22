package day23.Login.Model;

import day23.BoardService8mvc.model.BoardDto;

import java.util.ArrayList;

public class Dao {
    private static Dao dao = new Dao();
    private Dao(){}
    public static Dao getInstance(){
        return dao;
    }

    ArrayList<Dto> user = new ArrayList<>();

    public boolean signup(Dto dto){
        for(int i = 0; i<=user.size()-1; i++){
            if(dto.getId().equals(user.get(i).getId())){
                return false;
            }
        }
        user.add(dto);
        return true;
    }

    public int login(Dto dto){
        int result = 0;
        int result2 = 0;
        for(int i = 0; i<=user.size()-1; i++){
            if(dto.getId().equals(user.get(i).getId())){
                result2 = i;
                result+=2;
                break;
            }
        }
            if(dto.getPassword().equals(user.get(result2).getPassword())){
                result+=1;
            }
        if(result==3){
            return 3;
        }else if(result==2){
            return 2;
        }else{
            return 0;
        }
    }
}
