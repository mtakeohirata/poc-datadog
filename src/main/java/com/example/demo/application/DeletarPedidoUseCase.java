package com.example.demo.application;

import com.example.demo.domain.repository.PedidoRepository;
import org.springframework.stereotype.Component;

@Component
public class DeletarPedidoUseCase {
    private final PedidoRepository repositorio;

    public DeletarPedidoUseCase(PedidoRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void executar(String id) {
        repositorio.deletarPorId(id);
    }
}