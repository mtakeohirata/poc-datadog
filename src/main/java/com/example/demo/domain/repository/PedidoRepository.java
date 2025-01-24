package com.example.demo.domain.repository;

import com.example.demo.domain.model.Pedido;
import java.util.List;
import java.util.Optional;

public interface PedidoRepository {
    Pedido salvar(Pedido pedido);
    Optional<Pedido> buscarPorId(String id);
    List<Pedido> buscarTodos();
    void deletarPorId(String id);
}