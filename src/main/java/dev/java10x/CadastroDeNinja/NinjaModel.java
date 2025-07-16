package dev.java10x.CadastroDeNinja;

// JPA -> Java Persistence API
import jakarta.persistence.*;

// ENTITY TRANSFORMA UMA CLASSE EM ENTIDADE NO BANCO DE DADOS
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private int idade;

    private String cla;
    private String rank;
    private String tecnicas;


    public NinjaModel() {}

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCla() {
        return cla;
    }
    public void setCla(String cla) {
        this.cla = cla;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getTecnicas() {
        return tecnicas;
    }
    public void setTecnicas(String tecnicas) {
        this.tecnicas = tecnicas;
    }
}
