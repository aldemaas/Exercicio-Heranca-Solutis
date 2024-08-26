package test;

import classes.Fornecedor;

public class TesteFornecedor {
    public static void main(String[] args) {

        Fornecedor fornecedor = new Fornecedor("João", "Rua das Flores, 123", "5555-1234", 10000.0, 4500.0);

        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Valor Crédito: " + fornecedor.getValorCredito());
        System.out.println("Valor Dívida: " + fornecedor.getValorDivida());

        System.out.println("Saldo: " + fornecedor.obterSaldo());

        fornecedor.setValorCredito(15000.0);
        fornecedor.setValorDivida(5000.0);

        System.out.println("Novo Saldo: " + fornecedor.obterSaldo());
    }
}
