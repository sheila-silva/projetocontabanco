# Projeto conta banco / terminal bancário:
Este código implementa uma aplicação Java de console que simula a criação de uma conta bancária, solicitando dados ao usuário de forma interativa, validando as entradas e, ao final, exibindo as informações cadastradas.
<br>
<br>
[![License](https://img.shields.io/badge/license-MIT-green.svg?style=flat)](LICENSE)

<br>
<br>

**Visão geral do programa**

A classe ContaTerminal representa uma conta bancária simples, com os seguintes atributos:

-numero: número da conta

-agencia: número da agência

-nomeCliente: nome do titular da conta

-saldo: saldo inicial

O programa executa em modo terminal, interagindo com o usuário via Scanner.

<br>
<br>

**Fluxo de execução**
<br>

1. Inicialização da aplicação (main)
````
public static void main(String[] args) {
    ContaTerminal conta = new ContaTerminal();
    conta.solicitarDados();
    conta.exibirDados();
    System.out.println("\nConta criada com sucesso!");
}
````
-Cria um objeto ContaTerminal

-Solicita os dados da conta ao usuário

-Exibe os dados cadastrados

-Finaliza informando que a conta foi criada com sucesso

<br>
<br>

**Coleta e validação dos dados**

2. Método solicitarDados()

-Este método coordena toda a entrada de dados:

-Solicita o número da conta

-Solicita o número da agência

-Solicita o nome do cliente, com validação

-Solicita o saldo inicial

<br>
<br>

Cada campo é validado para evitar entradas inválidas.

-Validação de números inteiros

-Validação do número da agência

-Validação do nome do cliente

-Validação de números decimais (saldo)

-Método exibirDados()

<br>
<br>

**Este código:**

-Implementa uma aplicação Java orientada a objetos

-Utiliza validação de entrada de dados

-Evita exceções comuns com Scanner

-Simula o cadastro de uma conta bancária via terminal

<br>

**Demonstra boas práticas de:**

-Encapsulamento

-Validação de dados

-Interação com o usuário

<br>
<br>

# Agradecimentos / Referências 

Devsuperior - Escola de Programação 

<br>


----------


# Autora:

Sheila M. M. L. Silva 

https://www.linkedin.com/in/sheilasheila/










