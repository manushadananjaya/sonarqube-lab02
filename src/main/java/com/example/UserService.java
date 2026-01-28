package main.java.com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    // SECURITY ISSUE: Hardcoded credentials
    private String password = "admin123";

    // VULNERABILITY: SQL Injection
    public void findUser(String username) throws SQLException {

        try (Connection conn =
            DriverManager.getConnection("jdbc:mysql://localhost/db",
                    "root", password);
             Statement st = conn.createStatement()) {

            String query =
                "SELECT * FROM users WHERE name = '" + username + "'";

            st.executeQuery(query);
        }
    }

    // SMELL: Unused method
    public void notUsed() {
        logger.debug("I am never called");
    }
    
    public void deleteUser(String username) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db",
                "root", password);
             Statement st = conn.createStatement()) {
            String query = "DELETE FROM users WHERE name = '" + username + "'";
            st.execute(query);
        }
    }
}
