package com.evaluacion.games.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evaluacion.games.repository.GameEntity;

@Repository
public interface GameRepository extends JpaRepository<GameEntity, Integer> {

}
