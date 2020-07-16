package com.webapp.Jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.webapp.Jpa.Model.Person;
import com.webapp.Jpa.dao.PersonRepo;

@Controller
public class PersonController {

	@Autowired
	PersonRepo repo;
	@RequestMapping("/")
	public String home()
	{
		
		System.out.println("InpersonHomeCont");
		return "Home.jsp";
	}
	
	@RequestMapping("/addPerson")
	public String addPerson(Person person)
	{
		repo.save(person);
		System.out.println("InpersonHomeCont");
		return "Home.jsp";
	}
	
	@RequestMapping("/getPerson")
	public ModelAndView getPerson(@RequestParam int aid)
	{
		ModelAndView model = new ModelAndView("showView.jsp");
		Person person =repo.findById(aid).orElse(new Person());
		model.addObject(person);
		
		return model;
	}
	
	
}