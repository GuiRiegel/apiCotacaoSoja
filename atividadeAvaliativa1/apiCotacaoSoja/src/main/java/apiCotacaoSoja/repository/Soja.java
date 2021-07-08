package apiCotacaoSoja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Soja extends JpaRepository<Soja, Long>{

	Arroz getByUuid(String uuid);
	
}