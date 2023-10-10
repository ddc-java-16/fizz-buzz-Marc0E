package edu.cnm.deepdive.fizzbuzz;

import java.util.EnumSet;
import java.util.Set;

public enum FizzBuzz {
  FIZZ, BUZZ;

  public static Set<FizzBuzz> valueOf(int value) {

    Set<FizzBuzz> result = EnumSet.noneOf(FizzBuzz.class);
    if (value % 3 == 0) {
      result.add(FIZZ);
    }
    if (value % 5 == 0) {
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
