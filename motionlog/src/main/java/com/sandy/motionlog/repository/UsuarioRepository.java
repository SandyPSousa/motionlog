//package com.sandy.motionlog.repository;
//
//import com.sandy.motionlog.model.Usuario;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
//}

package com.sandy.motionlog.repository;

import com.sandy.motionlog.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional; // Importe esta classe

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Novo método para buscar um usuário pelo email
    Optional<Usuario> findByEmail(String email);
}