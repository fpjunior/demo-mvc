package com.fernando.curso.boot.dao;

import java.time.LocalDate;
import java.util.List;

import com.fernando.curso.boot.domain.Evento;

public interface EventoDao {

    void save(Evento evento);

    void update(Evento evento);

    void delete(Long id);

    Evento findById(Long id);

    List<Evento> findAll();

    List<Evento> findByNome(String nome);

    List<Evento> findByFuncionarioId(Long id);

    List<Evento> findByDataInicioFim(LocalDate inicio, LocalDate fim);

    List<Evento> findByDataInicio(LocalDate inicio);

    List<Evento> findByDataFim(LocalDate fim);
    
}
