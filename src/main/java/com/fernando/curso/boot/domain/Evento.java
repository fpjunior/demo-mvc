package com.fernando.curso.boot.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@SuppressWarnings("serial")
@Entity
@Table(name = "EVENTO")
public class Evento extends AbstractEntity<Long>{

    @NotBlank
    @Size(max = 255, min = 3)
    @Column(nullable = false, unique = true)
    private String nome;

    @NotBlank
    @Size(max = 255, min = 3)
    @Column(nullable = false, unique = true)
    private String categoria;

    @PastOrPresent(message = "Data não pode ser maior que a data atual")
    @DateTimeFormat(iso = ISO.DATE)
    @Column(name = "data_inicio", nullable = false, columnDefinition = "DATE")
    private LocalDate dataInicio;

    @PastOrPresent(message = "Data não pode ser maior que a data atual")
    @DateTimeFormat(iso = ISO.DATE)
    @Column(name = "data_fim", nullable = false, columnDefinition = "DATE")
    private LocalDate dataFim;

    @NotNull(message = "teste")
    @ManyToOne
    @JoinColumn(name = "funcionario_id_fk")
    private Funcionario funcionario;

    @NotNull(message= "Status é obrigatório")
    @Column(nullable = false, length = 2)
    @Enumerated(EnumType.STRING)
    private status status;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public status getStatus() {
        return status;
    }

    public void setStatus(status status) {
        this.status = status;
    }
    
}
