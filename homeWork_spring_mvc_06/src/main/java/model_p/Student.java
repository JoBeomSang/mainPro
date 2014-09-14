package model_p;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	 String name,res="불합격",stu_univ;
	 
	 Integer avg;   

	 ArrayList<Integer> jum;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}

	public String getStu_univ() {
		return stu_univ;
	}

	public void setStu_univ(String stu_univ) {
		this.stu_univ = stu_univ;
	}

	public Integer getAvg() {
		return avg;
	}

	public void setAvg(Integer avg) {
		this.avg = avg;
	}

	public ArrayList<Integer> getJum() {
		return jum;
	}

	public void setJum(ArrayList<Integer> jum) {
		this.jum = jum;
	}
	
}
