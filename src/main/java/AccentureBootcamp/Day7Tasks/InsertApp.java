package AccentureBootcamp.Day7Tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertApp {

    /**
     * Connect to the chinook.db database
     *
     * @return the Connection object
     */
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
     * Insert a new row into the media_types table
     *
     * @param name
     */
    public void insert(String name) {
        String sql = "INSERT INTO media_types(name) VALUES(?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.executeUpdate();
            System.out.println("New row "+name+" added to table");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
