package apiCotacaoSoja.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Arroz {

	@RestController
	@RequestMapping("/v1/pessoas")
	public class Arroz {
		
		@Autowired
		private Arroz repository;
		
		@GetMapping
		public ResponseEntity<List<Arroz>> listArroz() {	
	       	return ResponseEntity.
				   status(HttpStatus.OK).
				   body( repository.findAll() );
		}
		
		@PostMapping()
		public void salvarArroz(@RequestBody Arroz p) {
			repository.save(p);
		}

	}
	
}
