package com.fernando.curso.boot.dao;

import com.fernando.curso.boot.domain.Funcionario;

import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {
    
}
