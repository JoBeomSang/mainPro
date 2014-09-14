package model_p;

import org.springframework.stereotype.Component;

 

@Component

public class ModelBean {

 

    String menu="clothes1", main="shirt", service="BoardList";

    

    Object menuList, mainList, mainData;

 

    public void init()    //초기화 메소드

    {

        menu="clothes1";

        main="shirt";

        service="BoardList";

    }

    

    public String getService() {

        return service;

    }

 

    public void setService(String service) {

        this.service = service;

    }

 

    public Object getMainData() {

        return mainData;

    }

 

    public void setMainData(Object mainData) {

        this.mainData = mainData;

    }

 

    public Object getMenuList() {

        return menuList;

    }

 

    public void setMenuList(Object menuList) {

        this.menuList = menuList;

    }

 

    public Object getMainList() {

        return mainList;

    }

 

    public void setMainList(Object mainList) {

        this.mainList = mainList;

    }

 

    public String getMenu() {

        return menu;

    }

 

    public void setMenu(String menu) {

        this.menu = menu;

    }

 

    public String getMain() {

        return main;

    }

 

    public void setMain(String main) {

        this.main = main;

    }

    

    

}