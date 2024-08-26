package test;

import classes.Administrador;

public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Carlos", "Rua do Sol, 789", "5555-9876", 102, 5000.0, 0.2, 1500.0);

        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código do Setor: " + administrador.getCodigoSetor());
        System.out.println("Salário Base: " + administrador.getSalarioBase());
        System.out.println("Imposto: " + (administrador.getImposto() * 100) + "%");
        System.out.println("Ajuda de Custo: " + administrador.getAjudaDeCusto());

        System.out.println("Salário Líquido: " + administrador.calcularSalario());

        administrador.setAjudaDeCusto(2000.0);

        System.out.println("Novo Salário Líquido: " + administrador.calcularSalario());
    }
}

