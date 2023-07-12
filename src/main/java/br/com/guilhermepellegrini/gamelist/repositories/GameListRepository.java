package br.com.guilhermepellegrini.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guilhermepellegrini.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
