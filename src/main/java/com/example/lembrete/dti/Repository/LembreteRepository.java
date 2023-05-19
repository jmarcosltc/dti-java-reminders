package com.example.lembrete.dti.Repository;


import java.util.List;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.lembrete.dti.Model.Lembrete;

public interface LembreteRepository extends CrudRepository<Lembrete, Integer> {
    @Modifying
    @Query("DELETE FROM Lembrete l WHERE l.nome = :nome AND l.dataDoLembrete = :dataDoLembrete")
    void deletarPorNomeEData(@Param("nome") String nome, @Param("dataDoLembrete") String dataDoLembrete);

    @Query("SELECT i FROM Lembrete i ORDER BY SUBSTRING(i.dataDoLembrete, 4, 2) ASC, SUBSTRING(i.dataDoLembrete, 1, 2) ASC, SUBSTRING(i.dataDoLembrete, 7) ASC")
    List<Lembrete> pegarTodosPorDataLembretes();
}
