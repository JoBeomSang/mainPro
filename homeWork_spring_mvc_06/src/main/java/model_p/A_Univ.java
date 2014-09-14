package model_p;

import org.springframework.stereotype.Component;

@Component
public class A_Univ extends Univers {
	
	public A_Univ() 
	{
		uvname="A_Univ";
        cut=100;
        jum.add(0.7);
        jum.add(0.2);
        jum.add(0.1);
    }

}
