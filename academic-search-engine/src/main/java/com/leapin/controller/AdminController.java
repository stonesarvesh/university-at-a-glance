package com.leapin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.leapin.model.Institute;
import com.leapin.model.Program;



@Controller
@RequestMapping("/")
public class AdminController {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@RequestMapping(value="/saveProgram", method = RequestMethod.POST)
	public ModelAndView saveProgram(@ModelAttribute("program") Program program) {
		ModelAndView mv = new  ModelAndView("home");
		
		Query query = new Query();
		query.addCriteria(Criteria.where("instituteName").is(program.getInstituteName()).and("name").is(program.getName()));
		Program existing = mongoTemplate.findOne(query, Program.class);
		if (existing != null) {
			mv.addObject("msg", "This program already exists");
		} else {
			mongoTemplate.save(program);
			mv.addObject("msg", "Program saved sucucessfuly");
		}
		return mv;
	}

}
