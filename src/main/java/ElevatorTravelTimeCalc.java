package main.java;

import java.util.Arrays;
import java.util.List;

public class ElevatorTravelTimeCalc {
    private static final String STARTING_FLOOR_LBL = "start=";
    private static final String FLOORS_TO_VISIT_LBL = "floor=";

    public static void main(String[] args) {
        try {
            List<String> streamArgs = Arrays.asList(args);
            String startingFloor = TravelTimeService.findParameter(STARTING_FLOOR_LBL, streamArgs);
            String floorsToVisit = TravelTimeService.findParameter(FLOORS_TO_VISIT_LBL, streamArgs);

            if (null == startingFloor) {
                System.out.println("Missing field: Start");
                return;
            } else if (null == floorsToVisit){
                System.out.println("Missing field: Floor");
                return;
            }

            startingFloor=startingFloor.substring(startingFloor.indexOf("=")+1);
            Integer intStartFloor = Integer.parseInt(startingFloor);

            floorsToVisit = floorsToVisit.substring(floorsToVisit.indexOf("=")+1);
            List<String> listOfFloors = Arrays.asList(floorsToVisit.split(","));

            long travelTime = TravelTimeService.calTravelTime(intStartFloor, listOfFloors);
            System.out.print(travelTime + " " + startingFloor + "," + floorsToVisit);
        } catch (Exception e) {
            System.out.println("Please provide valid integer values for start and floors");
        }
    }
}
