package personas.jdbc;

import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {
    

    private static final String JDBC_STRING = "";
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";
    
    public static DataSource getDataSource(){
    BasicDataSource ds = new BasicDataSource();
    ds.setUrl(JDBC_URL);
    ds.setUsername(JDBC_URL);
    ds.setPassword(JDBC_PASSWORD);
    //definicimos el tamano inicial del pool de conexiones, tener en cuenta cuantas conexiones necesitamos, demanda demasiados recursos 
    ds.setInitialSize(5);
    return ds;
    }

    //se reporta la exceocion en la firma del metodo thrwos
    public static Connection getConnection() throws SQLException {

        return getDataSource().getConnection();
    }

    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }

    public static void  close(Statement smtm) throws SQLException {
        smtm.close();
    }

    public static void close(PreparedStatement smtm) throws SQLException {
        smtm.close();
    }

    public static void close(Connection conn) throws SQLException {
        conn.close();
    }
}
