package dev.java10x.CadastroDeNinja.missoes;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MissaoService {

    @Autowired
    private MissaoRepository missaoRepository;

    public ArrayList<MissaoModel> listarTodas() {
        return (ArrayList<MissaoModel>) missaoRepository.findAll();
    }

    public MissaoModel salvar(MissaoModel missao) {
        return missaoRepository.save(missao);
    }

    public ArrayList<MissaoModel> buscarPorDificuldade(String dificuldade) {
        return missaoRepository.findByDificuldade(dificuldade);
    }
}
