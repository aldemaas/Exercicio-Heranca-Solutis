
# Atividade Herança - Solutis Dev Trail

Este projeto é uma aplicação simples em Java que demonstra a implementação de herança e polimorfismo utilizando classes que representam diferentes tipos de funcionários em uma organização. O projeto inclui as classes `Pessoa`, `Empregado`, `Administrador`, `Operario` e `Vendedor`.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

1. **Pessoa**:
   - Classe base que representa uma pessoa.
   - Atributos:
     - `nome` (String): Nome da pessoa.
     - `endereco` (String): Endereço da pessoa.
     - `telefone` (String): Telefone da pessoa.
   - Métodos:
     - Getters e setters para cada atributo.
     - Construtores: Um construtor padrão e outros sobrecarregados para inicializar diferentes conjuntos de atributos.

2. **Empregado** (subclasse de `Pessoa`):
   - Representa um funcionário da organização.
   - Atributos:
     - `codigoSetor` (int): Código do setor ao qual o empregado pertence.
     - `salarioBase` (double): Salário base do empregado.
     - `imposto` (double): Percentual de imposto retido do salário.
   - Métodos:
     - Getters e setters para cada atributo.
     - Construtores: Um construtor padrão e outro que inicializa todos os atributos.
     - `calcularSalario()`: Calcula o salário líquido do empregado após a dedução dos impostos.

3. **Administrador** (subclasse de `Empregado`):
   - Representa um administrador da organização.
   - Atributos adicionais:
     - `ajudaDeCusto` (double): Ajuda de custo para viagens, estadias, etc.
   - Métodos:
     - Getters e setters para `ajudaDeCusto`.
     - `calcularSalario()`: Redefine o método herdado para incluir a ajuda de custo no cálculo do salário líquido.

4. **Operario** (subclasse de `Empregado`):
   - Representa um operário da organização.
   - Atributos adicionais:
     - `valorProducao` (double): Valor monetário dos artigos produzidos pelo operário.
     - `comissao` (double): Percentual de comissão sobre o valor da produção.
   - Métodos:
     - Getters e setters para `valorProducao` e `comissao`.
     - `calcularSalario()`: Redefine o método herdado para incluir a comissão sobre o valor da produção no cálculo do salário líquido.

5. **Vendedor** (subclasse de `Empregado`):
   - Representa um vendedor da organização.
   - Atributos adicionais:
     - `valorVendas` (double): Valor monetário dos artigos vendidos pelo vendedor.
     - `comissao` (double): Percentual de comissão sobre o valor das vendas.
   - Métodos:
     - Getters e setters para `valorVendas` e `comissao`.
     - `calcularSalario()`: Redefine o método herdado para incluir a comissão sobre o valor das vendas no cálculo do salário líquido.

## Funcionamento

Este projeto utiliza a herança para modelar uma hierarquia de classes que representam diferentes tipos de funcionários em uma organização. Cada classe tem seus próprios atributos e métodos, mas também herda e estende o comportamento da classe superior na hierarquia.

- **Pessoa** é a classe base que define os atributos comuns a todas as pessoas, como nome, endereço e telefone.
- **Empregado** é uma subclasse de `Pessoa` que adiciona atributos e métodos específicos para representar um funcionário, incluindo o cálculo do salário líquido após dedução de impostos.
- **Administrador** estende `Empregado` e adiciona o conceito de ajuda de custo, redefinindo o método `calcularSalario` para incluir esse valor no salário líquido.
- **Operario** e **Vendedor** também estendem `Empregado`, mas cada um adiciona um sistema de comissão baseado em sua produção ou vendas, respectivamente, que é somado ao salário base.

## Programa de Teste

Cada classe possui um programa de teste que demonstra seu funcionamento. Esses programas criam instâncias das classes, definem seus atributos e utilizam os métodos para calcular e exibir os salários, verificando assim se o comportamento está conforme esperado.



## Como Executar

1. **Clone o Repositório**: Faça o clone do repositório para sua máquina local.
2. **Compile o Projeto**: Compile todas as classes utilizando um compilador Java.
3. **Execute os Programas de Teste**: Cada classe tem seu próprio programa de teste para verificar o funcionamento dos métodos. Você pode executar esses programas individualmente.

## Requisitos

- Java JDK instalado (versão 8 ou superior).
- Um ambiente de desenvolvimento integrado (IDE) como IntelliJ IDEA, Eclipse, ou VSCode com extensão para Java.

## Conclusão

Este projeto demonstra a utilização de conceitos fundamentais da programação orientada a objetos, como herança, encapsulamento e polimorfismo, em um cenário simples de gestão de funcionários. As classes são projetadas de forma modular e extensível, permitindo fácil adição de novas funcionalidades ou tipos de funcionários.
