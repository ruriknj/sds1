package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspesquisa.entities.enums.Record;

@Repository
public interface RecordRepository extends JpaRepositoryImplementation<Record, Long> {

	
}
