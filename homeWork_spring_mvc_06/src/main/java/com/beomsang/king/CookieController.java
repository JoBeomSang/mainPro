package com.beomsang.king;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CookieController {

	@RequestMapping("cookie/make")
	public String make(HttpServletResponse response)
	{
		response.addCookie(new Cookie("cccid", "aaa"));
		return "cookie/make";
	}
	
	@RequestMapping("cookie/view")
	public ModelAndView view(@CookieValue(value="id", defaultValue="사람아니야")String id)
	{
		ModelAndView mav = new ModelAndView("cookie/view");
		mav.addObject("id", id);
		
		return mav;
	}
	
	@RequestMapping("cookie/delete")
	public String delete(HttpServletResponse response)
	{
		
		Cookie coo = new Cookie("id","");
		coo.setMaxAge(0);
		response.addCookie(coo);
		
		return "cookie/view";
	}
}
