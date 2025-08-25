package com.sandy.motionlog.controller;

import com.sandy.motionlog.model.AtividadeFisica;
import com.sandy.motionlog.service.AtividadeFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/atividades")
@CrossOrigin(origins = "*")
public class AtividadeFisicaController {

    @Autowired
    private AtividadeFisicaService atividadeFisicaService;

    @GetMapping
    public List<AtividadeFisica> getAll() {
        return atividadeFisicaService.findAll();
    }
}