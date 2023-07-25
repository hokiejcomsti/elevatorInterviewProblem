import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTravelTimeServiceTest {

    @Test
    public void testCalculateTravelTimeService(){
        Integer startFloor = 12;
        List<String> floorsToVisit = Arrays.asList("2","9","1","32");

        assertEquals(560, CalculateTravelTimeService.calTravelTime(startFloor, floorsToVisit));
    }
}