package com.sandy.motionlog.service;

import com.sandy.motionlog.model.AtividadeFisica;
import com.sandy.motionlog.repository.AtividadeFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtividadeFisicaService {

    @Autowired
    private AtividadeFisicaRepository atividadeFisicaRepository;

    public List<AtividadeFisica> findAll() {
        return atividadeFisicaRepository.findAll();
    }
}