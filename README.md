# Java Exercises

Repositório de estudos em Java organizado como portfólio técnico. O projeto reúne exercícios de lógica, arrays, matrizes, strings, orientação a objetos, encapsulamento, composição, herança e polimorfismo.

## Objetivo

Manter uma coleção navegável de exercícios práticos, com nomes descritivos e pacotes por responsabilidade. A estrutura foi reorganizada para facilitar leitura no GitHub, execução individual das classes e evolução futura sem misturar exemplos, modelos e exercícios.

## Tecnologias

- Java 17
- Maven, para padronizar compilação quando disponível
- Biblioteca padrão do Java

## Estrutura

```text
src/
└── main/
    └── java/
        └── com/mateus/javaexercises/
            ├── examples/
            │   ├── company/basic/
            │   ├── inheritance/
            │   ├── oop/
            │   └── polymorphism/
            └── exercises/
                ├── fundamentals/
                └── oop/
                    ├── addressbook/
                    ├── employee/
                    ├── inheritance/
                    ├── invoice/
                    └── vehicles/
```

## Tópicos Estudados

- Entrada de dados com `Scanner`
- Condicionais, laços e operadores
- Vetores, ordenação e matrizes
- Strings e validações simples
- Classes, construtores, getters e setters
- Encapsulamento e composição
- Herança, sobrescrita e polimorfismo
- Métodos estáticos e contadores compartilhados

## Como Executar

Com Maven:

```bash
mvn compile
```

Para executar uma classe específica, use o nome totalmente qualificado. Exemplo:

```bash
mvn exec:java -Dexec.mainClass="com.mateus.javaexercises.exercises.fundamentals.SimpleCalculatorExercise"
```

Sem Maven, compile a partir da raiz do projeto:

```bash
javac -encoding UTF-8 -d out $(find src/main/java -name "*.java")
```

No Windows PowerShell:

```powershell
$files = Get-ChildItem -Recurse src/main/java -Filter *.java | ForEach-Object { $_.FullName }
javac -encoding UTF-8 -d out $files
```

Depois execute:

```bash
java -cp out com.mateus.javaexercises.exercises.fundamentals.SimpleCalculatorExercise
```

## Exemplos de Funcionalidades

- `TriangleTypeExercise`: classifica triângulos por lados.
- `BinaryToDecimalExercise`: converte valores binários para decimal.
- `BasicStatisticsExercise`: calcula média, moda e mediana.
- `BankAccountDemo`: demonstra operações simples de conta bancária.
- `VehicleHierarchyExercise`: demonstra especializações de veículos por herança.
- `CompanyBonusDemo`: calcula bônus com sobrescrita de método.

## Observações Técnicas

As classes foram reorganizadas estruturalmente sem reescrever os algoritmos originais. Algumas classes auxiliares permanecem package-private porque pertencem ao exercício principal do mesmo arquivo. Exercícios interativos podem ficar em loop conforme a implementação original.

