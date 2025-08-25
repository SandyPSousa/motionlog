package com.sandy.motionlog.controller;

import com.sandy.motionlog.model.RegistroAtividade;
import com.sandy.motionlog.service.RegistroAtividadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registros-atividade")
@CrossOrigin(origins = "*")
public class RegistroAtividadeController {

    @Autowired
    private RegistroAtividadeService registroAtividadeService;

    @PostMapping
    public ResponseEntity<RegistroAtividade> create(@RequestBody RegistroAtividade registroAtividade) {
        RegistroAtividade savedRegistro = registroAtividadeService.save(registroAtividade);
        return new ResponseEntity<>(savedRegistro, HttpStatus.CREATED);
    }
    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<RegistroAtividade>> getByUsuarioId(@PathVariable Long usuarioId) {
        List<RegistroAtividade> historico = registroAtividadeService.findByUsuarioId(usuarioId);
        return ResponseEntity.ok(historico);
    }
}