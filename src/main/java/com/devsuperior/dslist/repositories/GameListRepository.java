package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.*; 

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long> {
	

}
