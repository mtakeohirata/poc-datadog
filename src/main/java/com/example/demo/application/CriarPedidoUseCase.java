package com.example.demo.application;

import com.example.demo.domain.model.Pedido;
import com.example.demo.domain.repository.PedidoRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CriarPedidoUseCase {
    private PedidoRepository repositorio;

    public CriarPedidoUseCase(PedidoRepository repositorio) {
        this.repositorio = repositorio;
    }

    public Pedido executar(String descricao) {
        String id = UUID.randomUUID().toString();
        Pedido pedido = new Pedido(id, descricao);
        return repositorio.salvar(pedido);
    }
}
