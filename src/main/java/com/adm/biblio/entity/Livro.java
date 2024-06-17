package com.adm.biblio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Livro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdLivro;
    
    @Column(nullable=false)
    private String titulo;
    
     @Column(nullable=false)
    private String autor;
     
     @Column(nullable=false)
    private String editora;
     
     @Column(nullable=false)
    private Integer ano;
}
