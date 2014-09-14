package com.beomsang.king;
import model_p.BuyOrder;

import model_p.Student;

import model_p.Univers;

import model_p.UnivCal;

 

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;


@Controller
public class InPutController {

    @Autowired(required=false)
    UnivCal uc;

    @RequestMapping(value="input/listform",method=RequestMethod.GET)
    public ModelAndView inputGet()
    {    

        ModelAndView mav = new ModelAndView("input/listForm");

        mav.addObject("unvi",uc.getUniv());

        return mav;

    }


    @RequestMapping(value="input/listform",method=RequestMethod.POST)
    public String inputPost(@ModelAttribute("order") BuyOrder ooo )
    {    
    	uc.cal(ooo);

        return "input/listSubmit";

    }

}
