package section21.examples.application;

import section21.examples.config.database.DB;
import section21.examples.exceptions.DbIntegratyException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteApplication {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB.getConnection();
            preparedStatement = connection.prepareStatement(
                    "DELETE FROM department " +
                            "WHERE Id = ?");
            preparedStatement.setInt(1, 2);

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Done! Rows affected: " + rowsAffected);
        } catch (SQLException exception) {
            throw new DbIntegratyException(exception.getMessage());
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }
    }
}
