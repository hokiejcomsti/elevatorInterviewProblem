package main.java;

import java.util.List;

public class TravelTimeService {
    private static final Long TRAVEL_TIME_PER_FLOOR = 10L;
    public static long calTravelTime(int startFloor, List<String> floorsToVisit) {
        long travelTime = 0;
        int currentFloor = startFloor;

        for (String floor : floorsToVisit) {
            int intFloor = Integer.parseInt(floor);
            travelTime += Math.abs(currentFloor - intFloor) * TRAVEL_TIME_PER_FLOOR;
            currentFloor = intFloor;
        }

        return travelTime;
    }

    public static String findParameter(String paramToFind, List<String> args) {
        return args.stream()
                .filter(arg -> arg.contains(paramToFind))
                .findFirst().orElse(null);
    }
}
