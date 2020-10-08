package com.fernando.curso.boot.dao;

import java.util.List;

import com.fernando.curso.boot.domain.Funcionario;

import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {
    
    public List<Funcionario> findByNome(String nome) {
		
		return createQuery("select f from Funcionario f where f.nome like concat('%',?1,'%') ", nome);
	}
}
