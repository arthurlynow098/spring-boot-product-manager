package com.projetofaculdade.demo.controller;

import com.projetofaculdade.demo.model.Produto;
import com.projetofaculdade.demo.model.ProdutoEspecial;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private List<Produto> produtos = new ArrayList<>();
    private List<ProdutoEspecial> produtosEspeciais = new ArrayList<>();
    private Long proximoId = 1L;

    @PostMapping
    public Produto cadastrarProduto(@RequestBody Produto p) {
        p.setId(proximoId++);
        produtos.add(p);
        return p;
    }

    @PostMapping("/especial")
    public ProdutoEspecial cadastrarEspecial(@RequestBody ProdutoEspecial pe) {
        pe.setId(proximoId++);
        produtosEspeciais.add(pe);
        return pe;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerProduto(@PathVariable Long id) {
        produtos.removeIf(p -> p.getId().equals(id));
        produtosEspeciais.removeIf(pe -> pe.getId().equals(id));
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> alterarProduto(@PathVariable Long id, @RequestBody Produto pAtualizado) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId().equals(id)) {
                pAtualizado.setId(id);
                produtos.set(i, pAtualizado);
                return ResponseEntity.ok(pAtualizado);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/especial/{id}")
    public ResponseEntity<ProdutoEspecial> alterarEspecial(@PathVariable Long id, @RequestBody ProdutoEspecial peAtualizado) {
        for (int i = 0; i < produtosEspeciais.size(); i++) {
            if (produtosEspeciais.get(i).getId().equals(id)) {
                peAtualizado.setId(id);
                produtosEspeciais.set(i, peAtualizado);
                return ResponseEntity.ok(peAtualizado);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public List<Object> listarTudo() {
        List<Object> todos = new ArrayList<>();
        todos.addAll(produtos);
        todos.addAll(produtosEspeciais);
        return todos;
    }
}