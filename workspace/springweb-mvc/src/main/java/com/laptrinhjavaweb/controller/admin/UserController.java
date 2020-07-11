package com.laptrinhjavaweb.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.service.IUserService;

@Controller(value = "userControllerOfAdmin")
public class UserController {

	@Autowired IUserService iUserService;
	
	@RequestMapping(value = "/quan-tri/nguoi-dung/danh-sach", method = RequestMethod.GET)
	public ModelAndView userPage(@RequestParam("page") int page,
								 @RequestParam("limit") int limit) {
		UserDTO userDTO = new UserDTO();
		userDTO.setPage(page);
		userDTO.setLimit(limit);
		userDTO.setTotalItem(iUserService.getTotalItem());
		ModelAndView mav = new ModelAndView("/admin/user/users");
		Pageable pageable = new PageRequest(page - 1, limit);
		int limitPage = userDTO.getLimit();
		int totalItem = userDTO.getTotalItem();
		userDTO.setTotalPage((int) Math.ceil((double)totalItem/limitPage));
		userDTO.setListResult(iUserService.findAll(pageable));
		mav.addObject("userDTO", userDTO);
		return mav;
	}
	
	@RequestMapping(value = "/quan-tri/nguoi-dung/them-moi", method = RequestMethod.GET)
	public ModelAndView createUser() {
		ModelAndView mav = new ModelAndView("/admin/user/create");
		return mav;
	}
}
