package section21.examples.application;

import section21.examples.config.database.DB;
import section21.examples.exceptions.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateApplication {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DB.getConnection();
            connection.setAutoCommit(false);
            statement = connection.createStatement();

            int rowsAffectedUpdateId1 = statement.executeUpdate("UPDATE seller SET BaseSalary = 2090.0 WHERE DepartmentId = 1");

            int testToFail = 1;

            if (testToFail < 2) {
                throw new SQLException("Fake error");
            }

            int rowsAffectedUpdateId2 = statement.executeUpdate("UPDATE seller SET BaseSalary = 3090.0 WHERE DepartmentId = 2");

            connection.commit();

            System.out.println("rowsAffectedUpdateId1 = " + rowsAffectedUpdateId1);
            System.out.println("rowsAffectedUpdateId2 = " + rowsAffectedUpdateId2);
        } catch (SQLException exception) {
            try {
                connection.rollback();
                throw new DbException("Transaction rolled back! Caused by: " + exception.getMessage());
            } catch (SQLException exceptionRolback) {
                throw new DbException("Error trying to rollback! Caused by: " + exceptionRolback.getMessage());
            }
        } finally {
            DB.closeStatement(statement);
            DB.closeConnection();
        }
    }
}
