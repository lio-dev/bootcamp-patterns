package singleton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {

    private static Connection conn = null;
    private String driver;
    private String url;
    private String user;
    private String password;


    private ConexionMySQL(){

        String url = "jdbc:mysql://localhost:3306/test";
        String driver = "com.mysql.jdbc.Driver";
        String user = "user";
        String password = "password";

        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
            System.out.println("primera vez");
        }
    }
    public static Connection getConnection(){
        if (conn == null){
            new ConexionMySQL();
        }
        return conn;
    }


}

