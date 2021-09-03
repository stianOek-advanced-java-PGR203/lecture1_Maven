package no.pingpong;

import org.junit.jupiter.api.Test;

import static no.pingpong.RomanConvert.toRoman;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanConverterTest {

    @Test
    void shouldConvert1ToI() {
        assertEquals("I",toRoman(1));
    }
    @Test
    void shouldConvert2ToII() {
        assertEquals("II",toRoman(2));
    }
    @Test
    void shouldConvert3ToIII() {
        assertEquals("III",toRoman(3));
    }
    @Test
    void shouldConvert4ToIV() {
        assertEquals("IV",toRoman(4));
    }
    @Test
    void shouldConvert5ToV() {
        assertEquals("V",toRoman(5));
    }
    @Test
    void shouldConvert6ToVI() {
        assertEquals("VI",toRoman(6));
    }
    @Test
    void shouldConvert7ToVII() {
        assertEquals("VII",toRoman(7));
    }
    @Test
    void shouldConvert8ToVIII() {
        assertEquals("VIII",toRoman(8));
    }
    @Test
    void shouldConvert9ToIX() {
        assertEquals("IX",toRoman(9));
    }
    @Test
    void shouldConvert10ToX() {
        assertEquals("X",toRoman(10));
    }
}
