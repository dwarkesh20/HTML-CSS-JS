package com.einfochips.demomvc.jspontroller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.demomvc.jdbc.UserDAO;
import com.einfochips.demomvc.model.User;

import jakarta.servlet.http.HttpServletRequest;

@Controller

public class jspController {

	@RequestMapping("index")
	public String index()
	{
		return "index.jsp";
	}
	
	@RequestMapping("register")
	public String register()
	{
		return "register.jsp";
	}

	@RequestMapping("login")
	public ModelAndView login()
	{
		return new ModelAndView("login.jsp");
	}

//	@RequestMapping("adddata")
//	public String adddata(HttpServletRequest req)
//	{
//		System.out.println(req.getParameter("name"));
//		System.out.println(req.getParameter("email"));
//		System.out.println(req.getParameter("date"));
//		return "done";
//	}
	
	
//	@RequestMapping("adddata")
//	public ModelAndView adddata(HttpServletRequest req)
//	{
//		ModelAndView mav = new ModelAndView("success.jsp");
//		
//		String name =  req.getParameter("name");
//		String email =  req.getParameter("email");
//		String pass =  req.getParameter("pass");
//		
//		mav.addObject("name", name);
//		mav.addObject("email", email);
//		
//		return mav;
//	}
	
	
	@RequestMapping("adddata")
	public ModelAndView adddata(@RequestParam (value = "name") String name, String email) throws Exception
	{
		ModelAndView mav = new ModelAndView("success.jsp");
		
		mav.addObject("name", name);
		mav.addObject("email", email);
		
		UserDAO dao = new UserDAO();
		User user = new User(name, email);
		dao.insert(user);
		return mav;
	}
		
	@RequestMapping("viewall")
	public ModelAndView view() throws Exception
	{
		ModelAndView mav = new ModelAndView("viewall.jsp");
		
		UserDAO dao = new UserDAO();
		
		List<User> li = dao.displayAll();
		
		mav.addObject("users", li);
		
		return mav;
	}
}
