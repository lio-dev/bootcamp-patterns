package singleton;

import java.sql.Connection;

public class SingletonMain {

    public static void main(String[]arg){
        Connection conn = ConexionMySQL.getConnection();
        System.out.println(conn);

    }
}
