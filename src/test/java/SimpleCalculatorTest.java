import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour(){
        var calculator = new SimpleCalculator(); //since ver 10 java can infer what type object Simple calculator is
        //so you can just use var for local variables
        assertEquals(4,calculator.add(2,2));
    }

    @Test
    void threePlusSevenShouldEqualTen(){
        var calculator = new SimpleCalculator(); //since ver 10 java can infer what type object Simple calculator is
        //so you can just use var for local variables
        assertEquals(10,calculator.add(3,7));
    }
}