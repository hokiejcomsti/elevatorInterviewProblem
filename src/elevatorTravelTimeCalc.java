import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class elevatorTravelTimeCalc {
    private static String STARTING_FLOOR_LBL = "start=";
    private static String FLOORS_TO_VISIT_LBL = "floor=";

    public static void main(String[] args) {

        // elevator start=12 floor=2,9,1,32
        // email example works
        // make it work
        if (args.length < 2) {
            System.out.println("Usage: java ElevatorTravelTimeCalculator <startingFloor> <floor1> <floor2> ...");
            return;
        }

        try {
            String startFloor = args[0];
            startFloor=startFloor.substring(startFloor.indexOf("=")+1);
            Integer intStartFloor = Integer.parseInt(startFloor);

            String floorsToVisit = args[1];
            floorsToVisit = floorsToVisit.substring(floorsToVisit.indexOf("=")+1);
            List<String> listOfFloors = Arrays.asList(floorsToVisit.split(","));

            int travelTime = CalculateTravelTimeService.calTravelTime(intStartFloor, listOfFloors);
            System.out.println("Total travel time: " + travelTime + " seconds");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please provide valid integer values for the floors.");
        }
    }



}
