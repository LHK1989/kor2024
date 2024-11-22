package day23.Login.Controller;


import day23.Login.Model.Dao;
import day23.Login.Model.Dto;

public class Controller {
    private static Controller controller = new Controller();
    private Controller(){}
    public static Controller getInstance(){
        return controller;
    }
    public boolean signup(String id,String password){

        Dto dto = new Dto(id,password);

        return Dao.getInstance().signup(dto);

    }

    public int login(String id,String password){

        Dto dto = new Dto(id,password);

        int result = Dao.getInstance().login(dto);
        return result;
    }




}

