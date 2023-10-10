package edu.cnm.deepdive.fizzbuzz;

import java.util.EnumSet;
import java.util.Set;

public class Main {

  private static final String FIZZ_RESULT = "fizz";
  private static final String BUZZ_RESULT = "buzz";
  private static final String FIZZ_BUZZ_RESULT = FIZZ_RESULT + BUZZ_RESULT;

  //psvm to create this
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      //String value = detectFizzBuzz(i); other option to do the same as below
      //System.out.println(value); other option to do the same as below
      Set<FizzBuzz> value = FizzBuzz.valueOf(i);
      System.out.println(value.isEmpty() ? i : value );
/*      boolean divisibleBy3 = (i % 3 == 0);
      boolean divisibleBy5 = (i % 5 == 0);
      if(divisibleBy3 || divisibleBy5){
        if(divisibleBy3) {
          System.out.print("Fizz");
        }
        if(divisibleBy5) {
          System.out.print("Buzz");
        }
      }
      else {
        System.out.print(i);
      }
      System.out.println(); */

    }
  }

  public enum FizzBuzz {
    FIZZ, BUZZ;

    public static Set<FizzBuzz> valueOf(int value) {

      Set<FizzBuzz> result = EnumSet.noneOf(FizzBuzz.class);
      if(value % 3 == 0) {
        result.add(FIZZ);
      }
      if(value % 5 == 0 ){
        result.add(BUZZ);
      }
      return result;
//    int remainder = i % 15;
//    return switch (remainder) {
//      case 0 -> FIZZ_BUZZ_RESULT;
//      case 3, 6, 9, 12 -> FIZZ_RESULT;
//      case 5, 10 -> BUZZ_RESULT;
//      default -> //doesn't have to be the last
//          String.valueOf(i);
//    };
    /*other way to do it
        String value = switch (remainder) {
      case 0 -> ("fizzbuzz");
      case 3, 6, 9, 12 -> ("fizz");
      case 5, 10 -> ("buzz");
      default -> //doesn't have to be the last
          String.valueOf(i);
    };
    return value;
     */
    }
  }
}
