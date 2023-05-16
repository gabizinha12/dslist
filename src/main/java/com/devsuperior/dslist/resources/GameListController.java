package com.devsuperior.dslist.resources;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GameListService;
import com.devsuperior.dslist.services.GameService;


@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	
	private GameListService gameListService;
	
	private GameService gameService;

	public GameListService getGameService() {
		return gameListService;
	}

	public void setGameService(GameListService gameService) {
		this.gameListService = gameService;
	}

	public GameListController(GameListService gameListService, GameService gameService) {
		super();
		this.gameListService = gameListService;
		this.gameService = gameService;
	}
	

	
	public void setGameService(GameService gameService) {
		this.gameService = gameService;
	}

	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
		
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinDTO> result = gameService.findAll();
		return result;
		
	}
}
