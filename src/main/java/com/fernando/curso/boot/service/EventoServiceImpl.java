package com.fernando.curso.boot.service;

import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

import com.fernando.curso.boot.dao.EventoDao;
import com.fernando.curso.boot.domain.Evento;

import org.springframework.stereotype.Service;

@Service
@Transactional(readOnly = true)
public class EventoServiceImpl implements EventoService {

    private EventoDao dao;

    public void salvar(Evento evento) {
        dao.save(evento);
    }

    @Override
    public void editar(Evento evento) {
        // TODO Auto-generated method stub

    }

    @Override
    public void excluir(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public Evento buscarPorId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Evento> buscarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Evento> buscarPorNomes(String nome) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Evento> buscarPorFuncionario(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Evento> buscarPorDatas(LocalDate inicio, LocalDate fim) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
