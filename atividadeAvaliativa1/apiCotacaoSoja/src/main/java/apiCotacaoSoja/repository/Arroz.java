package apiCotacaoSoja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Arroz extends JpaRepository<Arroz, Long>{

	Arroz getByUuid(String uuid);
	
}