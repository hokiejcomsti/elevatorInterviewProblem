## ASSUMPTIONS

- The parameters "start=" and "floor=" are required but can be in any order
- The start parameter is:
  - Only a single integer
- The floor parameter contains:
  - Only integers
  - Comma delimited

## TO RUN

To run the application:
1. Navigate to the src directory and compile:
   - ```javac -cp . main/java/*.java```
2. From the src, execute the calculator using the following:
   - ```java -cp . main/java/ElevatorTravelTimeCalc  start=<starting floor> floor=<floor1>,<floor2>,...,<floorn>```

