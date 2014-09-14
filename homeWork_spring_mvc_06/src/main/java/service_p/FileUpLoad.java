package service_p;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

 


import javax.servlet.http.HttpServletRequest;

import model_p.Users;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

 

@Component
public class FileUpLoad {

    public void cal(Users user,HttpServletRequest request){

        int no =0 , chk=0;


        if(!user.getFile2().isEmpty())
        {
            no++;
            chk=1;
        }

        if(!user.getFile1().isEmpty())
        {    
            no++;
            chk=2;
        }
    

        if(no==2)
        {
            user.setFile1_sys(fileUp(user.getFile1(), request));
            user.setFile2_sys(fileUp(user.getFile2(), request));

        }else if(no==1 && chk==1)

            user.setFile2_sys(fileUp(user.getFile2(), request));

        else if(no==1 && chk==2)

            user.setFile1_sys(fileUp(user.getFile1(), request));    

    }

    

    public String fileUp(MultipartFile upfile ,HttpServletRequest request)
    {
        String pathName = "/resources/up";
        String path = "C:\\spring\\sts\\spring_mvc_06\\src\\main\\webapp"+pathName;
        String fileName = upfile.getOriginalFilename();

        File file = new File(path+"\\"+fileName);

        String newfileName="";

        int no=1;

        if(file.exists())
        {    
            while(true)
            {    
                newfileName=fileName.split("[.]")[0]+"("+no+")"+fileName.split("[.]")[1];

                if(new File(path+"\\"+newfileName).exists())
                {
                    no++;
                }
                else
                {
                    break;
                }

            }

            fileName=newfileName;

            file = new File(path+"\\"+fileName);

        }

        try 
        {
            byte [] arr = upfile.getBytes();

            FileOutputStream fos = new FileOutputStream(file);

            fos.write(arr);

            fos.close();
           

        } catch (IOException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();

        }
  
        return fileName;

    }

}