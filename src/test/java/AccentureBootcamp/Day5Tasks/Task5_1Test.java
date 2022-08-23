package AccentureBootcamp.Day5Tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task5_1Test {
    @Test
    void twoPlusTwoShouldEqualFour() {
        var Task5_1= new Task5_1();
        assertEquals(4, Task5_1.add(2, 2));
    }

}