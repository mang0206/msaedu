package com.example.microservice2.controller;

import java.util.List;
import com.example.microservice2.repository.EmpRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import lombok.RequiredArgsConstructor;
import com.example.microservice2.entity.Emp;

@Controller
@RequiredArgsConstructor
@RequestMapping("/test2")
public class EmpController {
	
	private final EmpRepository dao;
	
	@GetMapping("/countnum")
	public ModelAndView count() {
		ModelAndView mav = new ModelAndView();
		long num = dao.count();
		mav.addObject("num", num);
		mav.setViewName("empResult");
		return mav;
	}
	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<Emp> list = dao.findAll();
		list.parallelStream().forEach(System.out::println);
		mav.addObject("list", list);
		mav.setViewName("empResult");
		return mav;
	}
}
