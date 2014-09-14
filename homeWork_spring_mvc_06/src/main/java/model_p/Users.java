package model_p;

import org.springframework.web.multipart.MultipartFile;



public class Users {

    String name,pw,id;

    MultipartFile file1,file2;

    String file1_sys, file1_ori, file2_sys, file2_ori;

    public Users(String name, String id, String pw) {

        this.name = name;
        this.id = id;
        this.pw = pw;
        

    }

    public Users() {
        // TODO Auto-generated constructor stub
    }

   
    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPw() {
        return pw;
    }

 

    public void setPw(String pw) {
        this.pw = pw;
    }

 

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    

    public MultipartFile getFile1() {
        return file1;
    }

 

    public void setFile1(MultipartFile file1) {
        this.file1 = file1;
        this.file1_ori = file1.getOriginalFilename();
    }

 

    public MultipartFile getFile2() {
        return file2;
    }

 

    public void setFile2(MultipartFile file2) {
        this.file2 = file2;
        this.file2_ori = file2.getOriginalFilename();
    }

 

    public String getFile1_sys() {
        return file1_sys;
    }

    public void setFile1_sys(String file1_sys) {
        this.file1_sys = file1_sys;
    }


    public String getFile1_ori() {
        return file1_ori;
    }

 
    public void setFile1_ori(String file1_ori) {
        this.file1_ori = file1_ori;
    }

 
    public String getfile2_sys() {
        return file2_sys;
    }

 
    public void setFile2_sys(String file2_sys) {
        this.file2_sys = file2_sys;
    }


    public String getFile2_ori() {
        return file2_ori;
    }


    public void setFile2_ori(String file2_ori) {
        this.file2_ori = file2_ori;
    }

 
}