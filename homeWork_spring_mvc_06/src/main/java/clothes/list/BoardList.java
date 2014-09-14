package clothes.list;

import java.util.ArrayList;



import org.springframework.beans.factory.annotation.Autowired;

 

import model_p.Board;

import model_p.ModelBean;

import di.Action;

 

public class BoardList implements Action{

    

    @Override

    public Object execute() {

        // TODO Auto-generated method stub

        

        ArrayList board = new ArrayList();

        

        board.add(new Board("제목1", "id1"));
        board.add(new Board("제목2", "id2"));
        board.add(new Board("제목3", "id3"));

    
        return board;

    }

}