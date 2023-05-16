package com.devsuperior.dslist.resources;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.services.GameListService;


@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	
	private GameListService gameListService;

	public GameListService getGameService() {
		return gameListService;
	}

	public void setGameService(GameListService gameService) {
		this.gameListService = gameService;
	}

	public GameListController(GameListService gameService) {
		super();
		this.gameListService = gameService;
	}
	

	
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
		
	}
}
