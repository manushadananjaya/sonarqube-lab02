package main.java.com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testMainMethodExecution() {
        assertDoesNotThrow(() -> {
            App.main(new String[]{});
        });
    }

    @Test
    public void testMainMethodWithArguments() {
        assertDoesNotThrow(() -> {
            App.main(new String[]{"arg1", "arg2"});
        });
    }
}
