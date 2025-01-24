package com.example.demo.domain.repository.impl;

import com.example.demo.domain.model.Pedido;
import com.example.demo.domain.repository.PedidoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PedidoRepositoryImpl implements PedidoRepository {
    private final List<Pedido> pedidos = new ArrayList<>();

    @Override
    public Pedido salvar(Pedido pedido) {
        pedidos.removeIf(p -> p.getId().equals(pedido.getId()));
        pedidos.add(pedido);
        return pedido;
    }

    @Override
    public Optional<Pedido> buscarPorId(String id) {
        return pedidos.stream().filter(pedido -> pedido.getId().equals(id)).findFirst();
    }

    @Override
    public List<Pedido> buscarTodos() {
        return new ArrayList<>(pedidos);
    }

    @Override
    public void deletarPorId(String id) {
        pedidos.removeIf(pedido -> pedido.getId().equals(id));
    }
}