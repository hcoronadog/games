package com.evaluacion.games.application.services;

import org.springframework.stereotype.Service;

import com.evaluacion.games.application.ports.GameServicePort;
import com.evaluacion.games.domain.model.Game;
import com.evaluacion.games.infrastructure.adapters.GameRepositoryAdapter;

import java.util.List;

@Service

public class GameServiceImpl implements GameServicePort {
	
	private final GameRepositoryAdapter gameRepositoryAdapter;

    public GameServiceImpl(GameRepositoryAdapter gameRepositoryAdapter) {
        this.gameRepositoryAdapter = gameRepositoryAdapter;
    }

    @Override
    public List<Game> getAllGames() {
        return gameRepositoryAdapter.findAllGames();
    }

}
