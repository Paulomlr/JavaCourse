package dominio;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // @Column(name = "nomeCompleto") indica pro jpa que na hora que criar a tabela, utilizar esse nome indicado e não o mesmo nome da classe
    private String nome;
    private String email;

    public Pessoa() {
    }

    public Pessoa(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return id + ": " + nome + ", email: " + email;
    }
}