package com.laptrinhjavaweb.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "homeControllerOfWeb")
public class HomeController {

	@RequestMapping(value = "/trang-chu", method = RequestMethod.GET )
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("/web/home");
		return mav;
	}
	
	@RequestMapping(value = "/san-pham", method = RequestMethod.GET)
	public ModelAndView productsPage() {
		ModelAndView mav = new ModelAndView("/web/products");
		return mav;
	}
	
	@RequestMapping(value = "/dich-vu", method = RequestMethod.GET)
	public ModelAndView servicePage(){
		ModelAndView mav = new ModelAndView("/web/service");
		return mav;
	}
	
	@RequestMapping(value = "/lien-he", method = RequestMethod.GET)
	public ModelAndView contactPage() {
		ModelAndView mav = new ModelAndView("/web/contact");
		return mav;
	}
	
	@RequestMapping(value = "/thong-tin", method = RequestMethod.GET)
	public ModelAndView aboutPage() {
		ModelAndView mav = new ModelAndView("/web/about");
		return mav;
	}
}
