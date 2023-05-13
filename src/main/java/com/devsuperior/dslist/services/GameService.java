package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {

	private GameRepository gameRepository;

	public GameRepository getGameRepository() {
		return gameRepository;
	}

	public void setGameRepository(GameRepository gameRepository) {
		this.gameRepository = gameRepository;
	}

	public GameService(GameRepository gameRepository) {
		super();
		this.gameRepository = gameRepository;
	}

	public List<Game> findAll() {
		List<Game> result = gameRepository.findAll();
		return result;
	}

}
