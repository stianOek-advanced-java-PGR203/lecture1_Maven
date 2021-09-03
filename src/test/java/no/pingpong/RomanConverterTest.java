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
}
