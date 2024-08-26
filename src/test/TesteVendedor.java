package test;

import classes.Vendedor;

public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Ana", "Rua do Comércio, 456", "5555-9876", 104, 3000.0, 0.1, 20000.0, 0.05);

        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Código do Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Imposto: " + (vendedor.getImposto() * 100) + "%");
        System.out.println("Valor Vendas: " + vendedor.getValorVendas());
        System.out.println("Comissão: " + (vendedor.getComissao() * 100) + "%");

        System.out.println("Salário Líquido: " + vendedor.calcularSalario());

        vendedor.setValorVendas(30000.0);
        vendedor.setComissao(0.07); // 7% de comissão

        System.out.println("Novo Salário Líquido: " + vendedor.calcularSalario());
    }
}

