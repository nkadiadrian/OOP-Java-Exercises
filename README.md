# OOP-Java-Exercises
A collection of solutions for object orientated program exercises from https://www.inf.ed.ac.uk/teaching/courses/inf1/op/2020/labs/. The name of each directory corresponds to the "week" of the exercise.

The exercises linked also include instructions on how to run the programs.

## Running Individual Classes
Weeks 1 and 2 include .class files compiled from the .java main files by running the following command in the same directory.
```
javac <Class Name>.java
```
This can also be used to create the executable .class files for the .java files for the exercises in Week 3 onwards.

These can be used by simply running the executable .class files, without the file extension, as follows:
```
java <Class Name> <space separated arguments>
```

## Running Test Suites
Weeks 3 onwards include the source code as gradle projects. To run the tests for each week the project must first be built using the gradlew file in the Week's root directory e.g `OOP-Java-Exercises/Week3`

In Windows
```
gradlew.bat build
```

In Unix Based Systems (Linux and MacOS)
```
./gradlew build
```

The tests can then be run as follows:

In Windows
```
gradlew.bat test
```

In Unix Based Systems (Linux and MacOS)
```
./gradlew test
```
