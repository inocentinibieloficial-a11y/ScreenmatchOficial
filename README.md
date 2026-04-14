# 🎬 ScreenmatchOficial

Sistema de gerenciamento de títulos de streaming desenvolvido em Java, aplicando os conceitos de **Programação Orientada a Objetos (POO)**.

## 📋 Sobre o projeto

O ScreenmatchOficial simula uma plataforma de streaming que permite cadastrar e gerenciar **filmes**, **séries** e **episódios**, calculando avaliações médias, tempo total de conteúdo e recomendações com base em classificação.

## ✨ Funcionalidades

- Cadastro de filmes e séries com nome, ano de lançamento e duração
- Sistema de avaliação com cálculo de média
- Cálculo do tempo total de uma lista de títulos
- Filtro de recomendação baseado na classificação do conteúdo
- Ordenação de títulos por nome
- Gerenciamento de episódios vinculados a séries

## 🏗️ Estrutura do projeto

```
src/
├── br/com/alura/
│   ├── calculos/
│   │   ├── CalculadoraDeTempo.java   # Soma duração de títulos
│   │   ├── Classificavel.java        # Interface de classificação
│   │   └── FiltroRecomendacao.java   # Filtra títulos por nota
│   ├── screematch/principal/
│   │   ├── Principal.java            # Classe principal (main)
│   │   ├── PrincipalComBusca.java
│   │   └── PrincipalComLista.java
│   └── screenmatchoficial/modelos/
│       ├── Titulo.java               # Classe base (superclasse)
│       ├── Filme.java                # Herda de Titulo
│       ├── Serie.java                # Herda de Titulo
│       └── Episodio.java             # Vinculado a uma Serie
```

## 🧠 Conceitos de POO aplicados

- **Herança** — `Filme` e `Serie` herdam de `Titulo`
- **Interface** — `Classificavel` implementada por `Filme` e `Episodio`
- **Encapsulamento** — atributos privados com getters e setters
- **Polimorfismo** — `getDuracaoEmMinutos()` sobrescrito em `Serie`
- **Comparable** — `Titulo` implementa `Comparable<Titulo>` para ordenação

## 🛠️ Tecnologias

- Java
- IntelliJ IDEA
- Git / GitHub

## ▶️ Como executar

1. Clone o repositório:
```bash
git clone https://github.com/inocentinibiel/ScreenmatchOficial.git
```

2. Abra o projeto no IntelliJ IDEA (ou outra IDE Java)

3. Execute a classe `Principal.java`

## 👨‍💻 Autor

**Gabriel Inocentini**  
[LinkedIn](https://www.linkedin.com/in/gabrielspedini) • [GitHub](https://github.com/inocentinibiel)
