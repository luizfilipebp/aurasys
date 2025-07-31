package br.com.fiap.infrastructure.controller;

import br.com.fiap.infrastructure.entity.AgendamentoEntity;
import br.com.fiap.infrastructure.service.AgendamentoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/agendamentos")
@AllArgsConstructor
public class AgendamentoController {

    private final AgendamentoService agendamentoService;

    @GetMapping
    public ResponseEntity<List<AgendamentoEntity>> listarAgendamentos() {
        return ResponseEntity.ok(agendamentoService.listarTodos());
    }

    @PutMapping("/{id}/cancelar")
    public ResponseEntity<AgendamentoEntity> cancelarAgendamento(@PathVariable Long id) {
        return ResponseEntity.ok(agendamentoService.cancelar(id));
    }

    @PutMapping("/{id}/reagendar")
    public ResponseEntity<AgendamentoEntity> reagendarAgendamento(@PathVariable Long id, @RequestParam LocalDateTime novaDataHora) {
        return ResponseEntity.ok(agendamentoService.reagendar(id, novaDataHora));
    }

    @PutMapping("/{id}/nao-compareceu")
    public ResponseEntity<AgendamentoEntity> marcarNaoComparecimento(@PathVariable Long id) {
        return ResponseEntity.ok(agendamentoService.marcarNaoComparecimento(id));
    }
}