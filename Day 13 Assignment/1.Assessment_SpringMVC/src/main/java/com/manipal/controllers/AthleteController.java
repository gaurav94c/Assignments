package com.manipal.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.manipal.dao.AthleteDao;
import com.manipal.model.Athlete;

@Controller
public class AthleteController {
	@Autowired
	AthleteDao dao;

	@RequestMapping("/athleteform")
	public String showform(Model obj) {
		obj.addAttribute("command", new Athlete());
		return "athleteform";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("ath") Athlete ath) {
		dao.save(ath);
		return "redirect:/viewathlete";
	}

	@RequestMapping("/viewathlete")
	public String viewemp(Model obj) {
		List<Athlete> list = dao.getAthletes();
		obj.addAttribute("list", list);
		return "viewathlete";
	}

}