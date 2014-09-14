package model_p;

import org.springframework.stereotype.Component;



@Component
public class Board {

    String title, id;
    

    public Board() {

        // TODO Auto-generated constructor stub

    }
    
    public Board(String title, String id) {

        super();

        this.title = title;
        this.id = id;

    }

    

    public String getId() {

        return id;

    }

    public void setId(String id) {

        this.id = id;

    }

    public String getTitle() {

        return title;

    }

    public void setTitle(String title) {

        this.title = title;

    }

   

}