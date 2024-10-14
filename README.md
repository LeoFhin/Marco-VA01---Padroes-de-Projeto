## ALuno: Leonardo Santos de Lima
## Curso: Sistemas Para Internet
## Turma: 3B

# Sistema de Gerenciamento de Livros

Este é um sistema simples de gerenciamento de livros em uma biblioteca, implementado em Java, utilizando conceitos de Programação Orientada a Objetos (POO). O sistema permite que usuários emprestem e devolvam livros, além de visualizar a lista de livros disponíveis.

## Estrutura do Projeto

O projeto está organizado em pacotes para facilitar a manutenção e o entendimento do código:

- **Modelo**: Contém as classes principais do sistema.
  - `Livro`: Representa um livro, com atributos como título, autor e ano de publicação.
  - `Usuario`: Representa um usuário da biblioteca, com métodos para emprestar e devolver livros.
  - `Biblioteca`: Representa a biblioteca, com métodos para adicionar, remover e exibir livros.

- **Main**: Contém a classe principal que executa o sistema.
  - `Main`: Ponto de entrada do programa, onde as operações de empréstimo e devolução de livros são demonstradas.

## Funcionalidades

- **Adicionar Livros**: Possibilidade de adicionar novos livros à biblioteca.
- **Remover Livros**: Remoção de livros da biblioteca.
- **Emprestar Livros**: Usuários podem emprestar livros disponíveis.
- **Devolver Livros**: Usuários podem devolver livros que foram emprestados.
- **Exibir Livros Disponíveis**: Listagem dos livros atualmente disponíveis na biblioteca.
- **Exibir Livros Emprestados**: Listagem dos livros que o usuário possui emprestados.

