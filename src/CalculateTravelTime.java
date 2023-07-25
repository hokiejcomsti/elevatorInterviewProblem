import java.util.List;

class CalculateTravelTimeService {
    private static Integer TRAVEL_TIME_PER_FLOOR = 10;
    public static Integer calTravelTime(Integer startFloor, List<String> floorsToVisit) {
        int travelTime = 0;
        int currentFloor = startFloor;

        for (String floor : floorsToVisit) {
            int intFloor = Integer.parseInt(floor);
            travelTime += Math.abs(currentFloor - intFloor) * TRAVEL_TIME_PER_FLOOR;
            currentFloor = intFloor;
        }

        return travelTime;
    }
}
