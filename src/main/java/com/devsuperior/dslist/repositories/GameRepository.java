package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.*; 

import com.devsuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long> {
	

}
