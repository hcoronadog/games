package com.evaluacion.games.infrastructure.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluacion.games.application.ports.GameServicePort;
import com.evaluacion.games.domain.model.Game;
import com.evaluacion.games.infrastructure.controllers.dto.GetGameResponse;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/games")

public class GameController {
	 private final GameServicePort gameServicePort;

	    public GameController(GameServicePort gameServicePort) {
	        this.gameServicePort = gameServicePort;
	    }

	    @GetMapping
	    public ResponseEntity<List<GetGameResponse>> getGamesList() {
	        List<GetGameResponse> games = gameServicePort.getAllGames().stream()
	                .map(game -> new GetGameResponse(
	                        game.getId(),
	                        game.getName()
	                ))
	                .collect(Collectors.toList());
	        return ResponseEntity.ok(games);
	    }

}
