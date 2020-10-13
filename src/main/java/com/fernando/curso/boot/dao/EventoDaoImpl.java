package com.fernando.curso.boot.dao;

import java.time.LocalDate;
import java.util.List;

import com.fernando.curso.boot.domain.Evento;

import org.springframework.stereotype.Repository;

@Repository
public class EventoDaoImpl extends AbstractDao<Evento, Long> implements EventoDao {

    public List<Evento> findByNome(String nome) {
        return createQuery("select e from Evento e where e.nome like concat('%', ?1, '%') ", nome);
    }

    @Override
    public List<Evento> findByFuncionarioId(Long id) {
        return createQuery("select e from evento e where e.funcionario.id = ?1", id);
    }

    @Override
    public List<Evento> findByDataInicioFim(LocalDate inicio, LocalDate fim) {
         String jpql = new StringBuilder("select e from Evento e ")
         .append("where e.dataInicio >= ?1 and e.dataFim <= ?2 ")
         .append("order by e.dataInicio asc")
         .toString();
        return createQuery(jpql, inicio, fim);
    }

    @Override
    public List<Evento> findByDataInicio(LocalDate inicio) {
        String jpql = new StringBuilder("select e from Evento e")
        .append("where e.dataInicio = ?1 ")
        .append("order by e.dataInicio asc")
        .toString();
        return createQuery(jpql, inicio);
    }

    @Override
    public List<Evento> findByDataFim(LocalDate fim) {
        String jpql = new StringBuilder("select e from Evento e")
        .append("where e.dataFim = ?1 ")
        .append("order by e.dataFim asc")
        .toString();
        return createQuery(jpql, fim);
    }
    
}
