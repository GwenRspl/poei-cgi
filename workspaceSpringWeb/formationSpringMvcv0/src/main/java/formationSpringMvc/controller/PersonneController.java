package formationSpringMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import formationSpringMvc.model.User;
import service.PersonneService;

@Controller
@RequestMapping("/personne")
public class PersonneController {

	@Autowired
	private PersonneService service;

	@RequestMapping("/getList")
	public String list(Model model) {
		model.addAttribute("liste", service	.getPersonneRepository()
											.findAll());
		return "personne/list";
	}

	@RequestMapping("/getList2")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("/personne/list", "liste", service	.getPersonneRepository()
																						.findAll());
		return modelAndView;
	}

	@GetMapping("/list3")
	public String m1(Model model) {
		model.addAttribute("u", new User());
		return "personne/list2";
	}

	@PostMapping("/list3")
	public ModelAndView m1(@ModelAttribute(name = "u") User user) {
		return new ModelAndView("personne/list3", "item", user);
	}

}
