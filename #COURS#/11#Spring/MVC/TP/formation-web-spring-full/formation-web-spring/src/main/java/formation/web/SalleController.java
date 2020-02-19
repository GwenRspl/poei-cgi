package formation.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import formation.dao.IDaoSalle;
import formation.model.Salle;

@Controller
@RequestMapping("/salle")
public class SalleController {

	@Autowired
	private IDaoSalle daoSalle;

	public SalleController() {
		super();

	}

	@GetMapping({ "/", "/list" }) // ETAPE 1
	public String list(Model model) {
		List<Salle> salles = daoSalle.findAll(); // ETAPE 2

		model.addAttribute("mesSalles", salles); // ETAPE 3

		return "salle/salles"; // ETAPE 4
	}
}
