package com.demo.H2Database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.demo.H2Database.Dao.StudentDao;
import com.demo.H2Database.model.Student;

@Controller
@ResponseBody
public class DatabaseController {
	
	@Autowired
	StudentDao stdDao;
	
	@RequestMapping("/massage")
	public List<Student> getMessage() {
		return stdDao.findAll();
	}
	
	
	@RequestMapping("/save")
	public String  savingStudent(@ModelAttribute("student")Student std) {
		Student save = stdDao.save(std);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("res", save);
		return  "home.jsp";
	}
}
