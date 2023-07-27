package main.test;

import main.java.TravelTimeService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTravelTimeServiceTest {
    private static String STARTING_FLOOR_LBL = "start=";
    private static String FLOORS_TO_VISIT_LBL = "floor=";


    @Test
    public void testCalculateTravelTimeService(){
        Integer startFloor = 12;
        List<String> floorsToVisit = Arrays.asList("2","9","1","32");

        assertEquals(560, TravelTimeService.calTravelTime(startFloor, floorsToVisit));
    }

    @Test
    public void findStartingFloorParameter(){
        String startingFloor = "start=123";
        String floorToVisit = "floor=1,2,3";
        List<String> parametersWithStartingFloor =  Arrays.asList(startingFloor);
        List<String> parametersMissingStartingFloor = Arrays.asList(floorToVisit);
        List<String> parametersContainsBoth = Arrays.asList(floorToVisit, startingFloor);

        String parametersContainLabel = TravelTimeService.findParameter(STARTING_FLOOR_LBL, parametersWithStartingFloor);
        String parameterMissingLabel = TravelTimeService.findParameter(STARTING_FLOOR_LBL, parametersMissingStartingFloor);
        String parameterContainsBoth = TravelTimeService.findParameter(FLOORS_TO_VISIT_LBL, parametersContainsBoth);

        assertEquals(parametersContainLabel, startingFloor);
        assertEquals(parameterMissingLabel, null);
        assertEquals(parameterContainsBoth, floorToVisit);
    }
}