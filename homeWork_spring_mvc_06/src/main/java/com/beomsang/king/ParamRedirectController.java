package com.beomsang.king;

import model_p.Student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ParamRedirectController {

	/*
	@RequestMapping("basic/param")
	public String param(@RequestParam(value="id", required=false, defaultValue="민균이형 와퍼 먹고 싶어요")String id)
	{											//파람은 파람으로 끝나는거 디폴트 값줘도 안나타남
		System.out.println(id);
		return "basic/param";
	}*/
	
	@RequestMapping("basic/param")
	public ModelAndView param(@RequestParam(value="id", 
	required=false, defaultValue="민균이형 와퍼 먹고 싶어요")String id,
	@RequestParam(value="cnt", 
	required=false, defaultValue="1324")int cnt)
	{										
		ModelAndView mav = new ModelAndView("basic/param");
		
		mav.addObject("id",id);
		mav.addObject("cnt",cnt+1000);
		
		//값이 없을때에는 자동으로 자기가 원하는 형태로 형변환하여 값 지정할 수 있다(cnt)
		//게시판 페이지 만들때 유용 페이지값이 없으면 1로
		
		System.out.println(id);
		return mav;
	}
	
	@RequestMapping("basic/direct")
	public ModelAndView direct()
	{
		ModelAndView mav = new ModelAndView("redirect:recive");
		
		mav.addObject("name","abcd");
		mav.addObject("avg",1234);
		
		//mav.addObject("kkk", new Student().toString());
		
		return mav;
	}
	
	@RequestMapping("basic/recive")
	public String recive(Student stud)
	{
		stud.setName("소데스까");
		return "basic/recive";
	}
}
