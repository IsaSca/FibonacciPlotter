package Logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

class CalculatorTest {
  
  Calculator fibCalculator;
  
  @BeforeEach
  public void setUp() {
    fibCalculator = new Calculator();
  }
  
  @Test
  public void testCalculate(){
    ArrayList<Float> testCalculate = fibCalculator.plotFib(50);
    Assertions.assertEquals(2.0f, testCalculate.get(2));
  }
}