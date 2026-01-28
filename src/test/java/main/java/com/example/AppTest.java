package main.java.com.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testAppExists() {
        App app = new App();
        assertNotNull(app);
    }

    @Test
    void testMainMethodThrowsSQLException() {
        // Since there's no actual database, the main method should throw SQLException
        assertThrows(SQLException.class, () -> {
            App.main(new String[]{});
        });
    }
    
    @Test
    void testCalculatorIntegration() {
        Calculator calc = new Calculator();
        // Test the actual code that would be called in main
        int result = calc.calculate(10, 5, "add-again");
        assertEquals(15, result);
    }
    
    @Test
    void testUserServiceInstantiation() {
        UserService service = new UserService();
        assertNotNull(service);
    }
}
