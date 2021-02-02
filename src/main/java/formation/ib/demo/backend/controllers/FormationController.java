package formation.ib.demo.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import formation.ib.demo.backend.entities.Formation;
import formation.ib.demo.backend.services.FormationService;

@RestController
@RequestMapping("formations")
@CrossOrigin
public class FormationController {

	@Autowired
	FormationService service;
	
	@GetMapping("")
	public List<Formation> findAll(){
		return this.service.findAll();
	}

	@GetMapping("titre/{titre}")
	public List<Formation> findByTitre(@PathVariable String titre) {
		return this.service.findByTitre(titre);
	}
	
	@GetMapping("description/{description}")
	public List<Formation> findByDescription(@PathVariable String description) {
		return this.service.findByDescription(description);
	}
	
	@GetMapping("{id}")
	public Formation findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping("")
	public Formation save(@RequestBody Formation entity) {
		return this.service.save(entity);
	}
}
