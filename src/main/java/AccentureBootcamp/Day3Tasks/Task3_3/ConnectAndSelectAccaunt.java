package AccentureBootcamp.Day3Tasks.Task3_3;

import java.sql.*;

public class ConnectAndSelectAccaunt {
    public double balance;
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
    public Double selectBalance(String name){
        String sql = "SELECT * FROM Bank WHERE Name LIKE '"+name+"'";


        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                balance= Double.parseDouble(rs.getString("Balance"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return balance;
    }

    public void showAccounts() {
        String sql = "SELECT Account FROM Bank";
        int nr= 1;

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                System.out.println(nr+". "+rs.getString("Account"));
                nr++;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }



}
