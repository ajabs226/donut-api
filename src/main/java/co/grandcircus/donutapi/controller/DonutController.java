package co.grandcircus.donutapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.donutapi.service.DonutApiService;

@Controller
public class DonutController {

	@Autowired
	DonutApiService ds;
	
	@RequestMapping("/")
	private String showIndex(Model model) {
		model.addAttribute("donuts", ds.getAllDonuts());
		return "index";
	}
	
	@RequestMapping("/donutInfo")
	private String showDonutInfo(Model model, @RequestParam Integer id) {
		model.addAttribute("donut", ds.getDonutById(id));
		return "donutInfo";
	}
}
