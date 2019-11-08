package com.thp.spring.projetlibre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.projetlibre.entities.PizzeriaEntity;


@Transactional(propagation = Propagation.MANDATORY)
@Repository
public interface PizzeriaRepository extends JpaRepository <PizzeriaEntity, Long>{

}
