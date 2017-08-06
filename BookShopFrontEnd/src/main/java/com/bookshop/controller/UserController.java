package com.bookshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bookshop.dao.UserDAO;
import com.bookshop.model.User;

@Controller
public class UserController {

	@Autowired
	UserDAO userDAO;

	// registration get method
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView getRegistrationForm() {
		ModelAndView mv = new ModelAndView("/register");
		User user = new User();
		mv.addObject("user", user);
		return mv;

	}

	// registration post method
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView postRegistrationForm(@ModelAttribute("user") User user) {
		ModelAndView mv = null;
		boolean flag = userDAO.register(user);

		if (flag) {
			mv = new ModelAndView("login");
			mv.addObject("welcome to login");
		}

		else {
			mv = new ModelAndView("register");
			mv.addObject("error");
		}
		return mv;

	}

	// Login get method
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView getLoginPage() {
		ModelAndView mv = new ModelAndView("/login");
		User user = new User();
		mv.addObject("user", user);
		return mv;

	}

	// Login post method
	/*
	 * @RequestMapping(value = "/login", method = RequestMethod.POST) public
	 * ModelAndView postForm(@ModelAttribute("user") User user) { ModelAndView
	 * mv = null; boolean flag = userDAO.login(user.getUsername(),
	 * user.getPassword());
	 * 
	 * if (flag) { mv = new ModelAndView("adminHome"); mv.addObject("sucessMsg",
	 * "welcome to admin Home Page"); }
	 * 
	 * else { mv = new ModelAndView("login"); mv.addObject("errorMsg",
	 * "Please provide correct credentials!"); } return mv;
	 * 
	 * }
	 */

	@RequestMapping("/login")
	public String login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model) {
		if (error != null)
			model.addAttribute("error", "Invalid username and password. Try again.");
		if (logout != null)
			model.addAttribute("logout", "Logout successful.");

		return "login";
	}

	@RequestMapping("/adminHome")
	public String adminHome() {
		return "adminHome";
	}

}
