package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.devsuperior.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepositoryImplementation<Genre, Long> {

	
}
