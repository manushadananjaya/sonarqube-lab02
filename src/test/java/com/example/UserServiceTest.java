package main.java.com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}
