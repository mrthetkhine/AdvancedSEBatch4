package com.turing.advancedse4.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class TestFixtureWithParameterization {

	@ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testIntArray(int arg) {
		System.out.println("Test "+arg);
        assertTrue(arg > 0);
    }
	
	@ParameterizedTest
    @ValueSource(strings = {"Apple", "orange", "banana"})
    void testStringArray(String arg) {
		System.out.println("Test string "+arg);
        assertTrue(arg.length() > 0);
    }
	
	@ParameterizedTest
	@NullSource
	void isBlank_ShouldReturnTrueForNullInputs(String input) {
		System.out.println("Input "+input);
	    assertEquals(null, input);
	}
	
	@ParameterizedTest
	@EnumSource(value=Month.class,names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
	void getValueForAMonth_IsAlwaysBetweenOneAndTwelve(Month month) {
	    int monthNumber = month.getValue();
	    assertTrue(monthNumber >= 1 && monthNumber <= 12);
	}
	@ParameterizedTest(name = "#{index} - Test with String : {0}")
    @MethodSource("stringProvider")
    void test_method_string(String arg) {
        assertNotNull(arg);
    }

    // this need static
    static Stream<String> stringProvider() {
        return Stream.of("java", "rust");
    }
    
    @ParameterizedTest
    @MethodSource("stringIntAndListProvider")
    void testWithMultiArgMethodSource(String str, int length, List<String> list) {
        assertTrue(str.length() > 0);
        assertEquals(length, list.size());
    }

    static Stream<Arguments> stringIntAndListProvider() {
        return Stream.of(
                arguments("abc", 3, Arrays.asList("a", "b", "c")),
                arguments("lemon", 2, Arrays.asList("x", "y"))
        );
    }
    @ParameterizedTest
    @CsvSource({
            "java,      4",
            "clojure,   7",
            "python,    6"
    })
    void test_csv(String str, int length) {
        assertEquals(length, str.length());
    }
}
