package AccentureBootcamp.Day3Tasks.Task3_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateAccaunt {
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:/Users/qwer/eclipse-workspace/Java additional folder/Banking.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void updateMoney(String name, String balance) {
        String sql = "UPDATE Bank SET Balance = ? WHERE Name LIKE '"+name+"'";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, balance);
            pstmt.executeUpdate();
            System.out.println("Row is upadated");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insert(String name, String account) {
        String sql = "INSERT INTO Bank(Name, Account, Balance) VALUES(?, ?, ?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, account);
            pstmt.setString(3, "0.00");
            pstmt.executeUpdate();
            System.out.println("New account added");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
