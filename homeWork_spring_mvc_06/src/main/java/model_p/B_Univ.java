package model_p;

import org.springframework.stereotype.Component;

@Component
public class B_Univ extends Univers {
	
	public B_Univ() 
	{
		uvname="B_Univ";
        cut=80;
        jum.add(0.6);
        jum.add(0.5);
        jum.add(0.4);
    }

}
