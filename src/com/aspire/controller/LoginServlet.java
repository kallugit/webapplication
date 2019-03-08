package com.aspire.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aspire.models.Login;

@Controller
public class LoginServlet {

//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		System.out.println("Request" + request);
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//
//		System.out.println("username:" + username);
//		System.out.println("password:" + password);
//
//		PrintWriter out = response.getWriter();
//
//		out.print("<html><body>");
//		out.println("<h2 align= center>U R Registered Successfull</h2>");
//		out.println("</body></html>");
//	}

	@RequestMapping(value = "/logins", method = RequestMethod.GET)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("login") Login login) {
		System.out.println("Hello");
		ModelAndView mav = new ModelAndView("welcome");
		return mav;

	}
	
	@RequestMapping(value = "/logins", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("login") Login login) {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		System.out.println("username:" + username);
		System.out.println("password:" + password);
		ModelAndView mav = new ModelAndView("welcome");

		mav.addObject("message", "Hello!!");

		return mav;
	}

}
