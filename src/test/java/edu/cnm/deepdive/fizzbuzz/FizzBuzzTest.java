package edu.cnm.deepdive.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.EnumSet;
import java.util.Set;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzTest {

  @DisplayName("Testing expected FIZZ:")
  @ParameterizedTest(name = "[{index}] Asserting that FizzBuzz.ValueOf({0} returns [FizzBuzz.FIZZ])")
  @ValueSource(ints = {3, 36, 9, 12})
  void valueOf_fizz(int value) {
    assertEquals(EnumSet.of(FizzBuzz.FIZZ), FizzBuzz.valueOf(value));
  }

  @DisplayName("Testing expected BUZZ:")
  @ParameterizedTest(name = "[{index}] Asserting that FizzBuzz.ValueOf({0} returns [FizzBuzz.BUZZ])")
  @ValueSource(ints = {5, 10, 50, 1555555555})
  void valueOf_buzz(int value) {
    assertEquals(EnumSet.of(FizzBuzz.BUZZ), FizzBuzz.valueOf(value));
  }

  @DisplayName("Testing expected FIZZBUZZ:")
  @ParameterizedTest(name = "[{index}] Asserting that FizzBuzz.ValueOf({0} returns [FizzBuzz.FIZZBUZZ])")
  @ValueSource(ints = {15, 30, 75})
  void valueOf_fizzbuzz(int value) {
    assertEquals(EnumSet.allOf(FizzBuzz.class), FizzBuzz.valueOf(value));
  }

  @DisplayName("Testing expected neither:")
  @ParameterizedTest(name = "[{index}] Asserting that FizzBuzz.ValueOf({0} returns [])")
  @ValueSource(ints = {1, 17, 34})
  void valueOf_none(int value) {
    assertEquals(EnumSet.noneOf(FizzBuzz.class), FizzBuzz.valueOf(value));
  }

  @ParameterizedTest(name = "[{index}] Asserting that FizzBuzz.ValueOf({0} returns {1})")
  @MethodSource("valueOfTestCases")
  void valueOf(int value, Set<FizzBuzz> expected) {
    assertEquals(expected, FizzBuzz.valueOf(value));
  }

  static Stream<Arguments> valueOfTestCases() {
    return Stream.of(
        Arguments.of(1, EnumSet.noneOf(FizzBuzz.class)),
        Arguments.of(17, EnumSet.noneOf(FizzBuzz.class)),
        Arguments.of(34, EnumSet.noneOf(FizzBuzz.class)),

        Arguments.of(18, EnumSet.of(FizzBuzz.FIZZ)),
        Arguments.of(27, EnumSet.of(FizzBuzz.FIZZ)),
        Arguments.of(96, EnumSet.of(FizzBuzz.FIZZ)),

        Arguments.of(25, EnumSet.of(FizzBuzz.BUZZ)),
        Arguments.of(55, EnumSet.of(FizzBuzz.BUZZ)),
        Arguments.of(95, EnumSet.of(FizzBuzz.BUZZ)),

        Arguments.of(15, EnumSet.allOf(FizzBuzz.class)),
        Arguments.of(105, EnumSet.allOf(FizzBuzz.class)),
        Arguments.of(1_455_555_555, EnumSet.allOf(FizzBuzz.class))
    );
  }
}
