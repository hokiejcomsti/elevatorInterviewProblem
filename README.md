## ASSUMPTIONS

- The parameters "start=" and "floor=" are required but can be in any order
- The floor parameter are:
  - Integers
  - Comma delimited

## TO RUN

Navigate to the src the directory and compile: 
```
javac -cp . main/java/*.java
```

You will be able to run the application using the following:
```
java -cp . main/java/ElevatorTravelTimeCalc  start=<starting floor> floor=<floor1>,<floor2>,...,<floorn>
```

