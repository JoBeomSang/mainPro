package com.beomsang.king;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import model_p.BuyOrder;
import model_p.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@Autowired
	ArrayList<Student> list;
	
	@RequestMapping("/hello")     //@RequestMapping는 컨트롤러  "hello"라는 페이지
	public String helloooooo()   //같은 이름으로 두 개 이상 매핑 하면 터짐
	{
		System.out.println("헬로 진입");
		return "basic/hello";
	}
	
	@RequestMapping("/basic/now")   //밑에거랑 여기랑 둘중 하나만 써도 됨  
	public ModelAndView now()   
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date now = new Date();
		
		ModelAndView mav = new ModelAndView("basic/now");  //위에서 설정해도 되고 여기에 바로 넣어도 됨
		
		mav.addObject("now", sdf.format(now));
		
		mav.addObject("list", list);
		
		//mav.setViewName("basic/now");
		
		return mav;
	}

}
