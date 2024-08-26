package test;

import classes.Empregado;

public class TesteEmpregado {
    public static void main(String[] args) {

        Empregado empregado = new Empregado("Maria", "Avenida Central, 456", "5555-6789", 101, 3000.0, 0.15);

        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Código do Setor: " + empregado.getCodigoSetor());
        System.out.println("Salário Base: " + empregado.getSalarioBase());
        System.out.println("Imposto: " + (empregado.getImposto() * 100) + "%");

        System.out.println("Salário Líquido: " + empregado.calcularSalario());

        empregado.setSalarioBase(3500.0);
        empregado.setImposto(0.18); // 18% de imposto

        System.out.println("Novo Salário Líquido: " + empregado.calcularSalario());
    }
}

