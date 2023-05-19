package com.example.lembrete.dti.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.lembrete.dti.Model.Lembrete;
import com.example.lembrete.dti.Repository.LembreteRepository;
import jakarta.transaction.Transactional;

@Controller
@RequestMapping(path = "/v1")
public class LembreteController {

    @Autowired
    private LembreteRepository lembreteRepository;

    @GetMapping(path = "/lembrete")
    public @ResponseBody Iterable<Lembrete> getLembrete() {
        return lembreteRepository.pegarTodosPorDataLembretes();
    }

    @PostMapping(path = "/lembrete")
    public ResponseEntity<String> postLembrete(@RequestBody Lembrete lembrete) {

        lembreteRepository.save(lembrete);

        return ResponseEntity.ok("Lembrete inserido com sucesso!");
    }

    @DeleteMapping(path = "/lembrete")
    @Transactional
    public ResponseEntity<String> deleteLembrete(@RequestBody Lembrete lembrete) {

        lembreteRepository.deletarPorNomeEData(lembrete.getNome(), lembrete.getDataDoLembrete());

        return ResponseEntity.ok("Lembrete deletado.");
    }

}
