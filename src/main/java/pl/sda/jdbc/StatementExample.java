package pl.sda.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname?serverTimezone=UTC", "root", "098POI!a");
//        createTable(connection);
        insert5newEmploye(connection);
    }

    static void createTable(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        statement.execute("CREATE TABLE employee5( \n"
                + "id smallint not null auto_increment,\n"
                + "name varchar(50),\n" +
                " salary int, \n" +
                "primary key(id))");

    }

    static void insert5newEmploye(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        for (int i = 0; i < 5; i++) {
            statement.executeUpdate("INSERT INTO employee5(name,salary) values ('name',1234)");
        }
    }
}
