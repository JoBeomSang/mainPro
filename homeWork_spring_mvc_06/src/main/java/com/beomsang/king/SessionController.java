package com.beomsang.king;

import javax.servlet.http.HttpSession;

import model_p.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionController {
	
	@Autowired
	Student student;

	@RequestMapping("session/make")
	public String make(HttpSession session)
	{
		student.setName("이승수");
		student.setAvg(88);
		
		session.setAttribute("id", student);
		return "sessionView";
	}
	
	@RequestMapping("session/view")
	public String view()
	{
		return "sessionView";
	}
	
	
	@RequestMapping("session/modify")
	public String modify(HttpSession session)
	{
		student.setName("이승수12");
		student.setAvg(77);
		
		session.setAttribute("id", student);
		return "sessionView";
	}
	
	@RequestMapping("session/delete")
	public String delete(HttpSession session)
	{
		session.invalidate();
		return "sessionView";
	}
}
