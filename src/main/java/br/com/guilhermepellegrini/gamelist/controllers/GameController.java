package br.com.guilhermepellegrini.gamelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.guilhermepellegrini.gamelist.dto.GameDTO;
import br.com.guilhermepellegrini.gamelist.dto.GameMinDTO;
import br.com.guilhermepellegrini.gamelist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		return gameService.findById(id);
	}
	
	@GetMapping
	public List<GameMinDTO> fidAll() {
		return gameService.findAll();
	}
	
}
