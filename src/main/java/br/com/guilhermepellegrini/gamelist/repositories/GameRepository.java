package br.com.guilhermepellegrini.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guilhermepellegrini.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

	
	
}
