package dev.java10x.CadastroDeNinja.missoes;
import dev.java10x.CadastroDeNinja.ninjas.NinjaModel;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_missao")

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String dificuldade;


    // UMA MISSÃO PODE TER VÁRIOS NINJAS | ONE -> MISSÃO / MANY -> NINJAS
    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninjas;

}
