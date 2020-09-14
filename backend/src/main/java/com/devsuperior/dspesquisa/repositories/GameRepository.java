package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.devsuperior.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepositoryImplementation<Game, Long> {

	
}
