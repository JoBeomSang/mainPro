package model_p;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UnivCal {

	@Autowired(required=false)
    Univers[] univ;


    public void cal(BuyOrder order)
    {
        for(Univers uu : univ)
        {
            uu.stud_avg_cal(order);
        }

        order.setUniv(univ);
    }

 
    public Univers[] getUniv() {

        return univ;
    }

 
    public void setUniv(Univers[] univ) {

        this.univ = univ;

    }
}
