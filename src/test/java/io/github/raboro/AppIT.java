package io.github.raboro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author MariusWoerfel
 */
class AppIT {

    @Test
    void test() {
        assertEquals("t", App.getT());
    }
}