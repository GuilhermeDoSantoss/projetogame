package com.santos.projetogame.repositories;

import com.projetogame.projectgame.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
