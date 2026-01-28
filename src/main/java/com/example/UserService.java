package main.java.com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    // SECURITY ISSUE: Hardcoded credentials
    private String password = "admin123";

    // VULNERABILITY: SQL Injection - FIXED using PreparedStatement
    public void findUser(String username) throws SQLException {

        try (Connection conn =
            DriverManager.getConnection("jdbc:mysql://localhost/db",
                    "root", password);
             PreparedStatement st = conn.prepareStatement("SELECT * FROM users WHERE name = ?")) {

            st.setString(1, username);
            st.executeQuery();
        }
    }

    // SMELL: Unused method
    public void notUsed() {
        logger.debug("I am never called");
    }
    
    public void deleteUser(String username) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db",
                "root", password);
             PreparedStatement st = conn.prepareStatement("DELETE FROM users WHERE name = ?")) {
            st.setString(1, username);
            st.execute();
        }
    }
}
