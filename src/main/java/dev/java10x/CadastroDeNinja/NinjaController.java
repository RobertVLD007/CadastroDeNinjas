package dev.java10x.CadastroDeNinja;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Boas Vindas!!! <br>Primeira mensagem nesta rota";
    }

}
