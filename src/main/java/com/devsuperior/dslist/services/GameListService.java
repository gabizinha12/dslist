package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameListService {

	private GameListRepository gameListRepository;

	public GameListRepository getGameRepository() {
		return gameListRepository;
	}

	public void setGameRepository(GameListRepository gameRepository) {
		this.gameListRepository = gameRepository;
	}

	public GameListService(GameListRepository gameRepository) {
		super();
		this.gameListRepository = gameRepository;
	}
	


	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
	
	

}
