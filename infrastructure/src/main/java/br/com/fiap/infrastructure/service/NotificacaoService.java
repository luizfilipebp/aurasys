//package br.com.fiap.infrastructure.service;
//
//import br.com.fiap.infrastructure.entity.AgendamentoEntity;
//import br.com.fiap.infrastructure.repository.AgendamentoRepository;
//import lombok.AllArgsConstructor;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Service;
//
//import jakarta.mail.MessagingException;
//import jakarta.mail.internet.MimeMessage;
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Service
//@AllArgsConstructor
//public class NotificacaoService {
//
//    private final AgendamentoRepository agendamentoRepository;
//    private final JavaMailSender mailSender;
//
//    @Scheduled(cron = "0 0 9 * * ?") // Executa diariamente às 9h
//    public void enviarLembretes() {
//        List<AgendamentoEntity> agendamentos = agendamentoRepository.findByDataHoraBetween(
//                LocalDateTime.now(), LocalDateTime.now().plusDays(1)
//        );
//
//        agendamentos.forEach(agendamento -> {
//            try {
//                enviarEmail(agendamento.getClienteEmail(), "Lembrete de Agendamento",
//                        "Você tem um agendamento amanhã às " + agendamento.getDataHora());
//                enviarEmail(agendamento.getProfissionalEmail(), "Lembrete de Agendamento",
//                        "Você tem um agendamento amanhã às " + agendamento.getDataHora());
//            } catch (MessagingException e) {
//                e.printStackTrace();
//            }
//        });
//    }
//
//    private void enviarEmail(String destinatario, String assunto, String mensagem) throws MessagingException {
//        MimeMessage mail = mailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(mail, true);
//        helper.setTo(destinatario);
//        helper.setSubject(assunto);
//        helper.setText(mensagem, true);
//        mailSender.send(mail);
//    }
//}