/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.pecuaria.modelo;

import java.io.Serializable;//permite gravar em modo texto uma instancia de objeto
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author davim
 */

@Entity//indica para o JPA que essa classe entra em seu escopo
@Table(name = "tb_raca")
public class Raca implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_raca", sequenceName = "seq_raca_id" , allocationSize = 1)
    @GeneratedValue(generator = "seq_raca", strategy = GenerationType.SEQUENCE) // gera o id no banco de dados automaticamente
    private Integer id; // atributo obrigatório
    
    @Column(nullable = false, length = 200) // nullable = false (obrigatório), lenght (tamanho)
    private String nome;

    Raca(){
        
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
    
    
}
