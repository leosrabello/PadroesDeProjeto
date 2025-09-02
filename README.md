# Sistema de Gerenciamento de Biblioteca

Este projeto foi desenvolvido em **Java** como exercício de Programação Orientada a Objetos (POO).  
O objetivo é gerenciar diferentes tipos de materiais de uma biblioteca (livros, revistas e mídias digitais), aplicando os conceitos de **herança**, **interfaces** e **polimorfismo**.

---

## Funcionalidades

- Exibir informações de cada item da biblioteca (título, autor, ano).  
- Permitir **empréstimo** e **devolução** de itens.  
- Demonstrar **polimorfismo** ao manipular diferentes tipos de itens como uma única superclasse.  

---

## Estrutura do Projeto

```
src/
 └── biblioteca/
     ├── Borrowable.java
     ├── LibraryItem.java
     ├── Book.java
     ├── Magazine.java
     ├── DigitalMedia.java
     └── LibraryManagementSystem.java
```

---

## Exemplo de saída no console

```text
Título: 1984
Autor: George Orwell
Ano de publicação: 1949
O livro "1984" foi emprestado.
O livro "1984" foi devolvido.
Lendo amostra do livro "1984"...
-----------------------------------

Título: National Geographic
Autor: Vários
Ano de publicação: 2023
A revista "National Geographic" edição 10 foi emprestada.
A revista "National Geographic" edição 10 foi devolvida.
Folheando as páginas da revista "National Geographic"...
-----------------------------------

Título: Curso Java
Autor: Udemy
Ano de publicação: 2021
A mídia digital "Curso Java" foi baixada para uso.
A mídia digital "Curso Java" foi devolvida.
Reproduzindo a mídia digital "Curso Java" no formato MP4...
-----------------------------------
```

---

## Tecnologias utilizadas
- **Java 17+**  
- **IntelliJ IDEA Community**  

---

## Aluno
Projeto desenvolvido por **Leonardo Silva Rabello**   
