package br.com.fiap.infrastructure.controller;

import br.com.fiap.core.model.Avaliacao;
import br.com.fiap.core.model.Estabelecimento;
import br.com.fiap.core.model.Page;
import br.com.fiap.core.model.valueobject.Endereco;
import br.com.fiap.core.model.valueobject.enums.ServicoBeleza;
import br.com.fiap.infrastructure.dto.EstabelecimentoDTO;
import br.com.fiap.infrastructure.mapper.EstabelecimentoMapper;
import br.com.fiap.usecase.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/estabelecimento")
@AllArgsConstructor
public class EstabelecimentoController {

    private final BuscarEstabelecimentoPelaAvaliacaoUseCase buscarPelaAvaliacaoUseCase;
    private final BuscarEstabelecimentoPeloEnderecoUseCase buscarPeloEnderecoUseCase;
    private final BuscarEstabelecimentoPeloNomeUseCase buscarPeloNomeUseCase;
    private final BuscarEstabelecimentoPeloServicoUseCase buscarPeloServicoUseCase;
    private final CadastrarEstabelecimentoUseCase cadastarEstabelecimentoUseCase;

    @GetMapping("avaliacao")
    public ResponseEntity<Page<Estabelecimento>> buscarPelaAvaliacao(
            @RequestParam Avaliacao avaliacao,
            @RequestParam(defaultValue = "0") int numeroPagina,
            @RequestParam(defaultValue = "10") int tamanhoPagina) {
        return ResponseEntity.ok(buscarPelaAvaliacaoUseCase.buscar(avaliacao, numeroPagina, tamanhoPagina));
    }

    @GetMapping("endereco")
    public ResponseEntity<Page<Estabelecimento>> buscarPeloEndereco(
            @RequestParam Endereco endereco,
            @RequestParam(defaultValue = "0") int numeroPagina,
            @RequestParam(defaultValue = "10") int tamanhoPagina) {
        return ResponseEntity.ok(buscarPeloEnderecoUseCase.buscar(endereco, numeroPagina, tamanhoPagina));
    }

    @GetMapping("nome")
    public ResponseEntity<Page<Estabelecimento>> buscarPeloNome(
            @RequestParam String nome,
            @RequestParam(defaultValue = "0") int numeroPagina,
            @RequestParam(defaultValue = "10") int tamanhoPagina) {
        return ResponseEntity.ok(buscarPeloNomeUseCase.buscar(nome, numeroPagina, tamanhoPagina));
    }

    @GetMapping("servico")
    public ResponseEntity<Page<Estabelecimento>> buscarPeloServicoUseCase(
            @RequestParam ServicoBeleza servicoBeleza,
            @RequestParam(defaultValue = "0") int numeroPagina,
            @RequestParam(defaultValue = "10") int tamanhoPagina) {
        return ResponseEntity.ok(buscarPeloServicoUseCase.buscar(servicoBeleza, numeroPagina, tamanhoPagina));
    }

    @PostMapping
    public ResponseEntity<EstabelecimentoDTO> cadastrarEstabelecimento(@RequestBody @Valid EstabelecimentoDTO dto) throws Exception {
        Estabelecimento estabelecimento = cadastarEstabelecimentoUseCase.cadastrar(EstabelecimentoMapper.INSTANCE.toModel(dto));
        return ResponseEntity.ok(EstabelecimentoMapper.INSTANCE.toDto(estabelecimento));
    }
}
