package br.com.miguel.ebac.animal_service.repository;


import br.com.miguel.ebac.animal_service.dto.DogDTO;
import br.com.miguel.ebac.animal_service.entidades.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DogRepository extends JpaRepository<Dog, Integer> {

    @Query("""
SELECT new br.com.miguel.ebac.animal_service.dto.DogDTO(
        a.id, a.idadeEstimada, a.nomeProvisorio, a.condicoesChegada
        , a.funcionarioRecebedor, a.dataEntrada, a.dataAdocao, d.raca, d.porte
        )
        FROM Dog d JOIN Animal a ON d.id = a.id 
        JOIN Funcionario f ON a.funcionarioRecebedor.id = f.id
        WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada
               """)    List<DogDTO> findNotAdopted();

    @Query("""
SELECT new br.com.miguel.ebac.animal_service.dto.DogDTO(
        a.id, a.idadeEstimada, a.nomeProvisorio, a.condicoesChegada
        , a.funcionarioRecebedor, a.dataEntrada, a.dataAdocao, d.raca, d.porte
        )
        FROM Dog d JOIN Animal a ON d.id = a.id 
        JOIN Funcionario f ON a.funcionarioRecebedor.id = f.id
        WHERE a.dataAdocao IS NOT NULL
               """)    List<DogDTO> findAdopted();
}