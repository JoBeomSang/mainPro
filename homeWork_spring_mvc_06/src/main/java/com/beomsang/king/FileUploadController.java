package com.beomsang.king;

import javax.servlet.http.HttpServletRequest;

import model_p.FileData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import service_p.FileUpLoad;

@Controller
public class FileUploadController {
	
	@Autowired
	FileUpLoad fileUpLoad;

	@RequestMapping(value="file/form")
	public String form()
	{
		return "file/form";
	}
	
	@RequestMapping(value="file/submit1")
	public ModelAndView submit1(
			@RequestParam("number") Integer number,
			@RequestParam("upfile") MultipartFile upfile,
			HttpServletRequest request
			)
	{
		ModelAndView mav = new ModelAndView("file/submit");
		
		fileUpLoad.fileUp(upfile, request);
		
		mav.addObject("number",number);
		mav.addObject("ori",upfile.getOriginalFilename());
		mav.addObject("sys",fileUpLoad.fileUp(upfile, request));
		
		return mav;
	}
	
	
	@RequestMapping(value="file/submit2")
	public ModelAndView submit2(
			MultipartHttpServletRequest mm,
			HttpServletRequest request
			)
	{
		ModelAndView mav = new ModelAndView("file/submit");
		
		mav.addObject("number",mm.getParameter("number"));
		mav.addObject("ori",mm.getFile("upfile").getOriginalFilename());
		mav.addObject("sys",fileUpLoad.fileUp(mm.getFile("upfile"), request));
		
		return mav;
	}
	
	
	@RequestMapping(value="file/submit3")
	public String submit3(
			FileData fileData,
			HttpServletRequest request
			)
	{
		
		fileData.setSys(
				fileUpLoad.fileUp(fileData.getUpfile(), request)
		);
		
		return "file/submit3";
	}
}
