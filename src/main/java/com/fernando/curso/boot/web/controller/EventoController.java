package com.fernando.curso.boot.web.controller;

import com.fernando.curso.boot.domain.Evento;
import com.fernando.curso.boot.service.EventoService;
import com.fernando.curso.boot.service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/eventos")
public class EventoController {
    
    @Autowired
    private EventoService eventoService;

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping("/cadastrar")
    public String cadastrar(Evento evento){
        return "evento/cadastro";
    }

    @GetMapping("/listar")
    public String listar(ModelMap model){
        model.addAttribute("Eventos", eventoService.buscarTodos());
        return "evento/lista";
    }
}
