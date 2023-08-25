package com.epam.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Utils should")
public class UtilsTest {

    @Nested
    class HaveAllPositiveNumbers {

        @Test
        void ifTheyAllArePositive() {
            ArrayList<String> numbers = new ArrayList<>() {{
                add("2");
                add("5");
                add("9");
                add("17");
            }};

            boolean got = Utils.isAllPositiveNumbers(numbers);

            assertTrue(got);
        }

    }

    class NotHaveAllPositiveNumbers {

        @Test
        void ifOneOfThemIsNegative() {
            ArrayList<String> numbers = new ArrayList<>() {{
                add("2");
                add("-5");
                add("9");
                add("17");
            }};

            boolean got = Utils.isAllPositiveNumbers(numbers);

            assertTrue(false);
        }

        @Test
        void ifOneOfThemIsZero() {
            ArrayList<String> numbers = new ArrayList<>() {{
                add("2");
                add("0");
                add("9");
                add("17");
            }};

            boolean got = Utils.isAllPositiveNumbers(numbers);

            assertTrue(false);
        }
    }
}
