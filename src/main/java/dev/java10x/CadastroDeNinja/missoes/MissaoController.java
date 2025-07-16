package dev.java10x.CadastroDeNinja.missoes;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/missoes")
public class MissaoController {

    @Autowired
    private MissaoService missaoService;

    @GetMapping
    public ArrayList<MissaoModel> listarMissao() {
        return missaoService.listarTodas();
    }

    @PostMapping
    public MissaoModel criar(@RequestBody MissaoModel missao) {
        return missaoService.salvar(missao);
    }

    @GetMapping("/dificuldade/{dificuldade}")
    public ArrayList<MissaoModel> buscarPorDificuldade(@PathVariable String dificuldade) {
        return  missaoService.buscarPorDificuldade(dificuldade);
    }

}
