package com.evaluacion.games.application.ports;

import java.util.List;

import org.springframework.stereotype.Service;

import com.evaluacion.games.domain.model.Game;

@Service
public interface GameServicePort {
	  List<Game> getAllGames();

}
