package com.evaluacion.games.infrastructure.adapters;

import org.springframework.stereotype.Component;
import com.evaluacion.games.domain.model.Game;
import com.evaluacion.games.repository.GameEntity;
import com.evaluacion.games.repository.GameRepository;



import java.util.List;
import java.util.stream.Collectors;

@Component
public class GameRepositoryAdapter {
    private final GameRepository gameRepository;

    public GameRepositoryAdapter(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> findAllGames() {
        return gameRepository.findAll()
                             .stream()
                             .map(entity -> new Game(entity.getId(), entity.getName()))  
                             .collect(Collectors.toList());
    }
}

