package br.com.william.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.william.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long> {
	
	Cambio findByFromAndTo(String from, String to);

}
