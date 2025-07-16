package dev.java10x.CadastroDeNinja.missoes;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissaoRepository extends JpaRepository<MissaoModel, Long> {
    ArrayList<MissaoModel> findByDificuldade(String dificuldade);
}
