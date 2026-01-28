package main.java.com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    private UserService userService;

    @BeforeEach
    public void setUp() {
        userService = new UserService();
    }

    @Test
    public void testFindUserThrowsSQLException() {
        assertThrows(Exception.class, () -> {
            userService.findUser("admin");
        });
    }

    @Test
    public void testFindUserWithSpecialCharacters() {
        assertThrows(Exception.class, () -> {
            userService.findUser("'; DROP TABLE users; --");
        });
    }

    @Test
    public void testDeleteUserThrowsSQLException() {
        assertThrows(Exception.class, () -> {
            userService.deleteUser("admin");
        });
    }

    @Test
    public void testDeleteUserWithSpecialCharacters() {
        assertThrows(Exception.class, () -> {
            userService.deleteUser("'; DROP TABLE users; --");
        });
    }

    @Test
    public void testNotUsedMethod() {
        assertDoesNotThrow(() -> {
            userService.notUsed();
        });
    }
}
