package formation.ib.demo.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import formation.ib.demo.backend.entities.Theme;
import formation.ib.demo.backend.repositories.ThemeRepository;

@Service
public class ThemeService {

	@Autowired
	ThemeRepository repository;

	public Theme save(Theme entity) {
		return repository.save(entity);
	}

	public List<Theme> findAll() {
		return repository.findAll();
	}

	public Theme findById(Long id) {
		return repository.findById(id)
				.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}

	public List<Theme> findByNom(String nom) {
		return repository.findByNom(nom);
	}
	
	
}
