package com.beomsang.king;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

 

import model_p.Meun;
import model_p.ModelBean;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

 

import di.Action;
import service_p.ModelBeanDao;

 

@Controller
@RequestMapping("pathmodel/{menu}/{main}/{service}")

public class PathController {

 
    @Autowired
    ModelBean modelBean;   

    

    @Autowired
    ModelBeanDao dao;    

 

    @ModelAttribute("mb")    
    public ModelBean menu(

            @PathVariable String menu,
            @PathVariable String main,
            @PathVariable String service)   
    {

        modelBean.setMenu(menu);
        modelBean.setMain(main);
        modelBean.setService(service);

        

        dao.menuSet();  

        Action set = null;

  
        try {
            set = (Action)Class.forName(modelBean.getMenu()+"."+modelBean.getMain()+"."+modelBean.getService()).newInstance();

        } catch (Exception e) {

            // TODO Auto-generated catch block
            e.printStackTrace();

        }

        modelBean.setMainData(set.execute());

        return modelBean;

    }

    

    @RequestMapping()
    public String mapping()
    {

        return "model/template";

    }

 

}