package model_p;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

public class Univers {
	
	
	@Autowired(required=false)
    BuyOrder buyOrder;

    String uvname;

    ArrayList<Double> jum =new ArrayList<Double>();

    Integer cut,cnt=0;

    
    public Univers()
    {
        // TODO Auto-generated constructor stub
    }

    
    public Univers(String uvname, ArrayList<Double> jum, Integer cut) {

        super();

        this.uvname = uvname;
        this.jum = jum;
        this.cut = cut;

    }

  
    public void stud_avg_cal(BuyOrder order)
    {
        int su = 0;

        for(Student stud : order.getStudList())
        {    
            int sum = 0;

            int i2 =0;

            for(Double i : getJum())
            {
                sum += stud.getJum().get(i2) * i;
                i2++;
            }

            stud.setAvg(sum);

            if(stud.getAvg()>getCut()&& stud.getStu_univ().equals(this.getUvname()))
            {    
                 stud.setRes("합격");
                 su = su+1;
            }
        }

        setCnt(su);

    }


	public BuyOrder getBuyOrder() {
		return buyOrder;
	}


	public void setBuyOrder(BuyOrder buyOrder) {
		this.buyOrder = buyOrder;
	}


	public String getUvname() {
		return uvname;
	}


	public void setUvname(String uvname) {
		this.uvname = uvname;
	}


	public ArrayList<Double> getJum() {
		return jum;
	}


	public void setJum(ArrayList<Double> jum) {
		this.jum = jum;
	}


	public Integer getCut() {
		return cut;
	}


	public void setCut(Integer cut) {
		this.cut = cut;
	}


	public Integer getCnt() {
		return cnt;
	}

	
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}    

}
