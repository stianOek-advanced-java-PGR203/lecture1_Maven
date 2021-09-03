package no.pingpong;

import org.junit.jupiter.api.Test;

import static no.pingpong.RomanConvert.toRomanLessThan11;
import static no.pingpong.RomanConvert.toRomanMoreThan10;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanConverterTest {

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", toRomanLessThan11(1));
    }
    @Test
    void shouldConvert2ToII() {
        assertEquals("II", toRomanLessThan11(2));
    }
    @Test
    void shouldConvert3ToIII() {
        assertEquals("III", toRomanLessThan11(3));
    }
    @Test
    void shouldConvert4ToIV() {
        assertEquals("IV", toRomanLessThan11(4));
    }
    @Test
    void shouldConvert5ToV() {
        assertEquals("V", toRomanLessThan11(5));
    }
    @Test
    void shouldConvert6ToVI() {
        assertEquals("VI", toRomanLessThan11(6));
    }
    @Test
    void shouldConvert7ToVII() {
        assertEquals("VII", toRomanLessThan11(7));
    }
    @Test
    void shouldConvert8ToVIII() {
        assertEquals("VIII", toRomanLessThan11(8));
    }
    @Test
    void shouldConvert9ToIX() {
        assertEquals("IX", toRomanLessThan11(9));
    }
    @Test
    void shouldConvert10ToX() {
        assertEquals("X", toRomanLessThan11(10));
    }
    @Test
    void shouldConvert11ToXI() {
        assertEquals("XI", toRomanMoreThan10(11));
    }
    @Test
    void shouldConvert19ToXIX() {
        assertEquals("XIX", toRomanMoreThan10(19));
    }
    @Test
    void shouldConvert20ToXX() {
        assertEquals("XX", toRomanMoreThan10(20));
    }
    @Test
    void shouldConvert37ToXXXVII() {
        assertEquals("XXXVII", toRomanMoreThan10(37));
    }
    @Test
    void shouldConvert39ToXXXIX() {
        assertEquals("XXXIX", toRomanMoreThan10(39));
    }
    @Test
    void shouldConvert40ToXL() {
        assertEquals("XL", toRomanMoreThan10(40));
    }


}
