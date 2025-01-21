package br.com.miguel.ebac.funcionario_service.DTO;

public class FuncionarioDTO {
    private Integer funcionarioId;
    private String funcionarioNome;
    private Long totalAnimaisResgatados;

    public FuncionarioDTO(String funcionarioNome,Integer funcionarioId, Long totalAnimaisResgatados) {
        this.funcionarioNome = funcionarioNome;
        this.totalAnimaisResgatados = totalAnimaisResgatados;
        this.funcionarioId = funcionarioId;
    }

    public Integer getFuncionarioId() {
        return funcionarioId;
    }

    public String getFuncionarioNome() {
        return funcionarioNome;
    }

    public Long getTotalAnimaisResgatados() {
        return totalAnimaisResgatados;
    }
}
