/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.OMT.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
/**
 *
 * @author ifam_
 */
@Entity
@Table(name = "Formulario")
public class Formulario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="titulo", nullable=false)
    private String titulo;
    
    @OneToMany
    @Column(name="entidade", nullable=false)
    private List<Entidade> entidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Entidade> getEntidade() {
        return entidade;
    }

    public void setEntidade(List<Entidade> entidade) {
        this.entidade = entidade;
    }
    
}