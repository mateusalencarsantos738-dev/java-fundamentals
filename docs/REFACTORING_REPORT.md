# Refactoring Report

## Estrutura Criada

- `src/main/java/com/mateus/javaexercises/exercises/fundamentals`: exercícios básicos de lógica, arrays, strings e matrizes.
- `src/main/java/com/mateus/javaexercises/exercises/oop`: exercícios de classes, encapsulamento e objetos.
- `src/main/java/com/mateus/javaexercises/exercises/oop/inheritance`: exercícios com herança e abstração.
- `src/main/java/com/mateus/javaexercises/examples`: exemplos isolados de POO, herança, polimorfismo e bônus de funcionários.

## Principais Renomeações

- `Teste22.java` -> `PersonConstructorDemo.java`
- `teste5.java` -> `PersonAddressCompositionDemo.java`
- `ativade01.java` -> `ArrayAccumulatedSumExercise.java`
- `atividade_2.java` -> `HollowSquarePrinter.java`
- `atividade_3.java` -> `BinaryToDecimalExercise.java`
- `atividade_6.java` -> `Mp3FileReferenceExercise.java`
- `questao_1.java` -> `TriangleTypeExercise.java`
- `questao_4.java` -> `PerfectNumberExercise.java`
- `questao_5.java` -> `SimpleCalculatorExercise.java`
- `questao_6.java` -> `FolderNameExtractorExercise.java`
- `questao_7.java` -> `DigitComparisonExercise.java`
- `questao_8.java` -> `BasicStatisticsExercise.java`
- `questao_9.java` -> `VectorSortingExercise.java`
- `questao_10.java` -> `PalindromeExercise.java`
- `questao_11.java` -> `MatrixDiagonalSumExercise.java`
- `questao_12.java` -> `SeriesSummationExercise.java`
- `atividade1.java` -> `BankAccountDemo.java`
- `Conta_bancaria.java` -> `BankAccount.java`
- `Livro.java` -> `Book.java`
- `empressa_main.java` -> `CompanyBonusDemo.java`
- `Animal_class.java` -> `AnimalPolymorphismDemo.java`
- `atividade_4.java` -> `AddressBookExercise.java`
- `atividade_5.java` -> `CalculatorInheritanceExercise.java`
- `atividade_6.java` -> `AnimalHierarchyExercise.java`
- `atividade_7.java` -> `GeometryInheritanceExercise.java`
- `atividade_8.java` -> `InvoiceExercise.java`
- `atividade_9.java` -> `EmployeeRegistryExercise.java`
- `atividade_10.java` -> `PersonEmployeeHierarchyExercise.java`
- `atividade_11.java` -> `VehicleHierarchyExercise.java`

## Melhorias Aplicadas

- Pacotes padronizados sob `com.mateus.javaexercises`.
- Classes públicas alinhadas com seus nomes de arquivo.
- Remoção de fontes vazias e duplicadas.
- Remoção de imports claramente não utilizados.
- Conversão de nomes genéricos para nomes descritivos em PascalCase.
- Ajuste de métodos e classes auxiliares package-private para nomenclatura mais clara.
- Inclusão de `.gitignore`, `LICENSE`, `pom.xml` e `README.md`.

## Problemas Encontrados

- O projeto original não estava inicializado como repositório Git.
- `javac` não está disponível no ambiente atual, então a compilação não pôde ser executada localmente.
- Havia arquivos vazios, pacotes com nomes incorretos e duplicação entre diretórios antigos.
- Alguns exercícios originais usam loops infinitos ou entrada interativa; esse comportamento foi preservado.

## Sugestões Futuras

- Instalar JDK e validar `mvn compile`.
- Separar cada modelo relevante em seu próprio arquivo quando o objetivo for evoluir além de exercícios.
- Criar testes automatizados para métodos sem dependência de console.
- Padronizar idioma dos identificadores restantes em uma etapa posterior, com testes cobrindo saídas de console.

