package empresa.entities;

public class FuncionarioTerceirizado extends Funcionario {
  private Double despesaAdicional;

  public FuncionarioTerceirizado() {
    super();
  }

  public FuncionarioTerceirizado(String nome, Integer horas, Double valorHora, Double despesaAdicional) {
    super(nome, horas, valorHora);
    this.despesaAdicional = despesaAdicional;
  }

  public Double getDespesaAdicional() {
    return despesaAdicional;
  }

  public void setDespesaAdicional(Double despesaAdicional) {
    this.despesaAdicional = despesaAdicional;
  }

  public Double pagamento() {
    return super.pagamento() + despesaAdicional * 1.1;
  }

}
