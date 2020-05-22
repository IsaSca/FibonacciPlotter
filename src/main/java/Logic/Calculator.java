package Logic;

import java.util.ArrayList;

public class Calculator {
  
  public ArrayList<Float> plotFib(int max) {
    ArrayList<Float> fibList = new ArrayList<>();
    float start = 0.0f;
    float addition = 1;
    float sum;
    fibList.add((int) start, addition);
    for(int i = 1; i < max; i++) {
      sum = start + addition;
      start = addition;
      addition = sum;
      fibList.add(sum);
    }
    return fibList;
  }
}
