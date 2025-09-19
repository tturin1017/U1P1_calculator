
# Java Gradle Testing Guide

This project uses Gradle and JUnit for automated testing.

## How to Run All Tests

Open a terminal in the project root and run:


./gradlew test or gradle test

## How to Run a Single Test Class

To run all tests in a specific class (e.g., `TipCalculatorTest`):

./gradlew test --tests com.example.TipCalculatorTest


## How to Run a Single Test Method
To run a specific test method (e.g., `testExtraCreditSimpleItems`):

```bash
./gradlew test --tests com.example.TipCalculatorTest.testExtraCreditSimpleItems
```

Happy testing!
