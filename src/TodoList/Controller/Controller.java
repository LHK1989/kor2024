package TodoList.Controller;


import TodoList.Model.Dao;
import TodoList.Model.Dto;

import java.util.ArrayList;

public class Controller {
    private static Controller controller = new Controller();

    private Controller() {
    }

    public static Controller getInstance() {
        return controller;
    }

    public boolean Write( String content,String date){


        Dto dto = new Dto(content,date);


        return Dao.getInstance().Write( dto );
    }

    public ArrayList<Dto> Print(){

        ArrayList<Dto> dtoDB = Dao.getInstance().Print();

        return dtoDB;
    }






















    //
}
