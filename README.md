[[_TOC_]]

## Exercice parser expressions arithmétiques

### Organisation du projet

* la grammaire : `parser/src/main/resources/SampleGrammar.g4`
* les classes générées par le parser : `parser/src/generated/java/fr/starter/antlr4/parser`
* le visitor à implémenter : `compiler/src/main/java/fr/starter/antlr4/compiler/CalculerExpression.java`
* les tests unitaires sur le visitor : `compiler/src/test/java/fr/starter/antlr4/compiler/CalculerExpressionTests.java`

### Configuration de l'environnement (avec [SdkMan](https://sdkman.io/)) 

```shell
sdk env install
```

### Générer les classes du parser

```shell
mvn clean compile -Pgenerate-parser
```

### Tester

```shell
mvn clean install -Pgenerate-parser
```