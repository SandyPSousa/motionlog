package com.sandy.motionlog.repository;

import com.sandy.motionlog.model.RegistroAtividade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistroAtividadeRepository extends JpaRepository<RegistroAtividade, Long> {
    List<RegistroAtividade> findByUsuarioId(Long usuarioId);
}
