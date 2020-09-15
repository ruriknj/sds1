package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspesquisa.entities.Game;

@Repository
public interface GameRepository extends JpaRepositoryImplementation<Game, Long> {

	
}

