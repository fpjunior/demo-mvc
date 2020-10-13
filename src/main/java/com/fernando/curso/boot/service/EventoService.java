package com.fernando.curso.boot.service;

import java.time.LocalDate;
import java.util.List;

import com.fernando.curso.boot.domain.Evento;

public interface EventoService {

    void salvar(Evento evento);

    void editar(Evento evento);

    void excluir(Long id);

    Evento buscarPorId(Long id);

    List<Evento> buscarTodos();

    List<Evento> buscarPorNomes(String nome);

    List<Evento> buscarPorFuncionario(Long id);

    List<Evento> buscarPorDatas(LocalDate inicio, LocalDate fim);
}
