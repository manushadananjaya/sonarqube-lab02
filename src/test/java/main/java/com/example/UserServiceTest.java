package main.java.com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserService();
    }

    @Test
    void testNotUsed() {
        assertDoesNotThrow(() -> userService.notUsed());
    }

    @Test
    void testUserServiceExists() {
        assertNotNull(userService);
    }
    
    @Test
    void testFindUserThrowsSQLException() {
        // Without a real database, this should throw SQLException
        assertThrows(SQLException.class, () -> {
            userService.findUser("testuser");
        });
    }
    
    @Test
    void testDeleteUserThrowsSQLException() {
        // Without a real database, this should throw SQLException
        assertThrows(SQLException.class, () -> {
            userService.deleteUser("testuser");
        });
    }
    
    @Test
    void testFindUserWithDifferentUsername() {
        // Test with different input to ensure method body is executed
        assertThrows(SQLException.class, () -> {
            userService.findUser("admin");
        });
    }
    
    @Test
    void testDeleteUserWithDifferentUsername() {
        // Test with different input to ensure method body is executed
        assertThrows(SQLException.class, () -> {
            userService.deleteUser("admin");
        });
    }
}
