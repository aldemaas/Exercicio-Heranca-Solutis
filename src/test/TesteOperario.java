package test;

import classes.Operario;

public class TesteOperario {
    public static void main(String[] args) {
        Operario operario = new Operario("José", "Rua da Fábrica, 321", "5555-5432", 103, 2500.0, 0.1, 10000.0, 0.05);

        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código do Setor: " + operario.getCodigoSetor());
        System.out.println("Salário Base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + (operario.getImposto() * 100) + "%");
        System.out.println("Valor Produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + (operario.getComissao() * 100) + "%");

        System.out.println("Salário Líquido: " + operario.calcularSalario());

        operario.setValorProducao(15000.0);
        operario.setComissao(0.07); // 7% de comissão

        System.out.println("Novo Salário Líquido: " + operario.calcularSalario());
    }
}

