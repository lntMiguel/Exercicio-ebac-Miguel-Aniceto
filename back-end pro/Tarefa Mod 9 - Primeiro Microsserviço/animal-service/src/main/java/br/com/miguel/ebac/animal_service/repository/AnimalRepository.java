package br.com.miguel.ebac.animal_service.repository;

import br.com.miguel.ebac.animal_service.dto.AnimalDTO;
import br.com.miguel.ebac.animal_service.entidades.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    @Query("""
        SELECT new br.com.miguel.ebac.animal_service.dto.AnimalDTO(
            a.id, a.idadeEstimada, a.nomeProvisorio, a.condicoesChegada, 
            a.funcionarioRecebedor, a.dataEntrada, a.dataAdocao, a.dataObito,
            a.especie)
        FROM Cat c JOIN Animal a ON c.id = a.id
    """)
    List<AnimalDTO> findAllCats();

    @Query("""
        SELECT new br.com.miguel.ebac.animal_service.dto.AnimalDTO(
            a.id, a.idadeEstimada, a.nomeProvisorio, a.condicoesChegada, 
            a.funcionarioRecebedor, a.dataEntrada, a.dataAdocao, a.dataObito,
            a.especie)
        FROM Dog d JOIN Animal a ON d.id = a.id
    """)
    List<AnimalDTO> findAllDogs();
}
