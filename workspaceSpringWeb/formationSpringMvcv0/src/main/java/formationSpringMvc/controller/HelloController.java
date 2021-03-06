package formationSpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {

		return "hello/hello"; // hello est le nom de la vue > hello.jsp dans le dossier hello
	}

	@RequestMapping("/hello2")
	public String hello2(Model model) {
		model.addAttribute("nom", "Tintin");
		return "hello/hello2";
	}

	@RequestMapping("/hello3")
	public String hello3(@RequestParam(value = "prenom") String prenom, Model model) {
		model.addAttribute("monPrenom", prenom);
		return "hello/hello3";
	}

}
