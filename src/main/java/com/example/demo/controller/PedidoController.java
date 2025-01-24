package com.example.demo.controller;

import com.example.demo.application.AtualizarPedidoUseCase;
import com.example.demo.application.CriarPedidoUseCase;
import com.example.demo.application.DeletarPedidoUseCase;
import com.example.demo.application.ObterPedidoUseCase;
import com.example.demo.domain.model.Pedido;
import com.example.demo.domain.repository.impl.PedidoRepositoryImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    private CriarPedidoUseCase criarPedidoUseCase;
    private ObterPedidoUseCase obterPedidoUseCase;
    private AtualizarPedidoUseCase atualizarPedidoUseCase;
    private DeletarPedidoUseCase deletarPedidoUseCase;

    public PedidoController() {
        final PedidoRepositoryImpl repositorio = new PedidoRepositoryImpl();
        this.criarPedidoUseCase = new CriarPedidoUseCase(repositorio);
        this.obterPedidoUseCase = new ObterPedidoUseCase(repositorio);
        this.atualizarPedidoUseCase = new AtualizarPedidoUseCase(repositorio);
        this.deletarPedidoUseCase = new DeletarPedidoUseCase(repositorio);
    }

    @PostMapping
    public Pedido criarPedido(@RequestBody String descricao) {
        return criarPedidoUseCase.executar(descricao);
    }

    @GetMapping("/{id}")
    public Optional<Pedido> obterPedido(@PathVariable String id) {
        return obterPedidoUseCase.executar(id);
    }

    @GetMapping
    public List<Pedido> obterTodosPedidos() {
        return obterPedidoUseCase.executar();
    }

    @PutMapping("/{id}")
    public Optional<Pedido> atualizarPedido(@PathVariable String id, @RequestBody String descricao) {
        return atualizarPedidoUseCase.executar(id, descricao);
    }

    @DeleteMapping("/{id}")
    public void deletarPedido(@PathVariable String id) {
        deletarPedidoUseCase.executar(id);
    }
}