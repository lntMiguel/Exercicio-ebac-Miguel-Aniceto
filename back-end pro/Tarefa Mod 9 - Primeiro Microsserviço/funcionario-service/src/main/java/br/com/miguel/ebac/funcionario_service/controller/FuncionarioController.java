package br.com.miguel.ebac.funcionario_service.controller;

import br.com.miguel.ebac.funcionario_service.DTO.FuncionarioDTO;
import br.com.miguel.ebac.funcionario_service.entidades.Funcionario;
import br.com.miguel.ebac.funcionario_service.repository.FuncionarioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private FuncionarioRepository repository;

    public FuncionarioController(FuncionarioRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    private List<FuncionarioDTO> rescuedPets(){
        LocalDate dataLimite = LocalDate.now().minusDays(365);
        return repository.countRescuedPets(dataLimite);
    }
}
