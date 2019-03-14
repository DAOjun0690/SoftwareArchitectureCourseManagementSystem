package dbconn;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;

public class Dbcon {
    public final static String SACMS = "sacms";
    public final static String SACMS_CACHE = "sacms_cache";

    public static Connection getConnection(String dbName) {
//不能看
    }

    public static Connection getConnection(String dbName, String userName, String password) {
        try {
            String url = "jdbc:mysql://" + dbName + "?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC&useSSL=false";
//            String url = "jdbc:mysql://" + dbName + "?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC&useSSL=false";  //phpmyadmin
            DriverManager.registerDriver(new Driver());
            return DriverManager.getConnection(url, userName, password);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
