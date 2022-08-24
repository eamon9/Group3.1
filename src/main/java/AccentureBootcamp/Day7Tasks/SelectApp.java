package AccentureBootcamp.Day7Tasks;

import java.sql.*;

public class SelectApp {
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:/Users/qwer/eclipse-workspace/Java additional folder/chinook.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }


    /**
     * select all rows in the albums table
     */
    public void selectAll(){
        String sql = "SELECT Albumid, Title, Artistid FROM albums";

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("Albumid") +  "\t" +
                        rs.getString("Title") + "\t" +
                        rs.getDouble("Artistid"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        SelectApp app = new SelectApp();
        app.selectAll();
    }

}
