package service_p;

import java.util.ArrayList;
import java.util.LinkedHashMap;

 


import model_p.Meun;
import model_p.ModelBean;

 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

 
@Component
public class ModelBeanDao {

 
    @Autowired
    ModelBean modelBean;


    String defaultService = "/BoardList";

    
    public void menuSet()

    {
    	
    	ArrayList<Meun> top = new ArrayList<>();

        top.add(new Meun("clothes1,", "상의"));
        top.add(new Meun("clothes2,", "하의"));
        top.add(new Meun("board", "게시판"));

   
        LinkedHashMap<String, ArrayList<Meun>> res = new LinkedHashMap();

        res.put("clothes1,", new ArrayList<Meun>());
        res.put("clothes2,", new ArrayList<Meun>());
        res.put("close", new ArrayList<Meun>());
     

        res.get("clothes1").add(new Meun("info"+defaultService, "셔츠"));
        res.get("clothes1").add(new Meun("gil"+defaultService, "후드티"));
        
        res.get("clothes2").add(new Meun("free"+defaultService, "반바지"));
        res.get("clothes2").add(new Meun("hugi"+defaultService, "긴바지"));
        res.get("clothes2").add(new Meun("fnq"+defaultService, "바지바지"));

       
        res.get("board").add(new Meun("upclose"+defaultService, "상품후기"));
        res.get("board").add(new Meun("downclose"+defaultService, "질문답변"));
        

        ArrayList<Meun> topList = new ArrayList();

        
        for(Meun buf : top)
        {

            topList.add(
                new Meun("../../"+    
                    buf.getKey()+"/"+    
                    res.get(buf.getKey()).get(0).getKey(),   
                    buf.getValue()));

        }


        modelBean.setMenuList(topList);
 
        modelBean.setMainList(res.get(modelBean.getMenu()));

    }

}