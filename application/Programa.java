package empresa.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import empresa.entities.Funcionario;
import empresa.entities.FuncionarioTerceirizado;

public class Programa {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    List<Funcionario> lista = new ArrayList<>();

    System.out.println("Cadastro de funcionários: ");
    System.out.println();
    System.out.print("Qual é a quntidade de funcionários a ser cadastrada? ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("Dados do funcionário #" + i + ":");
      System.out.print("O funcionário é terceirizado (s/n)? ");
      char terceirizado = sc.next().charAt(0);
      sc.nextLine();
      System.out.print("Nome do funcionário: ");
      String nome = sc.nextLine();
      System.out.print("Quantas horas para o funcionário: ");
      int horas = sc.nextInt();
      System.out.print("Valor da hora do funcionário: ");
      double valorHora = sc.nextDouble();
      if (terceirizado == 's') {
        System.out.print("Digite a despesa adicional do funcionário terceirizado: ");
        double despesaAdicional = sc.nextDouble();
        Funcionario func = new FuncionarioTerceirizado(nome, horas, valorHora, despesaAdicional);
        lista.add(func);
      } else {
        Funcionario func = new Funcionario(nome, horas, valorHora);
        lista.add(func);
      }
    }

    System.out.println();
    System.out.println("Pagamentos: ");
    for (Funcionario funcionario : lista) {
      System.out.println("Nome do funcionário: " + funcionario.getNome());
      System.out.println("Valores do funcionário: R$ " + String.format("%.2f", funcionario.pagamento()));
    }

    sc.close();
  }
}
