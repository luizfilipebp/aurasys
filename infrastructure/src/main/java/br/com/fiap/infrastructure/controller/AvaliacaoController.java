package br.com.fiap.infrastructure.controller;

import br.com.fiap.core.model.Avaliacao;
import br.com.fiap.infrastructure.entity.AvaliacaoEntity;
import br.com.fiap.infrastructure.service.AvaliacaoService;
import br.com.fiap.usecase.CadastrarAvaliacaoUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/avaliacoes")
@AllArgsConstructor
public class AvaliacaoController {

    private final AvaliacaoService avaliacaoService;

    private final CadastrarAvaliacaoUseCase cadastrarAvaliacaoUseCase;

    @PostMapping
    public ResponseEntity<Avaliacao> cadastrar(@RequestBody Avaliacao avaliacao) {
        return ResponseEntity.ok(cadastrarAvaliacaoUseCase.cadastrar(avaliacao));
    }

//    @PostMapping
//    public ResponseEntity<AvaliacaoEntity> salvarAvaliacao(@RequestBody AvaliacaoEntity avaliacao) {
//        return ResponseEntity.ok(avaliacaoService.salvarAvaliacao(avaliacao));
//    }

    @GetMapping("/profissional/{id}")
    public ResponseEntity<List<AvaliacaoEntity>> listarPorProfissional(@PathVariable Long id) {
        return ResponseEntity.ok(avaliacaoService.listarPorProfissional(id));
    }

    @GetMapping("/estabelecimento/{id}")
    public ResponseEntity<List<AvaliacaoEntity>> listarPorEstabelecimento(@PathVariable Long id) {
        return ResponseEntity.ok(avaliacaoService.listarPorEstabelecimento(id));
    }
}