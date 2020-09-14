package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.devsuperior.dspesquisa.entities.enums.Record;

public interface RecordRepository extends JpaRepositoryImplementation<Record, Long> {

	
}
