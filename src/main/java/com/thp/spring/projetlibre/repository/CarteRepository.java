package com.thp.spring.projetlibre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thp.spring.projetlibre.entities.CarteEntity;

@Repository
public interface CarteRepository extends JpaRepository<CarteEntity, Long> {

}
