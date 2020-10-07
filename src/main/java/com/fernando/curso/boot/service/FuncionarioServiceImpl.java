package com.fernando.curso.boot.service;

import java.util.List;

import com.fernando.curso.boot.dao.FuncionarioDao;
import com.fernando.curso.boot.domain.Funcionario;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly=true)
public class FuncionarioServiceImpl implements FuncionarioService {

    private FuncionarioDao dao;

    @Override
    @Transactional(readOnly = false)
    public void salvar(Funcionario funcionario) {
        dao.save(funcionario);
    }

    @Override
    @Transactional(readOnly = false)
    public void editar(Funcionario funcionario) {
        dao.update(funcionario);
    }

    @Override
    @Transactional(readOnly = false)
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override
    public Funcionario buscarPorId(Long id) {
        
        return dao.findById(id);
    }

    @Override
    public List<Funcionario> buscarTodos() {
        
        return dao.findAll();
    }

}
