package com.sandy.motionlog.service;

import com.sandy.motionlog.model.RegistroAtividade;
import com.sandy.motionlog.repository.RegistroAtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroAtividadeService {

    @Autowired
    private RegistroAtividadeRepository registroAtividadeRepository;

    public RegistroAtividade save(RegistroAtividade registroAtividade) {
        return registroAtividadeRepository.save(registroAtividade);
    }

    public List<RegistroAtividade> findByUsuarioId(Long usuarioId) {
        return registroAtividadeRepository.findByUsuarioId(usuarioId);
    }
}