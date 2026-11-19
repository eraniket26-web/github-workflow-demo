package runner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testAddition() {
        App calculator = new App();
        assertEquals(10, calculator.add(5, 5));
    }
}
