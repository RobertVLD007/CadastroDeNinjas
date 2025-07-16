package dev.java10x.CadastroDeNinja.ninjas;
import dev.java10x.CadastroDeNinja.missoes.MissaoModel;

// JPA -> Java Persistence API
import jakarta.persistence.*;

// LOMBOK
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

// ENTITY TRANSFORMA UMA CLASSE EM ENTIDADE NO BANCO DE DADOS
@Entity
@Table(name = "tb_cadastro")

@AllArgsConstructor
@NoArgsConstructor
@Data
public class  NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private int idade;

    private String cla;
    private String rank;
    private String tecnicas;


    // UM NINJA PODE TER UMA MISSÃO POR VEZ | MANY -> NINJAS / ONE -> MISSAO
    @ManyToOne
    @JoinColumn(name = "missao_id") // CHAVE ESTRANGEIRA
    private MissaoModel missao;

}
