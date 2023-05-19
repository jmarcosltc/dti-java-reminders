package com.example.lembrete.dti.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lembrete")
public class Lembrete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "data_do_lembrete")
    private String dataDoLembrete;

    @Column(name = "nome")
    private String nome;
    
    public Lembrete() {}
    
    public Lembrete(String nome, String dataDoLembrete) {
        this.nome = nome;
        this.dataDoLembrete = dataDoLembrete;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    

    public String getDataDoLembrete() {
        return dataDoLembrete;
    }

    public void setDataDoLembrete(String dataDoLembrete) {
        this.dataDoLembrete = dataDoLembrete;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nData do Lembrete: " + this.dataDoLembrete + "\n";
    }
}
