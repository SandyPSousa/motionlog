package com.sandy.motionlog.repository;

import com.sandy.motionlog.model.AtividadeFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtividadeFisicaRepository extends JpaRepository<AtividadeFisica, Long> {
}