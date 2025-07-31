//package br.com.fiap.api.controller;
//
//import br.com.fiap.core.model.valueobject.enums.ServicoBeleza;
//import br.com.fiap.infrastructure.entity.ProfissionalEntity;
//import br.com.fiap.infrastructure.repository.ProfissionalRepository;
//import lombok.AllArgsConstructor;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@AllArgsConstructor
//public class ServicoController {
//
//    private final ProfissionalRepository profissionalRepository;
//
//    @GetMapping("/servicos")
//    public List<ServicoBeleza> listarServicos() {
//        return List.of(ServicoBeleza.values());
//    }
//
//    @GetMapping("/disponibilidade")
//    public List<ProfissionalEntity> listarDisponibilidade(@RequestParam ServicoBeleza servico) {
//        return profissionalRepository.findByPerfilEspecialidades(servico);
//    }
//}