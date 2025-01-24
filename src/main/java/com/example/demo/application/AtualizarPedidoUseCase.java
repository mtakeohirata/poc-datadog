package com.example.demo.application;

import com.example.demo.domain.model.Pedido;
import com.example.demo.domain.repository.PedidoRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AtualizarPedidoUseCase {
    private final PedidoRepository repositorio;

    public AtualizarPedidoUseCase(PedidoRepository repositorio) {
        this.repositorio = repositorio;
    }

    public Optional<Pedido> executar(String id, String descricao) {
        Optional<Pedido> pedidoExistente = repositorio.buscarPorId(id);
        if (pedidoExistente.isPresent()) {
            Pedido pedido = pedidoExistente.get();
            pedido.setDescricao(descricao);
            repositorio.salvar(pedido);
            return Optional.of(pedido);
        }
        return Optional.empty();
    }
}