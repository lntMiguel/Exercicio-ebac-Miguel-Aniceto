package br.com.miguel.ebac.funcionario_service.repository;

import br.com.miguel.ebac.funcionario_service.DTO.FuncionarioDTO;
import br.com.miguel.ebac.funcionario_service.entidades.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;


public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

    @Query("SELECT new br.com.miguel.ebac.funcionario_service.DTO.FuncionarioDTO(f.nome, f.id, COUNT(a.id)) " +
            "FROM Funcionario f " +
            "LEFT JOIN Animal a ON f.id = a.funcionarioRecebedor.id " +
            "WHERE a.dataEntrada >= :dataLimite " + // Usando o parâmetro
            "GROUP BY f.id, f.nome " +
            "ORDER BY COUNT(a.id) DESC")
    List<FuncionarioDTO> countRescuedPets(@Param("dataLimite") LocalDate dataLimite);

}
