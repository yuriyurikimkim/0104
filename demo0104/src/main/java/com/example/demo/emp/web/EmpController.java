package com.example.demo.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.emp.mapper.EmpMapper;

@Controller
public class EmpController {
	
	@Autowired
	EmpMapper empMapper;
	
	//얘가 사용되려면 @Controller가 붙어야 함.
	@RequestMapping(value = "/empList", method = RequestMethod.GET)
	public String empList(Model model) {
		model.addAttribute("empList", empMapper.getEmpList(null));
		return "empList";
	}
}
