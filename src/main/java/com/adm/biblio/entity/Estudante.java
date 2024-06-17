
package com.adm.biblio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Estudante {
    
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long IdEstudante;
   
   @Column(nullable=false)
   private String nome;
   
    @Column(nullable=false)
    private Long senha;
   
   @Column(nullable=false)
   private Long matricula;
   
   @Column(nullable=false)
   private String email;
    
   @Column(nullable=true)
   private String telefone;
    
   @Column(nullable=false)
   private Date nascimento;

   //---------------------------------S&G---------------------------------------
   
    public Long getIdEstudante() {
        return IdEstudante;
    }

    public void setIdEstudante(Long IdEstudante) {
        this.IdEstudante = IdEstudante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getSenha() {
        return senha;
    }

    public void setSenha(Long senha) {
        this.senha = senha;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
   
   
}
