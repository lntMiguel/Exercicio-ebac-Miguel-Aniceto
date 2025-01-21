package br.com.miguel.ebac.animal_service.repository;
import br.com.miguel.ebac.animal_service.dto.CatDTO;
import br.com.miguel.ebac.animal_service.entidades.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface CatRepository extends JpaRepository<Cat, Integer> {

        @Query("""
SELECT new br.com.miguel.ebac.animal_service.dto.CatDTO(
        a.id, a.idadeEstimada, a.nomeProvisorio, a.condicoesChegada
        , a.funcionarioRecebedor, a.dataEntrada, a.dataAdocao, c.cor
        )
        FROM Cat c JOIN Animal a ON c.id = a.id 
        JOIN Funcionario f ON a.funcionarioRecebedor.id = f.id
        WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada
               """)
        List<CatDTO> findNotAdopted();

        @Query("""
SELECT new br.com.miguel.ebac.animal_service.dto.CatDTO(
        a.id, a.idadeEstimada, a.nomeProvisorio, a.condicoesChegada
        , a.funcionarioRecebedor, a.dataEntrada, a.dataAdocao, c.cor
        )
        FROM Cat c JOIN Animal a ON c.id = a.id 
        JOIN Funcionario f ON a.funcionarioRecebedor.id = f.id
        WHERE a.dataAdocao IS NOT NULL
               """)
        List<CatDTO> findAdopted();
}
