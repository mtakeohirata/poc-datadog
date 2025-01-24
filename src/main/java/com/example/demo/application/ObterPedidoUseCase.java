package com.example.demo.application;

import com.example.demo.domain.model.Pedido;
import com.example.demo.domain.repository.PedidoRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ObterPedidoUseCase {
    private final PedidoRepository repositorio;

    public ObterPedidoUseCase(PedidoRepository repositorio) {
        this.repositorio = repositorio;
    }

    public Optional<Pedido> executar(String id) {
        return repositorio.buscarPorId(id);
    }

    public List<Pedido> executar() {
        return repositorio.buscarTodos();
    }
}