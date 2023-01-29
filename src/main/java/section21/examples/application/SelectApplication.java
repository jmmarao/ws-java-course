package section21.examples.application;

import section21.examples.config.database.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectApplication {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DB.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM department");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("Id") + ", " + resultSet.getString("Name"));
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        } finally {
            DB.closeResultSet(resultSet);
            DB.closeStatement(statement);
            DB.closeConnection();
        }
    }
}
